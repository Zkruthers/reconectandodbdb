package pe.edu.upc.reconectando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.reconectando.entities.Ciudad;

@Repository
public interface ICiudadRepository extends JpaRepository<Ciudad, Integer> {
}
