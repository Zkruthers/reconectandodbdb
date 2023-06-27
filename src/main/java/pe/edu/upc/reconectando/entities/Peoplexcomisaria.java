package pe.edu.upc.reconectando.entities;


import javax.persistence.*;

@Entity
@Table(name = "peoplexcomisaria")
public class Peoplexcomisaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPeoplexcomisaria;

    @ManyToOne
    @JoinColumn(name = "idPeople")
    private People people;

    @ManyToOne
    @JoinColumn(name = "idComisaria")
    private Comisaria comisaria;

    public Peoplexcomisaria() {
    }

    public Peoplexcomisaria(int idPeoplexcomisaria, People people, Comisaria comisaria) {
        this.idPeoplexcomisaria = idPeoplexcomisaria;
        this.people = people;
        this.comisaria = comisaria;
    }

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
