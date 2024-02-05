package Ejercicio6;

import java.util.HashSet;

public class MainEJ6 {
    public static void main(String[] args) {

        AreaConeixement a1 = new AreaConeixement("Informática", new HashSet<>());
            Departament d1 = new Departament("Informática", a1, new HashSet<>(), new HashSet<>());
                a1.addDpertament(d1);
                Profesor p1 = new Profesor("Jose", d1, new HashSet<>());
                    d1.addProfesor(p1);
                Profesor p2 = new Profesor("Marta", d1, new HashSet<>());
                    d1.addProfesor(p2);
                Facultat f1 = new Facultat("Desarrollo de Aplicaciones Web", new HashSet<>());
                Catedra c1 = new Catedra("Bases de Datos", d1, new HashSet<>(), f1);
                    d1.addCatedra(c1);
                    c1.addProfesor(p1);
                    c1.addProfesor(p2);
                Catedra c2 = new Catedra("Programación", d1, new HashSet<>(), f1);
                    d1.addCatedra(c2);
                    c2.addProfesor(p1);
                    c2.addProfesor(p2);
                p1.addCatedra(c1);
                p1.addCatedra(c2);
                p2.addCatedra(c1);
                p2.addCatedra(c2);
                f1.addCatedra(c1);
                f1.addCatedra(c2);
            Departament d2 = new Departament("TIC", a1, new HashSet<>(), new HashSet<>());
                a1.addDpertament(d2);
                Profesor p3 = new Profesor("Pedro", d2, new HashSet<>());
                    d2.addProfesor(p3);
                Facultat f2 = new Facultat("Ciberseguridad", new HashSet<>());
                Catedra c3 = new Catedra("Seguridad de la Información", d2, new HashSet<>(), f2);
                    d2.addCatedra(c3);
                    c3.addProfesor(p3);
                Catedra c4 = new Catedra("Infraestructura de Redes", d2, new HashSet<>(), f2);
                    d2.addCatedra(c4);
                    c4.addProfesor(p3);
                Catedra c5 = new Catedra("Telecomunicaciones", d2, new HashSet<>(), f2);
                    d2.addCatedra(c5);
                    c5.addProfesor(p3);
                p3.addCatedra(c3);
                p3.addCatedra(c4);
                p3.addCatedra(c5);
                f2.addCatedra(c3);
                f2.addCatedra(c4);
                f2.addCatedra(c5);

        System.out.println(a1);
        for (Departament d: a1.getDepartaments()) {
            System.out.println("\t" + d);
            for (Profesor p: d.getProfesores()) {
                System.out.println("\t\t" + p);
                for (Catedra c: p.getCatedras()) {
                    System.out.println("\t\t\t" + c);
                }
            }
            System.out.println();
            for (Catedra c: d.getCatedras()) {
                System.out.println("\t\t" + c);
                for (Profesor p: c.getProfesors()) {
                    System.out.println("\t\t\t" + p);
                }
            }
        }
        System.out.println();
        System.out.println(f1);
        for (Catedra c: f1.getCatedras()) {
            System.out.println("\t" + c);
        }
        System.out.println();
        System.out.println(f2);
        for (Catedra c: f2.getCatedras()) {
            System.out.println("\t" + c);
        }

    }
}
