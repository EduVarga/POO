package ordenador;

public class MainOrdenador {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador("Ordenador 1", 1750);
        Ordenador o2 = new Ordenador("Ordenador 2", 950);
        Ordenador o3 = new Ordenador("Ordenador 3", 1200);
        System.out.println(o1 + "\n" + o2 + "\n" + o3);
    }
}
