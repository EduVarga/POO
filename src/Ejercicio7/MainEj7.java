package Ejercicio7;

import java.util.HashSet;

public class MainEj7 {
    public static void main(String[] args) {

        Autor a1 = new Autor(1,new HashSet<>());
        Autor a2 = new Autor(2,new HashSet<>());
            Tema t1 = new Tema(1,new HashSet<>());
            Editorial e1 = new Editorial(1,new HashSet<>());
                Libro l1 = new Libro(1234,t1,new HashSet<>(),e1,new HashSet<>());
                    t1.addLibro(l1);
                    e1.addLibro(l1);
                    l1.addAutor(a1);
                    l1.addAutor(a2);
                    a1.addLibro(l1);
                    a2.addLibro(l1);
                        Lector le1 = new Lector("Z212J",new HashSet<>(),new HashSet<>());
                        Ejemplar ej1 = new Ejemplar(1,l1,new HashSet<>(),le1);
                            ej1.addLector(le1);
                            l1.addEjemplar(ej1);
                        Ejemplar ej2 = new Ejemplar(2,l1,new HashSet<>(),le1);
                            ej2.addLector(le1);
                            l1.addEjemplar(ej2);
                            le1.addEjem(ej1);
                            le1.addEjem(ej2);

        System.out.println();
        System.out.println(a1);
        for (Libro l: a1.getLibros()) {
            System.out.println("\t" + l);
            for (Ejemplar e: l.getEjemplares()) {
                System.out.println("\t\t" + e);
                for (Lector le: e.getLectores()) {
                    System.out.println("\t\t\t" + le);
                }
            }
        }
        System.out.println();
        System.out.println(le1);
        for (Ejemplar e: le1.getEjemplar()) {
            System.out.println("\t" + e);
        }
        System.out.println();
        System.out.println(t1);
        for (Libro l: t1.getLibros()) {
            System.out.println("\t" + l);
            for (Autor a: l.getAutores()) {
                System.out.println("\t\t" + a);
            }
        }
        System.out.println();
        System.out.println(e1);
        for (Libro l: e1.getLibros()) {
            System.out.println("\t" + l);
            for (Ejemplar e: l.getEjemplares()) {
                System.out.println("\t\t" + e);
            }
        }

    }
}
