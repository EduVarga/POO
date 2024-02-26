package Herencia.Ejercicio1;

public class CuerpoTecnico extends Equipo{
    public CuerpoTecnico(String nombre) {
        super(nombre);
    }
    public void formarParte(){
        System.out.println("Formo parte del cuerpo técnico");
    }
}
