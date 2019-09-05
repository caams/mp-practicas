import java.util.LinkedList;

public class Spotify extends Servicio implements InterfazServicio {

    public Spotify(String nombre, int costo, LinkedList<Usuario> suscriptores) {
        super(nombre, costo);
    }

    @Override public String bienvenida(Usuario u) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override public String recomendar(Usuario u) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override public void cobrar() {
        // TODO Auto-generated method stub
    }
}