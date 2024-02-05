package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private String profesor;
    private Departament departament;
    private Set<Catedra> catedras;

    public Profesor(String profesor, Departament departament, Set<Catedra> catedras) {
        this.profesor = profesor;
        this.departament = departament;
        this.catedras = new HashSet<>();
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){ this.catedras.add(catedra); }
    public String toString(){
        return "Profesor: " + this.profesor;
    }
}
