package pe.edu.upc.reconectando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.reconectando.entities.Publicacion;

import java.util.List;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion, Integer> {

    @Query(value = "SELECT c.nombre_Categoria, COUNT(p.id_Publicacion) FROM Publicaciones p JOIN Categorias c ON p.id_Categoria = c.id_Categoria GROUP BY c.nombre_Categoria ORDER BY COUNT(p.id_Publicacion)", nativeQuery = true)
    List<String[]> getCountPublicacionByCategoria();
}
