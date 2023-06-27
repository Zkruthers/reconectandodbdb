package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Comisariaxresponsable;

import java.util.List;

public interface IComisariaxresponsableService {
    public void insert(Comisariaxresponsable comisariaxresponsable);
    List<Comisariaxresponsable> list();
    public void delete(int idComisariaxresponsable);
    public Comisariaxresponsable listId(int idComisariaxresponsable);
}
