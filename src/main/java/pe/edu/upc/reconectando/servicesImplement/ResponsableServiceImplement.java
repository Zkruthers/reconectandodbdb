package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Responsable;
import pe.edu.upc.reconectando.repositories.IResponsableRepository;
import pe.edu.upc.reconectando.services.IResponsableService;

import java.util.List;

@Service
public class ResponsableServiceImplement implements IResponsableService {
    @Autowired
    private IResponsableRepository rR;

    @Override
    public void insert(Responsable responsable) {
        rR.save(responsable);
    }

    @Override
    public List<Responsable> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idResponsable) {
        rR.deleteById(idResponsable);
    }

    @Override
    public Responsable listId(int idResponsable) {
        return rR.findById(idResponsable).orElse(new Responsable());
    }
}
