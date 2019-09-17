/**
 * Interfaz de los estados del robot, define sus acciones.
 */
public interface EstadoRobot {

    /**
     * Activa al robot, empieza a caminar 
     * y puede atender.
     */
    public void activarse();

    /**
     * Suspende al robot.
     */
    public void suspenderse();

    /**
     * Ordena al robot a caminar.
     */
    public void caminar();

    /**
     * Ordena al robot a atender al cliente.
     */
    public void atender();

    /**
     * Ordena al robot a cocinar el pedido del cliente.
     */
    public void cocinar(int pedido);

}