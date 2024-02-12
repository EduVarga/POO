package SistemaDeSubastas;

import java.util.HashSet;

public class MainSubasta {
    public static void main(String[] args) {

        Subasta s1 = new Subasta("Subasta primera", new HashSet<>(), new HashSet<>());
        Lote l1 = new Lote("Antigüedades",new HashSet<>(), s1, new HashSet<>());
            Articulo a1 = new Articulo("Cuadro", l1);
                l1.addArticulo(a1);
            Articulo a2 = new Articulo("Collar",l1);
                l1.addArticulo(a2);
            Articulo a3 = new Articulo("Pulsera",l1);
                l1.addArticulo(a3);
            s1.addLote(l1);
        Lote l2 = new Lote("Joyas", new HashSet<>(), s1, new HashSet<>());
            Articulo a4 = new Articulo("Reloj", l2);
                l2.addArticulo(a4);
            Articulo a5 = new Articulo("Anillo", l2);
                l2.addArticulo(a5);
            s1.addLote(l2);
        Pujador pj1 = new Pujador("Jose", new HashSet<>());
            Puja p1 = new Puja(500,s1, pj1, l1);
                pj1.addPuja(p1);
                s1.addPuja(p1);
                l1.addPuja(p1);
            Puja p2 = new Puja(200, s1, pj1, l1);
                pj1.addPuja(p2);
                s1.addPuja(p2);
                l1.addPuja(p2);
        Pujador pj2 = new Pujador("Manuel", new HashSet<>());
            Puja p3 = new Puja(1000, s1, pj2, l1);
                pj2.addPuja(p3);
                s1.addPuja(p3);
                l1.addPuja(p3);
            Puja p4 = new Puja(600, s1, pj2, l1);
                pj2.addPuja(p4);
                s1.addPuja(p4);
                l1.addPuja(p4);

        System.out.println();
        System.out.println(s1);
        for (Lote l: s1.getLotes()) {
            System.out.println("\t" + l);
            for (Articulo a: l.getArticulos()) {
                System.out.println("\t\t" + a);
            }
            System.out.println();
            for (Puja p: l.getPujas()) {
                System.out.println("\t\t\t" + p);
            }
        }
        System.out.println();
        System.out.println(pj1);
        for (Puja p: pj1.getPujas()) {
            System.out.println("\t" + p);
        }
        System.out.println();
        System.out.println(pj2);
        for (Puja p: pj2.getPujas()) {
            System.out.println("\t" + p);
        }
        System.out.println();
        int PujaMasAlta = 0;
        for (Puja p: l1.getPujas()) {
            PujaMasAlta = p.getCant_puja();
            if (p.getCant_puja() > PujaMasAlta){
                PujaMasAlta = p.getCant_puja();
            }else{
                break;
            }
        }
        String ganador = "";
        if (PujaMasAlta != 0){
            for (Puja p: l1.getPujas()) {
                if (PujaMasAlta == p.getCant_puja()){
                    ganador = String.valueOf(p.getPujador());
                }else{
                    break;
                }
            }
            System.out.println("Ganador de la puja: \n\t" + ganador);
        }else{
            System.out.println("No adjudicado");
        }

    }
}
