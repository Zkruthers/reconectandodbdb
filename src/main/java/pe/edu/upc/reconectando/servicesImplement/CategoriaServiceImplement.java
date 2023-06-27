package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.entities.Categoria;
import pe.edu.upc.reconectando.repositories.ICategoriaRepository;
import pe.edu.upc.reconectando.services.ICategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImplement implements ICategoriaService {
    @Autowired
    private ICategoriaRepository cR;


    @Override
    public void insert(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCategoria) {
        cR.deleteById(idCategoria);
    }

    @Override
    public Categoria listId(int idCategoria) {
        return cR.findById(idCategoria).orElse(new Categoria());
    }
}
