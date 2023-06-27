package pe.edu.upc.reconectando.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.reconectando.dtos.distritoPeopleDTO;
import pe.edu.upc.reconectando.entities.People;
import pe.edu.upc.reconectando.repositories.IPeopleRepository;
import pe.edu.upc.reconectando.services.IPeopleService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleServiceImplement implements IPeopleService {
    @Autowired
    private IPeopleRepository pR;

    @Override
    public void insert(People people) {

        pR.save(people);
    }

    @Override
    public List<People> list() {

        return pR.findAll();
    }

    @Override
    public void delete(int idPeople) {

        pR.deleteById(idPeople);
    }

    @Override
    public People listId(int idPeople) {

        return pR.findById(idPeople).orElse(new People());
    }

    @Override
    public List<distritoPeopleDTO> reporte01() {

        List<String[]> countPeopleByDistrito = pR.getCountPeoplebyDistrito();

        List<distritoPeopleDTO> distritoPeopleDTOs = new ArrayList<>();

        for(String[] data: countPeopleByDistrito){
            distritoPeopleDTO dto = new distritoPeopleDTO();

            dto.setNombreDistrito(data[0]);
            dto.setPeopleCount(Integer.parseInt(data[1]));

            distritoPeopleDTOs.add(dto);
        }

        return distritoPeopleDTOs;
    }

}
