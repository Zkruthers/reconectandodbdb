package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.UserDTO;
import pe.edu.upc.reconectando.entities.Users;
import pe.edu.upc.reconectando.services.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @Autowired
    private PasswordEncoder bcrypt;


    @PostMapping
    public void insert(@RequestBody UserDTO dto){

        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);

        String bcryptPassword = bcrypt.encode(u.getPassword());
        u.setPassword(bcryptPassword);

        uS.insert(u);
    }


    @PutMapping
    public void goUpdate(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);

        String bcryptPassword = bcrypt.encode(u.getPassword());
        u.setPassword(bcryptPassword);

        uS.insert(u);
    }


    @GetMapping
    public List<UserDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public UserDTO listId(@PathVariable("id") Long id){
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listId(id), UserDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        uS.delete(id);
    }

}
