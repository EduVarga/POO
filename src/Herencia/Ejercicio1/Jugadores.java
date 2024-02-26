package Herencia.Ejercicio1;

public class Jugadores extends Equipo {
    public Jugadores(String nombre) {
        super(nombre);
    }
    public void entrenar(){
        System.out.println("Entreno todos los días");
    }
    public void dieta(){
        System.out.println("Tengo una dieta equilibrada");
    }
}
