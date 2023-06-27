package pe.edu.upc.reconectando.entities;

import javax.persistence.*;

@Entity
@Table(name = "ciudades")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCiudad;
    @Column(name = "nombreCiudad", length = 50, nullable = false)
    private String nombreCiudad;

    @ManyToOne
    @JoinColumn(name = "idPais")
    private Pais pais;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, String nombreCiudad, Pais pais) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.pais = pais;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
