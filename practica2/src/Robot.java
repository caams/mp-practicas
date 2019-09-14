public class Robot {

    EstadoRobot suspendido;
    EstadoRobot caminando;
    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot estadoActual;
    boolean activo = false;
    boolean preparando = false;
    String pedido;

    public Robot() {
        suspendido = new Suspendido(this);
        caminando = new Caminando(this);
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        estadoActual = suspendido;
    }

    public void setEventoRobot(EstadoRobot nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    public void setRobotActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getPreparando() {
        return preparando;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public EstadoRobot getSuspendido() {
        return suspendido;
    }

    public EstadoRobot getCaminando() {
        return caminando;
    }

    public EstadoRobot getAtendiendo() {
        return atendiendo;
    }

    public EstadoRobot getCocinando() {
        return cocinando;
    }
}