package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Distrito;

import java.util.List;

public interface IDistritoService {
    public void insert(Distrito distrito);
    List<Distrito> list();
    public void delete(int idDistrito);
    public Distrito listId(int idDistrito);
}
