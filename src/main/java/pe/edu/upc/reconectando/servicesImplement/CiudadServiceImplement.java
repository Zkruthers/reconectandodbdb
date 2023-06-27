package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Ciudad;
import pe.edu.upc.reconectando.repositories.ICiudadRepository;
import pe.edu.upc.reconectando.services.ICiudadService;

import java.util.List;

@Service
public class CiudadServiceImplement implements ICiudadService {
    @Autowired
    private ICiudadRepository cR;


    @Override
    public void insert(Ciudad ciudad) {
       cR.save(ciudad);
    }

    @Override
    public List<Ciudad> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCiudad) {
        cR.deleteById(idCiudad);
    }

    @Override
    public Ciudad listId(int idCiudad) {
        return cR.findById(idCiudad).orElse(new Ciudad());
    }
}
