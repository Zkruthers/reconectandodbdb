package pe.edu.upc.reconectando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.reconectando.entities.Peoplexcomisaria;

import java.util.List;

@Repository
public interface IPeoplexcomisariaRepository extends JpaRepository<Peoplexcomisaria, Integer> {

    @Query(value = "SELECT c.nombre_Comisaria, COUNT(p.id_People) FROM peoplexcomisaria p JOIN comisarias c ON p.id_Comisaria = c.id_Comisaria GROUP BY c.nombre_Comisaria ORDER BY COUNT(p.id_People)", nativeQuery = true)
    List<String[]> getCountPeopleByComisaria();

}
