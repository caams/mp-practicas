public class Caminando implements EstadoRobot {

    Robot robot;
    Menu menu;

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
        robot.setEventoRobot(robot.getAtendiendo());
    }

    @Override public void pedirOrden(String pedido) {
        System.out.println("No puedo pedir ordenes mientras camino");
    }

    @Override public void cocinar(String pedido) {
        System.out.println("No puedo cocinar mientras camino, sería muy peligroso.");
    }

}