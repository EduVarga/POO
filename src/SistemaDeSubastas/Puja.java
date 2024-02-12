package SistemaDeSubastas;

public class Puja {
    private int cant_puja;
    private Subasta subasta;
    private Pujador pujador;
    private Lote lote;

    public Puja(int cant_puja, Subasta subasta, Pujador pujador, Lote lote) {
        this.cant_puja = cant_puja;
        this.subasta = subasta;
        this.pujador = pujador;
        this.lote = lote;
    }

    public int getCant_puja() {
        return cant_puja;
    }

    public void setCant_puja(int cant_puja) {
        this.cant_puja = cant_puja;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public String toString(){
        return "Puja: " + this.cant_puja;
    }
}
