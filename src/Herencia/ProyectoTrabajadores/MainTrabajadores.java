package Herencia.ProyectoTrabajadores;

public class MainTrabajadores {
    public static void main(String[] args) {

        Oficial o = new Oficial("Juan");
        System.out.println();
        System.out.println(o);
        Tecnico t = new Tecnico("Pedro");
        System.out.println(t);
        Operario op = new Operario("Jose");
        System.out.println(op);
        Directivo d = new Directivo("María");
        System.out.println(d);
        Empleado e = new Empleado("Pablo");
        System.out.println(e);

    }
}