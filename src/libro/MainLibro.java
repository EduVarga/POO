package libro;

public class MainLibro {
    public static void main(String[] args) {
        Autor a1 = new Autor("libro.Autor 1", "xx-xx-xxxx");
        Autor a2 = new Autor("libro.Autor 2", "yy-yy-yyyy");

        Tema t1 = new Tema("libro.Tema 1");
        Tema t2 = new Tema("libro.Tema 2");

        Libro l1 = new Libro("Titulo 1", a1, 46);
        Libro l2 = new Libro("Titulo 2", a2, 200);

        l1.addTema(t1);
        l1.addTema(t2);

        System.out.println(l1);
        System.out.println(l2);
    }
}
