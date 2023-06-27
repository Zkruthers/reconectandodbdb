package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.CategoriaDTO;
import pe.edu.upc.reconectando.entities.Categoria;
import pe.edu.upc.reconectando.services.ICategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private ICategoriaService cS;

    @PostMapping
    public void insert(@RequestBody CategoriaDTO dto){
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(dto, Categoria.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CategoriaDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CategoriaDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CategoriaDTO dto = m.map(cS.listId(id), CategoriaDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody CategoriaDTO dto){
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(dto, Categoria.class);
        cS.insert(c);
    }
}
