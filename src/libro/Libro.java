package libro;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private List<Tema> temas;

    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    public void addTema(Tema tema){
        this.temas.add(tema);
    }

    public String toString(){
        return "Título: " + this.titulo + "\n\t" +
        "libro.Autor: " + this.autor + "\n\t" + "Páginas: " +
        this.paginas + "\n\t" + "Temas: " + this.temas;
    }
}
