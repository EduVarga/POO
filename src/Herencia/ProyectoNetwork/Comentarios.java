package Herencia.ProyectoNetwork;

public class Comentarios {
    private String comentario;

    public Comentarios(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String toString(){
        return this.comentario;
    }
}
