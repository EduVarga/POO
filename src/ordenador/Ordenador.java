package ordenador;

public class Ordenador {
    private String ordenador;
    private int precio;

    public Ordenador(String ordenador, int precio) {
        this.ordenador = ordenador;
        this.precio = precio;
    }

    public String getOrdenador() {
        return ordenador;
    }

    public void setOrdenador(String ordenador) {
        this.ordenador = ordenador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String toString(){
        return this.ordenador + "\n\t" + this.precio + " €";
    }
}
