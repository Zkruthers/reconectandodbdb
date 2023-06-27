package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Comisariaxresponsable;
import pe.edu.upc.reconectando.repositories.IComisariaxresponsableRepository;
import pe.edu.upc.reconectando.services.IComisariaxresponsableService;

import java.util.List;

@Service
public class ComisariaxresponsableServiceImplement implements IComisariaxresponsableService {
    @Autowired
    private IComisariaxresponsableRepository crR;


    @Override
    public void insert(Comisariaxresponsable comisariaxresponsable) {
        crR.save(comisariaxresponsable);
    }

    @Override
    public List<Comisariaxresponsable> list() {
        return crR.findAll();
    }

    @Override
    public void delete(int idComisariaxresponsable) {
        crR.deleteById(idComisariaxresponsable);
    }

    @Override
    public Comisariaxresponsable listId(int idComisariaxresponsable) {
        return crR.findById(idComisariaxresponsable).orElse(new Comisariaxresponsable());
    }
}
