import java.util.LinkedList;

public class Netflix extends Servicio {

    public Netflix(String nombre, int costo, LinkedList<Usuario> suscriptores) {
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

    @Override public void agregar(Usuario s) {
        suscriptores.add(s);
    }

    @Override public void remover(Usuario s) {
        System.out.println("Gracias por contratar Netflix.");
        suscriptores.remove(s);
    }

    @Override public void notificar() {
        for (Usuario u : suscriptores)
            u.update();
    }
}