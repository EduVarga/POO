package Herencia.ProyectoNetwork;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nombre;
    private Set<Publicacion> publicaciones;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }
    public String toString(){
        return this.nombre;
    }
}
