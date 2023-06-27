package pe.edu.upc.reconectando.entities;

import javax.persistence.*;

@Entity
@Table(name = "comisariaxresponsable")
public class Comisariaxresponsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComisariaxresponsable;

    @ManyToOne
    @JoinColumn(name = "idComisaria")
    private Comisaria comisaria;

    @ManyToOne
    @JoinColumn(name = "idResponsable")
    private Responsable responsable;

    public Comisariaxresponsable() {
    }

    public Comisariaxresponsable(int idComisariaxresponsable, Comisaria comisaria, Responsable responsable) {
        this.idComisariaxresponsable = idComisariaxresponsable;
        this.comisaria = comisaria;
        this.responsable = responsable;
    }

    public int getIdComisariaxresponsable() {
        return idComisariaxresponsable;
    }

    public void setIdComisariaxresponsable(int idComisariaxresponsable) {
        this.idComisariaxresponsable = idComisariaxresponsable;
    }

    public Comisaria getComisaria() {
        return comisaria;
    }

    public void setComisaria(Comisaria comisaria) {
        this.comisaria = comisaria;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
}
