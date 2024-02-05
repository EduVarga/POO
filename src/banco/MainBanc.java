package banco;

import java.util.HashSet;

public class MainBanc {
    public static void main(String[] args) {

        Banc b1 = new Banc(1, new HashSet<>());
            Sucursal s1 = new Sucursal(45,b1, new HashSet<>(), new HashSet<>());
                b1.addSucursal(s1);
            Client c1 = new Client("X4718738I", new HashSet<>(), new HashSet<>());
                Prestec p1 = new Prestec(1,s1,c1);
                    s1.addPrestamo(p1);
                Prestec p3 = new Prestec(3,s1,c1);
                    s1.addPrestamo(p3);
                    c1.addPrestec(p1);
                    c1.addPrestec(p3);
                Compte co1 = new Compte(1,s1, new HashSet<>(), new HashSet<>());
                    s1.addCompte(co1);
                    Domiciliacio d1 = new Domiciliacio(1,co1);
                        co1.addDomiciliacio(d1);
                    Domiciliacio d2 = new Domiciliacio(2,co1);
                        co1.addDomiciliacio(d2);
                Compte co2 = new Compte(2,s1, new HashSet<>(), new HashSet<>());
                    s1.addCompte(co2);
                    co1.addClient(c1);
                    co2.addClient(c1);
                c1.addCompte(co1);
                c1.addCompte(co2);
            Sucursal s2 = new Sucursal(237,b1, new HashSet<>(), new HashSet<>());
                b1.addSucursal(s2);
            Client c2 = new Client("L48419441I", new HashSet<>(), new HashSet<>());
                Prestec p2 = new Prestec(2,s2,c2);
                    s2.addPrestamo(p2);
                Prestec p4 = new Prestec(4,s2,c2);
                    s2.addPrestamo(p4);
                    c2.addPrestec(p2);
                    c2.addPrestec(p4);
                Compte co3 = new Compte(3, s2, new HashSet<>(), new HashSet<>());
                    s2.addCompte(co3);
                    Domiciliacio d3 = new Domiciliacio(3,co3);
                        co3.addDomiciliacio(d3);
                    Domiciliacio d4 = new Domiciliacio(4,co3);
                        co3.addDomiciliacio(d4);
                    Domiciliacio d5 = new Domiciliacio(5,co3);
                        co3.addDomiciliacio(d5);
                Compte co4 = new Compte(4, s2, new HashSet<>(), new HashSet<>());
                    s2.addCompte(co4);
                    co3.addClient(c2);
                    co4.addClient(c2);
                c2.addCompte(co3);
                c2.addCompte(co4);

                /*Tiene t1 = new Tiene("Privilegio 1", co1, c1);
                Tiene t2 = new Tiene("Privilegio 2", co3, c2);

        System.out.println(t1);*/

        System.out.println(b1);
        for (Sucursal s: b1.getSucursales()) {
            System.out.println("\t" + s);
            for (Prestec p: s.getPrestamos()) {
                System.out.println("\t\t" + p);
            }
            System.out.println();
            for (Compte c: s.getComptes()) {
                System.out.println("\t\t" + c);
                for (Domiciliacio d: c.getDomiciliacions()) {
                    System.out.println("\t\t\t" + d);
                }
                System.out.println();
                for (Client cl: c.getClients()) {
                    System.out.println("\t\t\t" + cl);
                    for (Prestec pr: cl.getPrestecs()) {
                        System.out.println("\t\t\t\t" + pr);
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(b1);
        for (Sucursal s: b1.getSucursales()) {
            System.out.println("\t" + s);
            for (Prestec p: s.getPrestamos()) {
                System.out.println("\t\t" + p);
            }
            System.out.println();
            for (Compte c: s.getComptes()) {
                System.out.println("\t\t" + c);
            }
        }
        System.out.println();
        System.out.println(c1);
        for (Prestec p: c1.getPrestecs()) {
            System.out.println("\t" + p);
        }
        System.out.println();
        System.out.println(c2);
        for (Prestec p: c2.getPrestecs()) {
            System.out.println("\t" + p);
        }
        System.out.println();
        System.out.println(c1);
        for (Compte c: c1.getComptes()) {
            System.out.println("\t" + c);
        }
        System.out.println();
        System.out.println(c2);
        for (Compte c: c2.getComptes()) {
            System.out.println("\t" + c);
        }
        System.out.println();
        System.out.println(co1);
        for (Client c: co1.getClients()) {
            System.out.println("\t" + c);
        }
        System.out.println();
        System.out.println(co3);
        for (Client c: co3.getClients()) {
            System.out.println("\t" + c);
        }
        System.out.println();
        System.out.println(co1);
        for (Domiciliacio d: co1.getDomiciliacions()) {
            System.out.println("\t" + d);
        }
        System.out.println();
        System.out.println(co3);
        for (Domiciliacio d: co3.getDomiciliacions()) {
            System.out.println("\t" + d);
        }

    }
}
