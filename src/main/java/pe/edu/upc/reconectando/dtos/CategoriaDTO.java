package pe.edu.upc.reconectando.dtos;

public class CategoriaDTO {
    private int idCategoria;
    private String nombreCategoria;
    private String rangoCategoria;
    private String descripcionCategoria;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getRangoCategoria() {
        return rangoCategoria;
    }

    public void setRangoCategoria(String rangoCategoria) {
        this.rangoCategoria = rangoCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }
}
