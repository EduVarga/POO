package SistemaDeSubastas;

public class Articulo {
    private String n_articulo;
    private Lote lote;

    public Articulo(String n_articulo, Lote lote) {
        this.n_articulo = n_articulo;
        this.lote = lote;
    }

    public String getN_articulo() {
        return n_articulo;
    }

    public void setN_articulo(String n_articulo) {
        this.n_articulo = n_articulo;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
    public String toString(){
        return "Artículo: " + this.n_articulo;
    }
}
