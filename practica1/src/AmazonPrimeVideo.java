public class AmazonPrimeVideo extends Servicio implements InterfazServicio {

    public AmazonPrimeVideo(String nombre, int costo) {
        super(nombre, costo);
    }

    @Override public String bienvenida(Usuario u) {
        return null;
    }

    @Override public String recomendar(Usuario u) {
        return null;
    }

    @Override public void cobrar() {
        // TODO Auto-generated method stub
    }
}