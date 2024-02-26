package Herencia.ProyectoNetwork;

import org.w3c.dom.Text;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Publicacion {
    private static int cuenta = 0;
    private int ID;
    private Usuario usuario;
    private Date fecha;
    private int likes;
    private Set<Comentarios> comentarios;

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;
        this.likes = 0;
        this.ID = cuenta++;
        this.fecha = new Date();
        this.comentarios = new HashSet<>();
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Publicacion.cuenta = cuenta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Set<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }
    public void Like(){
        this.likes++;
    }
    public void addComentario(Comentarios comentarios){
        this.comentarios.add(comentarios);
    }
    public String toString(){
        return this.ID + " Likes: " + this.likes + " " + this.fecha + " " + this.usuario + " \n\t" + this.comentarios + "\n\t";
    }
}
