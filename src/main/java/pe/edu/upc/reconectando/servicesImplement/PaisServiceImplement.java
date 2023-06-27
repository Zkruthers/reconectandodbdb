package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Pais;
import pe.edu.upc.reconectando.repositories.IPaisRepository;
import pe.edu.upc.reconectando.services.IPaisService;

import java.util.List;

@Service
public class PaisServiceImplement implements IPaisService {
    @Autowired
    private IPaisRepository pR;

    @Override
    public void insert(Pais pais) {
        pR.save(pais);
    }

    @Override
    public List<Pais> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPais) {
        pR.deleteById(idPais);
    }

    @Override
    public Pais listId(int idPais) {
        return pR.findById(idPais).orElse(new Pais());
    }
}
