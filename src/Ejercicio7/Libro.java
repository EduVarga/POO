package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private int isbn;
    private Tema tema;
    private Set<Autor> autores;
    private Editorial editorial;
    private Set<Ejemplar> ejemplares;

    public Libro(int isbn, Tema tema, Set<Autor> autores, Editorial editorial, Set<Ejemplar> ejemplares) {
        this.isbn = isbn;
        this.tema = tema;
        this.autores = new HashSet<>();
        this.editorial = editorial;
        this.ejemplares = new HashSet<>();
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void addAutor(Autor autores){
        this.autores.add(autores);
    }
    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }

    public String toString(){
        return "ISBN: " + this.isbn;
    }
}
