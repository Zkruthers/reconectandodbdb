package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.CiudadDTO;
import pe.edu.upc.reconectando.entities.Ciudad;
import pe.edu.upc.reconectando.services.ICiudadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {
    @Autowired
    private ICiudadService cS;

    @PostMapping
    public void insert(@RequestBody CiudadDTO dto){
        ModelMapper m = new ModelMapper();
        Ciudad c = m.map(dto, Ciudad.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CiudadDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CiudadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CiudadDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CiudadDTO dto = m.map(cS.listId(id), CiudadDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody CiudadDTO dto){
        ModelMapper m = new ModelMapper();
        Ciudad c = m.map(dto, Ciudad.class);
        cS.insert(c);
    }
}
