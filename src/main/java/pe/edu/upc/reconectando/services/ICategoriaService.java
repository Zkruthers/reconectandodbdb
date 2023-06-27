package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public void insert(Categoria categoria);
    List<Categoria> list();
    public void delete(int idCategoria);
    public Categoria listId(int idCategoria);
}
