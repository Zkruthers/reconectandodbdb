package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Comisaria;
import pe.edu.upc.reconectando.repositories.IComisariaRepository;
import pe.edu.upc.reconectando.services.IComisariaService;

import java.util.List;

@Service
public class ComisariaServiceImplement implements IComisariaService {
    @Autowired
    private IComisariaRepository cR;

    @Override
    public void insert(Comisaria comisaria) {
        cR.save(comisaria);
    }

    @Override
    public List<Comisaria> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idComisaria) {
        cR.deleteById(idComisaria);
    }

    @Override
    public Comisaria listId(int idComisaria) {
        return cR.findById(idComisaria).orElse(new Comisaria());
    }
}
