package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.ComentarioDTO;
import pe.edu.upc.reconectando.dtos.publicacionComentarioDTO;
import pe.edu.upc.reconectando.entities.Comentario;
import pe.edu.upc.reconectando.services.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService cS;

    @PostMapping
    public void insert(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);
    }

    @GetMapping
    public List<ComentarioDTO> list() {
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        Comentario comentario = cS.listId(id);

        comentario.setUser(null);

        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ComentarioDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ComentarioDTO dto = m.map(cS.listId(id), ComentarioDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);
    }

    @GetMapping("/comentario-count")
    public List<publicacionComentarioDTO> getComentarioCountByPublicacion(){
        List<publicacionComentarioDTO> comentarioPublicacionDTOs = cS.reporte03();

        return  comentarioPublicacionDTOs;
    }
}
