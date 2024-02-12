package SistemaDeSubastas;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private String n_lote;
    private Set<Articulo> articulos;
    private Subasta subasta;
    private Set<Puja> pujas;

    public Lote(String n_lote, Set<Articulo> articulos, Subasta subasta, Set<Puja> pujas) {
        this.n_lote = n_lote;
        this.articulos = new HashSet<>();
        this.subasta = subasta;
        this.pujas = new HashSet<>();
    }

    public String getN_lote() {
        return n_lote;
    }

    public void setN_lote(String n_lote) {
        this.n_lote = n_lote;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
    public void addPuja(Puja puja) { this.pujas.add(puja); }
    public int obtenerNumeroPujas(){
        return pujas.size();
    }
    public String toString(){
        return "Lote: " + n_lote;
    }
}
