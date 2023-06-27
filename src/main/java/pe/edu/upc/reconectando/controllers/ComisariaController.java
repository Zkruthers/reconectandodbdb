package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.ComisariaDTO;
import pe.edu.upc.reconectando.entities.Comisaria;
import pe.edu.upc.reconectando.services.IComisariaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comisarias")
public class ComisariaController {
    @Autowired
    private IComisariaService cS;

    @PostMapping
    public void insert(@RequestBody ComisariaDTO dto){
        ModelMapper m = new ModelMapper();
        Comisaria c = m.map(dto, Comisaria.class);
        cS.insert(c);
    }

    @GetMapping
    public List<ComisariaDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ComisariaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ComisariaDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ComisariaDTO dto = m.map(cS.listId(id), ComisariaDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ComisariaDTO dto){
        ModelMapper m = new ModelMapper();
        Comisaria c = m.map(dto, Comisaria.class);
        cS.insert(c);
    }
}
