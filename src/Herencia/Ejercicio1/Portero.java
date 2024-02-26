package Herencia.Ejercicio1;

public class Portero extends Jugadores {
    public Portero(String nombre) {
        super(nombre);
    }
    public void comunicarse(){
        System.out.println("Mi nombre es " + getNombre() + " y soy portero");
    }
    public void funcion(){
        System.out.println("Yo puedo tocarla con las manos");
    }
}
