package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.dtos.publicacionComentarioDTO;
import pe.edu.upc.reconectando.entities.Comentario;

import java.util.List;

public interface IComentarioService {
    public void insert(Comentario comentario);
    List<Comentario> list();
    public void delete(int idComentario);
    public Comentario listId(int idComentario);
    public List<publicacionComentarioDTO> reporte03();
}
