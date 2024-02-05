public class Cuenta {
    private String titular;
    private double cantidad;
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        setCantidad(cantidad);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if (cantidad >= 0){
            this.cantidad = cantidad;
        }else{
            this.cantidad = 0;
        }
    }
    public void retirar(double cantidadRetirar){
        if (this.cantidad > cantidadRetirar){
            cantidad -= cantidadRetirar;
        }else{
            cantidad = 0;
        }
    }
    public String toString(){
        return "Titular: " + this.titular + "\n\t" + "Cantidad: " + this.cantidad;
    }

    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("José", -200);
        Cuenta c2 = new Cuenta("Manuel", 180);
        c2.retirar(150);
        Cuenta c3 = new Cuenta("María", 200);
        c3.retirar(250);
        Cuenta c4 = new Cuenta("Ana");
        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4);
    }

}
