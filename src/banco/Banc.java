package banco;

import java.util.HashSet;
import java.util.Set;

public class Banc {
    private int n_ent;
    private Set<Sucursal> sucursales;

    public Banc(int n_ent, Set<Sucursal> sucursales) {
        this.n_ent = n_ent;
        this.sucursales = new HashSet<>();
    }

    public int getN_ent() {
        return n_ent;
    }

    public void setN_ent(int n_ent) {
        this.n_ent = n_ent;
    }
    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public String toString(){
        return "NBanc: " + this.n_ent;
    }
}
