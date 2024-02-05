package banco;

public class Tiene {
    private String priv;
    private Compte compte;
    private Client client;

    public Tiene(String priv, Compte compte, Client client) {
        this.priv = priv;
        this.compte = compte;
        this.client = client;
    }

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString(){ return "Privilegios: " + this.priv; }

}
