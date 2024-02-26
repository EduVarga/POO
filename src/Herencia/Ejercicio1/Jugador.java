package Herencia.Ejercicio1;

public class Jugador extends Jugadores implements Gustos {
    public Jugador(String nombre) {
        super(nombre);
    }
    public void comunicarse(){
        System.out.println("Soy " + getNombre() + " y soy jugador");
    }
    public void cantidad(){
        System.out.println("En el campo somos 10 jugadores y un portero");
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