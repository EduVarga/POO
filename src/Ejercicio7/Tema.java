package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private int cod_t;
    private Set<Libro> libros;

    public Tema(int cod_t, Set<Libro> libros) {
        this.cod_t = cod_t;
        this.libros = new HashSet<>();
    }

    public int getCod_t() {
        return cod_t;
    }

    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
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
        return "CodTema: " + this.cod_t;
    }
}
