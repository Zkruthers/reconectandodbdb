package pe.edu.upc.reconectando.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.reconectando.entities.People;

import java.util.List;

@Repository
public interface IPeopleRepository extends JpaRepository<People, Integer> {

    @Query(value = "SELECT d.nombre_Distrito, COUNT(p.id_People) FROM Peoples p JOIN Distritos d ON p.id_Distrito = d.id_Distrito GROUP BY d.nombre_Distrito ORDER BY COUNT(p.id_People)", nativeQuery = true)
    List<String[]> getCountPeoplebyDistrito();
}
