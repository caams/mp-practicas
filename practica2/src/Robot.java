public class Robot {

    EstadoRobot suspendido;
    EstadoRobot caminando;
    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot estadoActual;
    boolean activo = false;
    boolean preparando = false;
    String pedido;
    MenuArreglo menu1 = new MenuArreglo();
    MenuLista menu2 = new MenuLista();
    MenuHash menu3 = new MenuHash();

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

    public void display() {
        System.out.println("-- Actions --");
        System.out.println(
        "Selecciona una opción: \n" +
        "  1) Activar\n" +//Se activa y empieza a caminar
        "  2) Atender\n" +//Atiende al cliente
        "  3) Ver menú\n" +
        "  4) Cocinar \n" +//Cocina la opción elegida por el cliente
        "  5) Exit\n "
        );
        
    }

    public void leerMenu(){

        menu1.menuBasico();
        menu2.menuDiario();
        menu3.menuDeLujo();

    }
}