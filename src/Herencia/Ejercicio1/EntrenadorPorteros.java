package Herencia.Ejercicio1;

public class EntrenadorPorteros extends CuerpoTecnico{
    public EntrenadorPorteros(String nombre) {
        super(nombre);
    }

    public void comunicarse(){
        System.out.println("Mi nombre es " + getNombre() + " y soy el entrenador de porteros");
    }
}
