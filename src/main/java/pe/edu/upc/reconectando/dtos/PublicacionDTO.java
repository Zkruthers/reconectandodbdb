package pe.edu.upc.reconectando.dtos;

import pe.edu.upc.reconectando.entities.Categoria;
import pe.edu.upc.reconectando.entities.People;
import pe.edu.upc.reconectando.entities.Users;

import java.time.LocalDate;

public class PublicacionDTO {
    private int idPublicacion;
    private String tituloPublicacion;
    private String descripcionPublicacion;
    private LocalDate fechaPublicacionP;
    private LocalDate fechaDesaparicion;
    private String vigentePublicacion;
    private Users user;
    private People people;
    private Categoria categoria;

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTituloPublicacion() {
        return tituloPublicacion;
    }

    public void setTituloPublicacion(String tituloPublicacion) {
        this.tituloPublicacion = tituloPublicacion;
    }

    public String getDescripcionPublicacion() {
        return descripcionPublicacion;
    }

    public void setDescripcionPublicacion(String descripcionPublicacion) {
        this.descripcionPublicacion = descripcionPublicacion;
    }

    public LocalDate getFechaPublicacionP() {
        return fechaPublicacionP;
    }

    public void setFechaPublicacionP(LocalDate fechaPublicacionP) {
        this.fechaPublicacionP = fechaPublicacionP;
    }

    public LocalDate getFechaDesaparicion() {
        return fechaDesaparicion;
    }

    public void setFechaDesaparicion(LocalDate fechaDesaparicion) {
        this.fechaDesaparicion = fechaDesaparicion;
    }

    public String getVigentePublicacion() {
        return vigentePublicacion;
    }

    public void setVigentePublicacion(String vigentePublicacion) {
        this.vigentePublicacion = vigentePublicacion;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
