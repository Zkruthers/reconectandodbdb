package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.dtos.comisariaPeopleDTO;
import pe.edu.upc.reconectando.entities.Peoplexcomisaria;

import java.util.List;

public interface IPeoplexcomisariaService {
    public void insert(Peoplexcomisaria peoplexcomisaria);
    List<Peoplexcomisaria> list();
    public void delete(int idPeoplexcomisaria);
    public Peoplexcomisaria listId(int idPeoplexcomisaria);
    public List<comisariaPeopleDTO> reporte04();
}
