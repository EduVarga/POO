package banco;

import java.util.HashSet;
import java.util.Set;

public class Compte {
    private int n_cc;
    private Sucursal sucursal;
    private Set<Client> clients;
    private Set<Domiciliacio> domiciliacions;

    public Compte(int n_cc, Sucursal sucursal, Set<Client> clients, Set<Domiciliacio> domiciliacions) {
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.clients = new HashSet<>();
        this.domiciliacions = new HashSet<>();
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Domiciliacio> getDomiciliacions() {
        return domiciliacions;
    }

    public void setDomiciliacions(Set<Domiciliacio> domiciliacions) {
        this.domiciliacions = domiciliacions;
    }

    public void addClient(Client client){ this.clients.add(client); }

    public void addDomiciliacio(Domiciliacio domiciliacio){ this.domiciliacions.add(domiciliacio); }
    public String toString(){
        return "NCompte: " + this.n_cc;
    }
}
