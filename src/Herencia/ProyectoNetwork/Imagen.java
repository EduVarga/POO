package Herencia.ProyectoNetwork;

public class Imagen extends Publicacion{
    private String imagen;
    private String titulo;

    public Imagen(Usuario usuario, String imagen, String titulo) {
        super(usuario);
        this.imagen = imagen;
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String toString(){
        return this.imagen + " " + this.titulo + "\n\t" + super.toString();
    }
}
