package pe.edu.upc.reconectando.entities;

import javax.persistence.*;

@Entity
@Table(name = "peoples")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPeople;
    @Column(name = "nombresPeople", length = 30, nullable = false)
    private String nombresPeople;
    @Column(name = "apellidosPeople", length = 30, nullable = false)
    private String apellidosPeople;
    @Column(name = "dniPeople", nullable = false)
    private String dniPeople;
    @Column(name = "edadPeople", nullable = false)
    private int edadPeople;
    @Column(name = "generoPeople", length = 9, nullable = false)
    private String generoPeople;

    @ManyToOne
    @JoinColumn(name = "idDistrito")
    private Distrito distrito;

    public People() {
    }

    public People(int idPeople, String nombresPeople, String apellidosPeople, String dniPeople, int edadPeople, String generoPeople, Distrito distrito) {
        this.idPeople = idPeople;
        this.nombresPeople = nombresPeople;
        this.apellidosPeople = apellidosPeople;
        this.dniPeople = dniPeople;
        this.edadPeople = edadPeople;
        this.generoPeople = generoPeople;
        this.distrito = distrito;
    }

    public int getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(int idPeople) {
        this.idPeople = idPeople;
    }

    public String getNombresPeople() {
        return nombresPeople;
    }

    public void setNombresPeople(String nombresPeople) {
        this.nombresPeople = nombresPeople;
    }

    public String getApellidosPeople() {
        return apellidosPeople;
    }

    public void setApellidosPeople(String apellidosPeople) {
        this.apellidosPeople = apellidosPeople;
    }

    public String getDniPeople() {
        return dniPeople;
    }

    public void setDniPeople(String dniPeople) {
        this.dniPeople = dniPeople;
    }

    public int getEdadPeople() {
        return edadPeople;
    }

    public void setEdadPeople(int edadPeople) {
        this.edadPeople = edadPeople;
    }

    public String getGeneroPeople() {
        return generoPeople;
    }

    public void setGeneroPeople(String generoPeople) {
        this.generoPeople = generoPeople;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}
