package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Role;

import java.util.List;

public interface IRolService {
    public void insert(Role role);
    List<Role> list();
    public void delete(Long id);
    public Role listId(Long id);
}
