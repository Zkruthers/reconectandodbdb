package pe.edu.upc.reconectando.dtos;

import pe.edu.upc.reconectando.entities.Comisaria;
import pe.edu.upc.reconectando.entities.Responsable;

public class ComisariaxresponsableDTO {
    private int idComisariaxresponsable;
    private Comisaria comisaria;
    private Responsable responsable;

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
