package pe.edu.upc.reconectando.dtos;

import pe.edu.upc.reconectando.entities.Distrito;

public class ComisariaDTO {
    private int idComisaria;
    private String nombreComisaria;
    private String direccionComisaria;
    private int telefonoComisaria;
    private Distrito distrito;

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
