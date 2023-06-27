package pe.edu.upc.reconectando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.reconectando.entities.Responsable;

@Repository
public interface IResponsableRepository extends JpaRepository<Responsable, Integer> {
}
