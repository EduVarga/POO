package Ejercicio7;

public class Historico {
    private String fecha_p;
    private String fecha_t;
    private Ejemplar ejemplar;
    private Lector lector;

    public Historico(String fecha_p, String fecha_t, Ejemplar ejemplar, Lector lector) {
        this.fecha_p = fecha_p;
        this.fecha_t = fecha_t;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    public String getFecha_t() {
        return fecha_t;
    }

    public void setFecha_t(String fecha_t) {
        this.fecha_t = fecha_t;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
    public String toString(){
        return "Fecha p: " + this.fecha_p + "; Fecha t: " + this.fecha_t;
    }
}
