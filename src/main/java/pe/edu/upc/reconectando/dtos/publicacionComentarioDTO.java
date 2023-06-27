package pe.edu.upc.reconectando.dtos;

public class publicacionComentarioDTO {

    private String Publicacion;
    private int comentarioCount;

    public publicacionComentarioDTO() {
    }

    public publicacionComentarioDTO(String publicacion, int comentarioCount) {
        Publicacion = publicacion;
        this.comentarioCount = comentarioCount;
    }

    public String getPublicacion() {
        return Publicacion;
    }

    public void setPublicacion(String publicacion) {
        Publicacion = publicacion;
    }

    public int getComentarioCount() {
        return comentarioCount;
    }

    public void setComentarioCount(int comentarioCount) {
        this.comentarioCount = comentarioCount;
    }
}
