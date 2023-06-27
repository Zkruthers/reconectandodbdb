package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.ComisariaxresponsableDTO;
import pe.edu.upc.reconectando.entities.Comisariaxresponsable;
import pe.edu.upc.reconectando.services.IComisariaxresponsableService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comisariaxresponsable")
public class ComisariaxresponsableController {
    @Autowired
    private IComisariaxresponsableService crS;

    @PostMapping
    public void insert(@RequestBody ComisariaxresponsableDTO dto){
        ModelMapper m = new ModelMapper();
        Comisariaxresponsable cr = m.map(dto, Comisariaxresponsable.class);
        crS.insert(cr);
    }

    @GetMapping
    public List<ComisariaxresponsableDTO> list(){
        return crS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ComisariaxresponsableDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        crS.delete(id);
    }

    @GetMapping("/{id}")
    public ComisariaxresponsableDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ComisariaxresponsableDTO dto = m.map(crS.listId(id), ComisariaxresponsableDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ComisariaxresponsableDTO dto){
        ModelMapper m = new ModelMapper();
        Comisariaxresponsable cr = m.map(dto, Comisariaxresponsable.class);
        crS.insert(cr);
    }
}
