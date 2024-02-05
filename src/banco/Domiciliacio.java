package banco;

public class Domiciliacio {
    private int num_d;
    private Compte compte;

    public Domiciliacio(int num_d, Compte compte) {
        this.num_d = num_d;
        this.compte = compte;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public String toString(){
        return "NDom: " + this.num_d;
    }

}
