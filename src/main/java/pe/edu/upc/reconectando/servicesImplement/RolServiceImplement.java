package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Role;
import pe.edu.upc.reconectando.repositories.IRolRepository;
import pe.edu.upc.reconectando.services.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rR;


    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }

    @Override
    public void delete(Long id) {
        rR.deleteById(id);
    }

    @Override
    public Role listId(Long id) {
        return rR.findById(id).orElse(new Role());
    }

}
