package pe.edu.upc.reconectando.dtos;

public class comisariaPeopleDTO {

    private String nombreComisaria;
    private int peopleCount;

    public comisariaPeopleDTO() {
    }

    public comisariaPeopleDTO(String nombreComisaria, int peopleCount) {
        this.nombreComisaria = nombreComisaria;
        this.peopleCount = peopleCount;
    }

    public String getNombreComisaria() {
        return nombreComisaria;
    }

    public void setNombreComisaria(String nombreComisaria) {
        this.nombreComisaria = nombreComisaria;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }
}
