package pe.edu.upc.reconectando.entities;

import javax.persistence.*;

@Entity
@Table(name = "distritos")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;
    @Column(name = "nombreDistrito", length = 50, nullable = false)
    private String nombreDistrito;
    @ManyToOne
    @JoinColumn(name = "idCiudad")
    private Ciudad ciudad;

    public Distrito() {
    }

    public Distrito(int idDistrito, String nombreDistrito, Ciudad ciudad) {
        this.idDistrito = idDistrito;
        this.nombreDistrito = nombreDistrito;
        this.ciudad = ciudad;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
