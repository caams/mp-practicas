/**
 * Interfaz que define el comportamiento en común de los servicios.
 */
public interface InterfazServicio {

    /**
     * Da la bienvendida al usario.
     * @param u el usuario a quien da la bienvenida.
     */
    public void bienvenida(Usuario u);

    /**
     * Notifica al usuario.
     */
    public void notificar();

    /**
     * Cobra al usuario por día de suscripción.
     * @param u el usuario al que se debe cobrar.
     * @param dia el día a cobrar.
     */
    public void cobrar(Usuario u, int dia);
}