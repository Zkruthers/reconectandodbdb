package pe.edu.upc.reconectando.dtos;

public class categoriaPublicacionDTO {

    private String nombreCategoria;
    private int publicacionCount;

    public categoriaPublicacionDTO() {
    }

    public categoriaPublicacionDTO(String nombreCategoria, int publicacionCount) {
        this.nombreCategoria = nombreCategoria;
        this.publicacionCount = publicacionCount;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getPublicacionCount() {
        return publicacionCount;
    }

    public void setPublicacionCount(int publicacionCount) {
        this.publicacionCount = publicacionCount;
    }
}
