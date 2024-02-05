package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private int cod_e;
    private Set<Libro> libros;

    public Editorial(int cod_e, Set<Libro> libros) {
        this.cod_e = cod_e;
        this.libros = new HashSet<>();
    }

    public int getCod_e() {
        return cod_e;
    }

    public void setCod_e(int cod_e) {
        this.cod_e = cod_e;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    public void addLibro(Libro libro){
        this.libros.add(libro);
    }
    public String toString(){
        return "CodEditorial: " + this.cod_e;
    }
}
