package Herencia.ProyectoTrabajadores;

public class Oficial extends Operario{
    public Oficial(String nombre) {
        super(nombre);
    }
    public String toString(){
        return "Oficial: " + super.toString();
    }
}
