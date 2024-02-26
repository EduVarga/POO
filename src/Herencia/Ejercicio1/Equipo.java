package Herencia.Ejercicio1;

public class Equipo {
    private String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void comunicarse(){
        System.out.println("Soy " + nombre + " y soy del equipo");
    }
}
