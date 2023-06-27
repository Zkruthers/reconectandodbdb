package pe.edu.upc.reconectando.dtos;

public class distritoPeopleDTO {

    private String nombreDistrito;
    private int peopleCount;

    public distritoPeopleDTO() {
    }

    public distritoPeopleDTO(String nombreDistrito, int peopleCount) {
        this.nombreDistrito = nombreDistrito;
        this.peopleCount = peopleCount;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }
}
