package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Comisaria;

import java.util.List;

public interface IComisariaService {
    public void insert(Comisaria comisaria);
    List<Comisaria> list();
    public void delete(int idComisaria);
    public Comisaria listId(int idComisaria);
}
