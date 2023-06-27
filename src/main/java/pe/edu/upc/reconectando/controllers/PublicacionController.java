package pe.edu.upc.reconectando.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.reconectando.dtos.PublicacionDTO;
import pe.edu.upc.reconectando.dtos.categoriaPublicacionDTO;
import pe.edu.upc.reconectando.entities.Publicacion;
import pe.edu.upc.reconectando.services.IPublicacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {
    @Autowired
    private IPublicacionService pS;

    @PostMapping
    public void insert(@RequestBody PublicacionDTO dto){
        ModelMapper m = new ModelMapper();
        Publicacion p = m.map(dto, Publicacion.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PublicacionDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        Publicacion publicacion = pS.listId(id);

        publicacion.setUser(null);

        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PublicacionDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PublicacionDTO dto = m.map(pS.listId(id), PublicacionDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody PublicacionDTO dto){
        ModelMapper m = new ModelMapper();
        Publicacion p = m.map(dto, Publicacion.class);
        pS.insert(p);
    }

    @GetMapping("/publicacion-count")
    public List<categoriaPublicacionDTO> getPublicacionCountByCategoria(){
        List<categoriaPublicacionDTO> publicacionCategoriaDTOs = pS.reporte02();

        return publicacionCategoriaDTOs;
    }
}
