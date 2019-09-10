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
     * Da la recomendación diaria al usuario.
     * @param u el usuario a dar la recomendación.
     * @param dia el día de la recomendación específica.
     */
    public void recomendar(Usuario u, int dia);

    /**
     * Cobra al usuario por día de suscripción.
     * @param u el usuario al que se debe cobrar.
     * @param dia el día a cobrar.
     */
    public void cobrar(Usuario u, int dia);
}