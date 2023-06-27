package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.dtos.comisariaPeopleDTO;
import pe.edu.upc.reconectando.entities.Peoplexcomisaria;
import pe.edu.upc.reconectando.repositories.IPeoplexcomisariaRepository;
import pe.edu.upc.reconectando.services.IPeoplexcomisariaService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeoplexcomisariaServiceImplement implements IPeoplexcomisariaService {
    @Autowired
    private IPeoplexcomisariaRepository pcR;


    @Override
    public void insert(Peoplexcomisaria peoplexcomisaria) {
        pcR.save(peoplexcomisaria);
    }

    @Override
    public List<Peoplexcomisaria> list() {
        return pcR.findAll();
    }

    @Override
    public void delete(int idPeoplexcomisaria) {
        pcR.deleteById(idPeoplexcomisaria);
    }

    @Override
    public Peoplexcomisaria listId(int idPeoplexcomisaria) {
        return pcR.findById(idPeoplexcomisaria).orElse(new Peoplexcomisaria());
    }

    @Override
    public List<comisariaPeopleDTO> reporte04() {

        List<String[]> countPeopleByComisaria = pcR.getCountPeopleByComisaria();

        List<comisariaPeopleDTO> peopleComisariaDTOs = new ArrayList<>();

        for(String[] data : countPeopleByComisaria){
            comisariaPeopleDTO dto = new comisariaPeopleDTO();

            dto.setNombreComisaria(data[0]);
            dto.setPeopleCount(Integer.parseInt(data[1]));
            peopleComisariaDTOs.add(dto);
        }

        return peopleComisariaDTOs;
    }
}
