package Herencia.ProyectoNetwork;

public class Texto extends Publicacion {
    private String mensaje;

    public Texto(Usuario usuario, String mensaje) {
        super(usuario);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String toString(){
         return this.mensaje + "\n\t" + super.toString();
    }
}
