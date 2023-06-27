package pe.edu.upc.reconectando.entities;

import javax.persistence.*;

@Entity
@Table(name = "responsables")
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResponsable;
    @Column(name = "nombresResponsable", length = 30, nullable = false)
    private String nombresResponsable;
    @Column(name = "apellidosResponsable", length = 30, nullable = false)
    private String apellidosResponsable;
    @Column(name = "telefonoResponsable", nullable = false)
    private int telefonoResponsable;

    public Responsable() {
    }

    public Responsable(int idResponsable, String nombresResponsable, String apellidosResponsable, int telefonoResponsable) {
        this.idResponsable = idResponsable;
        this.nombresResponsable = nombresResponsable;
        this.apellidosResponsable = apellidosResponsable;
        this.telefonoResponsable = telefonoResponsable;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNombresResponsable() {
        return nombresResponsable;
    }

    public void setNombresResponsable(String nombresResponsable) {
        this.nombresResponsable = nombresResponsable;
    }

    public String getApellidosResponsable() {
        return apellidosResponsable;
    }

    public void setApellidosResponsable(String apellidosResponsable) {
        this.apellidosResponsable = apellidosResponsable;
    }

    public int getTelefonoResponsable() {
        return telefonoResponsable;
    }

    public void setTelefonoResponsable(int telefonoResponsable) {
        this.telefonoResponsable = telefonoResponsable;
    }
}
