package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.ResponsableDTO;
import pe.edu.upc.reconectando.entities.Responsable;
import pe.edu.upc.reconectando.services.IResponsableService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/responsables")
public class ResponsableController {
    @Autowired
    private IResponsableService rS;

    @PostMapping
    public void insert(@RequestBody ResponsableDTO dto){
        ModelMapper m = new ModelMapper();
        Responsable r = m.map(dto, Responsable.class);
        rS.insert(r);
    }

    @GetMapping
    public List<ResponsableDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ResponsableDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public ResponsableDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ResponsableDTO dto = m.map(rS.listId(id), ResponsableDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ResponsableDTO dto){
    ModelMapper m = new ModelMapper();
    Responsable r = m.map(dto, Responsable.class);
    rS.insert(r);
    }

}
