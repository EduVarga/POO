package Herencia.ProyectoTrabajadores;

public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }
    public String toString(){
        return "Técnico: " + super.toString();
    }
}
