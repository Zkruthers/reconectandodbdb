package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.RoleDTO;
import pe.edu.upc.reconectando.entities.Role;
import pe.edu.upc.reconectando.services.IRolService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private IRolService rS;


    @PostMapping
    public void insert(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }


    @GetMapping
    public List<RoleDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        Role role = rS.listId(id);

        role.setUser(null);

        rS.delete(id);
    }

    @GetMapping("/{id}")
    public RoleDTO listId(@PathVariable("id") Long id){
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.listId(id), RoleDTO.class);
        return dto;
    }


    @PutMapping
    public void goUpdate(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }

}
