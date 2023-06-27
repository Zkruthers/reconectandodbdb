package pe.edu.upc.reconectando.entities;

import javax.persistence.*;

@Entity
@Table(name = "comisarias")
public class Comisaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComisaria;
    @Column(name = "nombreComisaria", length = 50, nullable = false)
    private String nombreComisaria;
    @Column(name = "direccionComisaria", length = 150, nullable = false)
    private String direccionComisaria;
    @Column(name = "telefonoComisaria", nullable = false)
    private int telefonoComisaria;

    @ManyToOne
    @JoinColumn(name = "idDistrito")
    private Distrito distrito;

    public Comisaria() {
    }

    public Comisaria(int idComisaria, String nombreComisaria, String direccionComisaria, int telefonoComisaria, Distrito distrito) {
        this.idComisaria = idComisaria;
        this.nombreComisaria = nombreComisaria;
        this.direccionComisaria = direccionComisaria;
        this.telefonoComisaria = telefonoComisaria;
        this.distrito = distrito;
    }

    public int getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(int idComisaria) {
        this.idComisaria = idComisaria;
    }

    public String getNombreComisaria() {
        return nombreComisaria;
    }

    public void setNombreComisaria(String nombreComisaria) {
        this.nombreComisaria = nombreComisaria;
    }

    public String getDireccionComisaria() {
        return direccionComisaria;
    }

    public void setDireccionComisaria(String direccionComisaria) {
        this.direccionComisaria = direccionComisaria;
    }

    public int getTelefonoComisaria() {
        return telefonoComisaria;
    }

    public void setTelefonoComisaria(int telefonoComisaria) {
        this.telefonoComisaria = telefonoComisaria;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}
