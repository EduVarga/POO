package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String dni;
    private Set<Ejemplar> ejemplares;
    private Set<Ejemplar> ejemplar;

    public Lector(String dni, Set<Ejemplar> ejemplares, Set<Ejemplar> ejemplar) {
        this.dni = dni;
        this.ejemplares = new HashSet<>();
        this.ejemplar = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Set<Ejemplar> getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Set<Ejemplar> ejemplar) {
        this.ejemplar = ejemplar;
    }

    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }
    public void addEjem(Ejemplar ejemplar){
        this.ejemplar.add(ejemplar);
    }
    public String toString(){
        return "DNI Lector: " + this.dni;
    }
}
