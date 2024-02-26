package Herencia.ProyectoTrabajadores;

public class Directivo extends Empleado{
    public Directivo(String nombre) {
        super(nombre);
    }
    public String toString(){
        return "Directivo: " + super.toString();
    }
}
