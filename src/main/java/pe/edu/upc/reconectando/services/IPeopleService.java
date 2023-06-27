package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.dtos.distritoPeopleDTO;
import pe.edu.upc.reconectando.entities.People;

import java.util.List;

public interface IPeopleService {
    public void insert(People people);
    List<People> list();
    public void delete(int idPeople);
    public People listId(int idPeople);
    public List<distritoPeopleDTO> reporte01();

}
