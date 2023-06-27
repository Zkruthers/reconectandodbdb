package pe.edu.upc.reconectando.dtos;

import pe.edu.upc.reconectando.entities.Comisaria;
import pe.edu.upc.reconectando.entities.People;

public class PeoplexcomisariaDTO {
    private int idPeoplexcomisaria;
    private People people;
    private Comisaria comisaria;

    public int getIdPeoplexcomisaria() {
        return idPeoplexcomisaria;
    }

    public void setIdPeoplexcomisaria(int idPeoplexcomisaria) {
        this.idPeoplexcomisaria = idPeoplexcomisaria;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Comisaria getComisaria() {
        return comisaria;
    }

    public void setComisaria(Comisaria comisaria) {
        this.comisaria = comisaria;
    }
}
