package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private int cod_a;
    private Set<Libro> libros;

    public Autor(int cod_a, Set<Libro> libros) {
        this.cod_a = cod_a;
        this.libros = new HashSet<>();
    }

    public int getCod_a() {
        return cod_a;
    }

    public void setCod_a(int cod_a) {
        this.cod_a = cod_a;
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
        return "CodAutor: " + this.cod_a;
    }
}
