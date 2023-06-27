package pe.edu.upc.reconectando.dtos;

import pe.edu.upc.reconectando.entities.Distrito;

public class PeopleDTO {
    private int idPeople;
    private String nombresPeople;
    private String apellidosPeople;
    private String dniPeople;
    private int edadPeople;
    private String generoPeople;
    private Distrito distrito;

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
