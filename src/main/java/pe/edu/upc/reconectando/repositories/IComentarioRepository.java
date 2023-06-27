package pe.edu.upc.reconectando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.reconectando.entities.Comentario;

import java.util.List;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario,Integer> {

    @Query(value = "SELECT p.titulo_Publicacion, COUNT(c.id_Comentario) FROM Publicaciones p JOIN Comentarios c ON p.id_Publicacion = c.id_Publicacion GROUP BY p.titulo_Publicacion ORDER BY COUNT(c.id_Comentario)", nativeQuery = true)
    List<String[]> getCountComentarioByPublicacion();

}
