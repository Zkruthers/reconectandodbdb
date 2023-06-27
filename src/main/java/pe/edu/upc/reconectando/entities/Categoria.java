package pe.edu.upc.reconectando.entities;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "nombreCategoria", length = 30, nullable = false)
    private String nombreCategoria;
    @Column(name = "rangoCategoria", length = 30, nullable = false)
    private String rangoCategoria;
    @Column(name = "descripcionCategoria", length = 500, nullable = false)
    private String descripcionCategoria;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nombreCategoria, String rangoCategoria, String descripcionCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.rangoCategoria = rangoCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

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
