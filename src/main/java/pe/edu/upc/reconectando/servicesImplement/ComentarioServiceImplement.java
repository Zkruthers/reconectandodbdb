package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.dtos.publicacionComentarioDTO;
import pe.edu.upc.reconectando.entities.Comentario;
import pe.edu.upc.reconectando.repositories.IComentarioRepository;
import pe.edu.upc.reconectando.services.IComentarioService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {
    @Autowired
    private IComentarioRepository cR;

    @Override
    public void insert(Comentario comentario) {

        cR.save(comentario);
    }

    @Override
    public List<Comentario> list() {

        return cR.findAll();
    }

    @Override
    public void delete(int idComentario) {
        cR.deleteById(idComentario);
    }

    @Override
    public Comentario listId(int idComentario) {
        return cR.findById(idComentario).orElse(new Comentario());
    }

    @Override
    public List<publicacionComentarioDTO> reporte03() {

        List<String[]> countComentarioByPublicacion = cR.getCountComentarioByPublicacion();

        List<publicacionComentarioDTO> comentarioPublicacionDTOs = new ArrayList<>();

        for(String[] data : countComentarioByPublicacion){
            publicacionComentarioDTO dto = new publicacionComentarioDTO();

            dto.setPublicacion(data[0]);
            dto.setComentarioCount(Integer.parseInt(data[1]));
            comentarioPublicacionDTOs.add(dto);
        }

        return comentarioPublicacionDTOs;
    }
}
