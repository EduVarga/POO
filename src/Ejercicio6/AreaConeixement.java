package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class AreaConeixement {
    private String area;
    private Set<Departament> departaments;

    public AreaConeixement(String area, Set<Departament> departaments) {
        this.area = area;
        this.departaments = new HashSet<>();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Set<Departament> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Set<Departament> departaments) {
        this.departaments = departaments;
    }

    public void addDpertament(Departament departament){ this.departaments.add(departament); }

    public String toString(){ return "Area: " + this.area; }
}
