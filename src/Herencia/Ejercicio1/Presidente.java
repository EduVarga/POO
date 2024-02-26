package Herencia.Ejercicio1;

public class Presidente extends Equipo{
    public Presidente(String nombre) {
        super(nombre);
    }
    public void comunicarse(){
        System.out.println("Soy " + getNombre() + " y soy el presidente del club");
    }
    public void gustosHis(Gustos jugadorHistoria){
        jugadorHistoria.historia();
    }
    public void gustosPref(Gustos jugadorPreferencias){
        jugadorPreferencias.preferencias();
    }
    public void contratar(Equipo equipo){
        if (equipo instanceof Gustos){
            System.out.println("Te voy a contratar");
        }else{
            System.out.println("NO te voy a contratar");
        }
    }
}
