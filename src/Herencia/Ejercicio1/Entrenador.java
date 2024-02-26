package Herencia.Ejercicio1;

public class Entrenador extends CuerpoTecnico implements Gustos {
    public Entrenador(String nombre) {
        super(nombre);
    }
    public void comunicarse(){
        System.out.println("Mi nombre es " + getNombre() + " y soy el entrenador");
    }

    @Override
    public void historia() {
        System.out.println("He sido/soy jugador de campo");
    }

    @Override
    public void preferencias() {
        System.out.println("Prefiero ser jugador de campo");
    }
}
