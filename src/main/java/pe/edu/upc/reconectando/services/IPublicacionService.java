package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.dtos.categoriaPublicacionDTO;
import pe.edu.upc.reconectando.entities.Publicacion;

import java.util.List;

public interface IPublicacionService {
    public void insert(Publicacion publicacion);
    List<Publicacion> list();
    public void delete(int idPublicacion);
    public Publicacion listId(int idPublicacion);
    public List<categoriaPublicacionDTO> reporte02();
}
