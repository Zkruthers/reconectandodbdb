package pe.edu.upc.reconectando.dtos;

import pe.edu.upc.reconectando.entities.Ciudad;

public class DistritoDTO {
    private int idDistrito;
    private String nombreDistrito;
    private Ciudad ciudad;

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
