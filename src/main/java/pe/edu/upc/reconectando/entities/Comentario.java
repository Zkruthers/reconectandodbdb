package pe.edu.upc.reconectando.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    @Column(name = "descripcionComentario", length = 500, nullable = false)
    private String descripcionComentario;
    @Column(name = "fechaPublicaconC", nullable = false)
    private LocalDate fechaPublicacionC;

    @ManyToOne
    @JoinColumn(name = "id", nullable = true)
    @JsonIgnore
    private Users user;

    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;

    public Comentario() {
    }

    public Comentario(int idComentario, String descripcionComentario, LocalDate fechaPublicacionC, Users user, Publicacion publicacion) {
        this.idComentario = idComentario;
        this.descripcionComentario = descripcionComentario;
        this.fechaPublicacionC = fechaPublicacionC;
        this.user = user;
        this.publicacion = publicacion;
    }

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
