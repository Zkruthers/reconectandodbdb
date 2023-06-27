package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Ciudad;

import java.util.List;

public interface ICiudadService {
    public void insert(Ciudad ciudad);
    List<Ciudad> list();
    public void delete(int idCiudad);
    public Ciudad listId(int idCiudad);
}
