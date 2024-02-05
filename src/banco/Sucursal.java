package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int n_suc;
    private Banc banc;
    private Set<Prestec> prestamos;
    private Set<Compte> comptes;

    public Sucursal(int n_suc, Banc banc, Set<Prestec> prestamos, Set<Compte> comptes) {
        this.n_suc = n_suc;
        this.banc = banc;
        this.prestamos = new HashSet<>();
        this.comptes = new HashSet<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public Banc getBanc() {
        return banc;
    }

    public void setBanc(Banc banc) {
        this.banc = banc;
    }

    public void addPrestamo(Prestec prestec){
        this.prestamos.add(prestec);
    }

    public Set<Prestec> getPrestamos() {
        return prestamos;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    public void addCompte(Compte compte){ this.comptes.add(compte); }

    public void setPrestamos(Set<Prestec> prestamos) {
        this.prestamos = prestamos;
    }

    public String toString(){
        return "NSuc: " + this.n_suc;
    }
}
