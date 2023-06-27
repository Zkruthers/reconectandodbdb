package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Distrito;
import pe.edu.upc.reconectando.repositories.IDistritoRepository;
import pe.edu.upc.reconectando.services.IDistritoService;

import java.util.List;

@Service
public class DistritoServiceImplement implements IDistritoService {
    @Autowired
    private IDistritoRepository dR;


    @Override
    public void insert(Distrito distrito) {
        dR.save(distrito);
    }

    @Override
    public List<Distrito> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDistrito) {
        dR.deleteById(idDistrito);
    }

    @Override
    public Distrito listId(int idDistrito) {
        return dR.findById(idDistrito).orElse(new Distrito());
    }
}
