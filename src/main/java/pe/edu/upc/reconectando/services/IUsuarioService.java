package pe.edu.upc.reconectando.services;

import pe.edu.upc.reconectando.entities.Users;

import java.util.List;

public interface IUsuarioService {
    public void insert(Users user);
    List<Users> list();
    public void delete(Long id);
    public Users listId(Long id);
}
