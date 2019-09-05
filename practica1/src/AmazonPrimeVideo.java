import java.util.LinkedList;

public class AmazonPrimeVideo extends Servicio{

    public AmazonPrimeVideo(String nombre, int costo, LinkedList<Usuario> suscriptores) {
        super(nombre, costo, suscriptores);
    }

    @Override public String bienvenida(Usuario u) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String recomendar(Usuario u) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override public void cobrar() {
        // TODO Auto-generated method stub

    }

    @Override public String remover() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override public String notificar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override public String agregar() {
        // TODO Auto-generated method stub
        return null;
    }
}