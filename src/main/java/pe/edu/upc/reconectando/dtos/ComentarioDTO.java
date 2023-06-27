package pe.edu.upc.reconectando.dtos;

import pe.edu.upc.reconectando.entities.Publicacion;
import pe.edu.upc.reconectando.entities.Users;

import java.time.LocalDate;

public class ComentarioDTO {
    private int idComentario;
    private String descripcionComentario;
    private LocalDate fechaPublicacionC;
    private Users user;
    private Publicacion publicacion;

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getDescripcionComentario() {
        return descripcionComentario;
    }

    public void setDescripcionComentario(String descripcionComentario) {
        this.descripcionComentario = descripcionComentario;
    }

    public LocalDate getFechaPublicacionC() {
        return fechaPublicacionC;
    }

    public void setFechaPublicacionC(LocalDate fechaPublicacionC) {
        this.fechaPublicacionC = fechaPublicacionC;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
