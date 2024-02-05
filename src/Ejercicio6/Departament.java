package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Departament {
    private String departament;
    private AreaConeixement areaConeixement;
    private Set<Profesor> profesores;
    private Set<Catedra> catedras;

    public Departament(String departament, AreaConeixement areaConeixement, Set<Profesor> profesores, Set<Catedra> catedras) {
        this.departament = departament;
        this.areaConeixement = areaConeixement;
        this.profesores = new HashSet<>();
        this.catedras = new HashSet<>();
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public AreaConeixement getAreaConeixement() {
        return areaConeixement;
    }

    public void setAreaConeixement(AreaConeixement areaConeixement) {
        this.areaConeixement = areaConeixement;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addProfesor(Profesor profesor){ this.profesores.add(profesor); }

    public void addCatedra(Catedra catedra){ this.catedras.add(catedra); }
    public String toString(){ return "Dep: " + this.departament; }
}
