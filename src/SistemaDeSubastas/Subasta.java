package SistemaDeSubastas;

import java.util.HashSet;
import java.util.Set;

public class Subasta {
    private String n_subasta;
    private Set<Lote> lotes;
    private Set<Puja> pujas;

    public Subasta(String n_subasta, Set<Lote> lotes, Set<Puja> pujas) {
        this.n_subasta = n_subasta;
        this.lotes = new HashSet<>();
        this.pujas = new HashSet<>();
    }

    public String getN_subasta() {
        return n_subasta;
    }

    public void setN_subasta(String n_subasta) {
        this.n_subasta = n_subasta;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }
    public void addLote(Lote lote){
        this.lotes.add(lote);
    }
    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }
    public String toString(){
        return "Subasta: " + this.n_subasta;
    }
}
