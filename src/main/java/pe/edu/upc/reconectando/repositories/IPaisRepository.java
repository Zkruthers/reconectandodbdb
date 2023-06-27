package pe.edu.upc.reconectando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.reconectando.entities.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Integer> {
}
