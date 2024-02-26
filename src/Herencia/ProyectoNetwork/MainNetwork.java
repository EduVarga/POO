package Herencia.ProyectoNetwork;

public class MainNetwork {
    public static void main(String[] args) {
        Usuario Pepe = new Usuario("Pepe");
        Usuario Paco = new Usuario("Paco");
        Usuario Juan = new Usuario("Juan");

        Texto t = new Texto(Pepe,"Buenas");
        Pepe.addPublicacion(t);
        t.Like();
        t.Like();
        t.Like();
        t.Like();
        t.Like();
        Imagen i = new Imagen(Pepe,"playa.png","En la playa");
        Pepe.addPublicacion(i);
        Comentarios c1 = new Comentarios("Que playa es?");
        i.addComentario(c1);

        Texto t2 = new Texto(Paco,"Buenos días");
        Paco.addPublicacion(t2);
        Comentarios c2 = new Comentarios("Bon día");
        t2.addComentario(c2);

        Imagen i1 = new Imagen(Juan,"corte.png","Nuevo corte de pelo");
        Juan.addPublicacion(i1);
        i1.Like();
        i1.Like();

        System.out.println(Pepe);
        for (Publicacion p: Pepe.getPublicaciones()) {
            System.out.println("\t" + p);
        }
        System.out.println(Paco);
        for (Publicacion p: Paco.getPublicaciones()) {
            System.out.println("\t" + p);
        }
        System.out.println(Juan);
        for (Publicacion p: Juan.getPublicaciones()) {
            System.out.println("\t" + p);
        }

    }
}
