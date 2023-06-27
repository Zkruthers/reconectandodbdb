package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.dtos.categoriaPublicacionDTO;
import pe.edu.upc.reconectando.entities.Publicacion;
import pe.edu.upc.reconectando.repositories.IPublicacionRepository;
import pe.edu.upc.reconectando.services.IPublicacionService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicacionServiceImplement implements IPublicacionService {
    @Autowired
    private IPublicacionRepository pR;

    @Override
    public void insert(Publicacion publicacion) {
        pR.save(publicacion);
    }

    @Override
    public List<Publicacion> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPublicacion) {
        pR.deleteById(idPublicacion);
    }

    @Override
    public Publicacion listId(int idPublicacion) {
        return pR.findById(idPublicacion).orElse(new Publicacion());
    }

    @Override
    public List<categoriaPublicacionDTO> reporte02() {

        List<String[]> countPublicacionByCategoria = pR.getCountPublicacionByCategoria();

        List<categoriaPublicacionDTO> publicacionCategoriaDTOs = new ArrayList<>();

        for(String[] data : countPublicacionByCategoria){
            categoriaPublicacionDTO dto = new categoriaPublicacionDTO();

            dto.setNombreCategoria(data[0]);
            dto.setPublicacionCount(Integer.parseInt(data[1]));

            publicacionCategoriaDTOs.add(dto);
        }

        return publicacionCategoriaDTOs;
    }
}
