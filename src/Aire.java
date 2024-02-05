public class Aire {
    private String nombre;
    private int maxima;
    private int minima;
    private int temperatura;
    public Aire(String nombre, int maxima, int minima, int temperatura) {
        this.nombre = nombre;
        this.maxima = maxima;
        this.minima = minima;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public int getMinima() {
        return minima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    public void subir(){
        if (this.temperatura < this.maxima){
            temperatura++;
        }else{
            throw new IllegalArgumentException("La temperatura no puede ser mayor que " + this.maxima);
        }
    }
    public void bajar(){
        if (this.temperatura > this.minima){
            temperatura--;
        }else{
            throw new IllegalArgumentException("La temperatura no puede ser menor que " + this.minima);
        }
    }

    public String toString(){
        return "· " + this.nombre + "\n\t" + "Máx: " + this.maxima + " - " + "Mín: " + this.minima + "\n\t" + "Temperatura: " + this.temperatura;
    }

    public static void main(String[] args) {
        Aire a1 = new Aire("Daikin FTXB35C + RXB35C", 30,2, 25);
        a1.subir();
        a1.subir();
        a1.subir();
        Aire a2 = new Aire("LG LP1419IVSM", 25,5, 20);
        a2.bajar();
        a2.bajar();
        Aire a3 = new Aire("Haier Serenity Series ESAQ406T", 30,0, 12);
        a3.bajar();
        a3.subir();
        a3.subir();
        System.out.println(a1 + "\n" + a2 + "\n" + a3);
    }
}
