package SistemaDeSubastas;

import java.util.HashSet;
import java.util.Set;

public class Pujador {
    private String n_pujador;
    private Set<Puja> pujas;

    public Pujador(String n_pujador, Set<Puja> pujas) {
        this.n_pujador = n_pujador;
        this.pujas = new HashSet<>();
    }

    public String getN_pujador() {
        return n_pujador;
    }

    public void setN_pujador(String n_pujador) {
        this.n_pujador = n_pujador;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }
    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }
    public String toString(){
        return "Pujador: " + this.n_pujador;
    }
}
