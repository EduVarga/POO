package banco;

public class Prestec {
    private int num_p;
    private Sucursal sucursal;
    private Client client;

    public Prestec(int num_p, Sucursal sucursal, Client client) {
        this.num_p = num_p;
        this.sucursal = sucursal;
        this.client = client;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString(){
        return "NPrestec: " + this.num_p;
    }
}
