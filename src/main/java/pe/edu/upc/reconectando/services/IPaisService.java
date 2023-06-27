package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Pais;

import java.util.List;

public interface IPaisService {
    public void insert(Pais pais);
    List<Pais> list();
    public void delete(int idPais);
    public Pais listId(int idPais);
}
