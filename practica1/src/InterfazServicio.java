/**
 * Interfaz que define el comportamiento en común de los servicios.
 */
public interface InterfazServicio {

    public void bienvenida(Usuario u);

    public void recomendar(Usuario u, int dia);

    public void cobrar(Usuario u, int dia);
}