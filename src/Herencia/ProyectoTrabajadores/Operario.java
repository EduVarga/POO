package Herencia.ProyectoTrabajadores;

public class Operario extends Empleado{
    public Operario(String nombre) {
        super(nombre);
    }
    public String toString(){
        return "Operario: " + super.toString();
    }
}
