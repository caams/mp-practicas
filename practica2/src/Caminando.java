import java.util.Scanner;

public class Caminando implements EstadoRobot {

    Robot robot;
    Hamburguesa hamburguesa;
    Scanner entrada = new Scanner(System.in);

    public Caminando(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override public void suspenderse() {
        System.out.println("Suspendiendo...");
        robot.setEventoRobot(robot.getSuspendido());
        robot.setRobotActivo(false);
    }

    @Override public void caminar() {
        System.out.println("Caminando...");
        robot.setEventoRobot(robot.getCaminando());
    }

    @Override public void pedirOrden(int pedido) {
        robot.pedirOrden(pedido);
        robot.setEventoRobot(robot.getAtendiendo());
    }

    @Override public void cocinar(int pedido) {
        System.out.println("No puedo cocinar mientras camino, sería muy peligroso.");
    }

}