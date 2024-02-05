package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Facultat {
    private String facultat;
    private Set<Catedra> catedras;

    public Facultat(String facultat, Set<Catedra> catedras) {
        this.facultat = facultat;
        this.catedras = new HashSet<>();
    }

    public String getFacultat() {
        return facultat;
    }

    public void setFacultat(String facultat) {
        this.facultat = facultat;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){ this.catedras.add(catedra); }

    public String toString(){ return "Facultad: " + this.facultat; }
}
