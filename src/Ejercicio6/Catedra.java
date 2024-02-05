package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String catedra;
    private Departament departament;
    private Set<Profesor> profesors;
    private Facultat facultat;

    public Catedra(String catedra, Departament departament, Set<Profesor> profesors, Facultat facultat) {
        this.catedra = catedra;
        this.departament = departament;
        this.profesors = new HashSet<>();
        this.facultat = facultat;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Set<Profesor> getProfesors() {
        return profesors;
    }

    public void setProfesors(Set<Profesor> profesors) {
        this.profesors = profesors;
    }

    public Facultat getFacultat() {
        return facultat;
    }

    public void setFacultat(Facultat facultat) {
        this.facultat = facultat;
    }

    public void addProfesor(Profesor profesor){ this.profesors.add(profesor); }
    public String toString(){
        return "Cátedra: " + this.catedra;
    }
}
