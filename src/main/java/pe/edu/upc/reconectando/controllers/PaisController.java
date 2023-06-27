package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.PaisDTO;
import pe.edu.upc.reconectando.entities.Pais;
import pe.edu.upc.reconectando.services.IPaisService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private IPaisService pS;

    @PostMapping
    public void insert(@RequestBody PaisDTO dto){
        ModelMapper m = new ModelMapper();
        Pais p = m.map(dto, Pais.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PaisDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PaisDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PaisDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PaisDTO dto = m.map(pS.listId(id), PaisDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody PaisDTO dto){
        ModelMapper m = new ModelMapper();
        Pais p = m.map(dto, Pais.class);
        pS.insert(p);
    }
}
