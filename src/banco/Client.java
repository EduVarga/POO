package banco;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private String dni;
    private Set<Prestec> prestecs;
    private Set<Compte> comptes;

    public Client(String dni, Set<Prestec> prestecs, Set<Compte> comptes) {
        this.dni = dni;
        this.prestecs = new HashSet<>();
        this.comptes = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public void setPrestecs(Set<Prestec> prestecs) {
        this.prestecs = prestecs;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    public void addPrestec(Prestec prestec){
        this.prestecs.add(prestec);
    }

    public void addCompte(Compte compte){ this.comptes.add(compte); }
    public String toString(){
        return "DNIClient: " + this.dni;
    }
}
