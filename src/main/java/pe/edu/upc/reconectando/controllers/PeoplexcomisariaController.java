package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.PeoplexcomisariaDTO;
import pe.edu.upc.reconectando.dtos.comisariaPeopleDTO;
import pe.edu.upc.reconectando.entities.Peoplexcomisaria;
import pe.edu.upc.reconectando.services.IPeoplexcomisariaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/peoplexcomisaria")
public class PeoplexcomisariaController {
    @Autowired
    private IPeoplexcomisariaService pcS;

    @PostMapping
    public void insert(@RequestBody PeoplexcomisariaDTO dto){
        ModelMapper m = new ModelMapper();
        Peoplexcomisaria pc = m.map(dto, Peoplexcomisaria.class);
        pcS.insert(pc);
    }

    @GetMapping
    public List<PeoplexcomisariaDTO> list(){
        return pcS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PeoplexcomisariaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        pcS.delete(id);
    }

    @GetMapping("/{id}")
    public PeoplexcomisariaDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PeoplexcomisariaDTO dto = m.map(pcS.listId(id), PeoplexcomisariaDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody PeoplexcomisariaDTO dto){
        ModelMapper m = new ModelMapper();
        Peoplexcomisaria pc = m.map(dto, Peoplexcomisaria.class);
        pcS.insert(pc);
    }

    @GetMapping("/people-count")
    public List<comisariaPeopleDTO> getPeopleCountByComisaria(){
        List<comisariaPeopleDTO> peopleComisariaDTOs = pcS.reporte04();

        return peopleComisariaDTOs;
    }
}
