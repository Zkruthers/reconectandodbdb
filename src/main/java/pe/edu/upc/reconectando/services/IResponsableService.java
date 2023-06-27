package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Responsable;

import java.util.List;

public interface IResponsableService {
    public void insert(Responsable responsable);
    List<Responsable> list();
    public void delete(int idResponsable);
    public Responsable listId(int idResponsable);
}
