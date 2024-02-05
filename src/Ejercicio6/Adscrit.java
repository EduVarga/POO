package Ejercicio6;

public class Adscrit {
    private String data;
    private Catedra catedra;
    private Profesor profesor;

    public Adscrit(String data, Catedra catedra, Profesor profesor) {
        this.data = data;
        this.catedra = catedra;
        this.profesor = profesor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String toString(){ return "Fecha inscripción: " + this.data; }
}
