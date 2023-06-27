package pe.edu.upc.reconectando.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "publicaciones")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    @Column(name = "tituloPublicacion", length = 100, nullable = false)
    private String tituloPublicacion;
    @Column(name = "descripcionPublicacion", length = 500, nullable = false)
    private String descripcionPublicacion;
    @Column(name = "fechaPublicacionP", nullable = false)
    private LocalDate fechaPublicacionP;
    @Column(name = "fechaDesaparicion", nullable = false)
    private LocalDate fechaDesaparicion;

    @Column(name = "vigentePublicacion", nullable = false)
    private String vigentePublicacion;
    @ManyToOne
    @JoinColumn(name = "id", nullable = true)
    @JsonIgnore
    private Users user;

    @ManyToOne
    @JoinColumn(name = "idPeople")
    private People people;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    public Publicacion() {
    }

    public Publicacion(int idPublicacion, String tituloPublicacion, String descripcionPublicacion, LocalDate fechaPublicacionP, LocalDate fechaDesaparicion, String vigentePublicacion, Users user, People people, Categoria categoria) {
        this.idPublicacion = idPublicacion;
        this.tituloPublicacion = tituloPublicacion;
        this.descripcionPublicacion = descripcionPublicacion;
        this.fechaPublicacionP = fechaPublicacionP;
        this.fechaDesaparicion = fechaDesaparicion;
        this.vigentePublicacion = vigentePublicacion;
        this.user = user;
        this.people = people;
        this.categoria = categoria;
    }

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
