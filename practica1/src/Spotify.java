import java.util.LinkedList;

public class Spotify extends Servicio {

    public Spotify(String nombre, int costo, LinkedList<Usuario> suscriptores) {
        super(nombre, costo, suscriptores);
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
    
    @Override public void agregar(Usuario s) {
        // TODO Auto-generated method stub
    }

    @Override public void remover(Usuario s) {
        // TODO Auto-generated method stub
    }

    @Override public void notificar() {
        // TODO Auto-generated method stub
    }
}