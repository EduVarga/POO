package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Ejemplar {
    private int n_reg;
    private Libro libro;
    private Set<Lector> lectores;
    private Lector lector;

    public Ejemplar(int n_reg, Libro libro, Set<Lector> lectores, Lector lector) {
        this.n_reg = n_reg;
        this.libro = libro;
        this.lectores = new HashSet<>();
        this.lector = lector;
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Set<Lector> getLectores() {
        return lectores;
    }

    public void setLectores(Set<Lector> lectores) {
        this.lectores = lectores;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void addLector(Lector lector){
        this.lectores.add(lector);
    }

    public String toString(){
        return "NReg: " + this.n_reg;
    }
}
