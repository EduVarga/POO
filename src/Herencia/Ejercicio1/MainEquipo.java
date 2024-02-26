package Herencia.Ejercicio1;

public class MainEquipo {
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";
    public static final String cyan = "\u001B[36m";
    public static void main(String[] args) {
        System.out.println(green + "Equipo" + reset);
        Equipo e = new Equipo("Pepe");
        e.comunicarse();
        System.out.println(green + "Portero" + reset);
        Portero p = new Portero("Casillas");
        p.comunicarse();
        p.funcion();
        p.entrenar();
        p.dieta();
        System.out.println(green + "Jugador" +   reset);
        Jugador j = new Jugador("CR7");
        j.comunicarse();
        j.cantidad();
        j.entrenar();
        j.dieta();
        j.historia();
        j.preferencias();
        System.out.println(green + "Entrenador" + reset);
        Entrenador en = new Entrenador("Mourinho");
        en.comunicarse();
        en.formarParte();
        en.historia();
        en.preferencias();
        System.out.println(green + "Entrenador de porteros" + reset);
        EntrenadorPorteros ep = new EntrenadorPorteros("Willy");
        ep.comunicarse();
        ep.formarParte();
        System.out.println(green + "Presidente del club" + reset);
        Presidente pr = new Presidente("Florentino");
        pr.comunicarse();
        System.out.println(cyan + "'Contratar jugador'" + reset);
        j.comunicarse();
        pr.gustosHis(j);
        pr.gustosPref(j);
        System.out.println(cyan + "'Contratar entrenador'" + reset);
        en.comunicarse();
        pr.gustosHis(en);
        pr.gustosPref(en);
        /* Si se intenta pr.gustosHis(ep) no funciona ya que
        el entrenador de porteros no implementa Gustos */
        System.out.println(green + "Contratar o no contratar" + reset);
        //Contratar a jugador
        pr.contratar(j);
        //Contratar a portero
        pr.contratar(p);
        //Contratar a entrenador
        pr.contratar(en);
        //Contratar a entrenador de porteros
        pr.contratar(ep);
    }
}
