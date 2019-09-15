import java.util.Scanner;

public class Robot {

    EstadoRobot suspendido;
    EstadoRobot caminando;
    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot estadoActual;
    Hamburguesa hamburguesa;
    Scanner entrada = new Scanner(System.in);
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

    public void suspenderse() {}

    public void caminar() {}

    public void pedirOrden(int pedido) {
        System.out.println("Bienvenido a McHamburguesas, ¿qué le gustaria ordenar?");
        MenuArreglo menu1 = new MenuArreglo();
        MenuHash menu2 = new MenuHash();
        MenuLista menu3 = new MenuLista();
        System.out.println("Inserte el id de la hamburguesa");
        int p = entrada.nextInt();
        hamburguesa.setId(p);
    }

    public void cocinar(int pedido) {}

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