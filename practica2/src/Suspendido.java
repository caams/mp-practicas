public class Suspendido implements EstadoRobot{

    Robot robot;

    public Suspendido(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override public void suspenderse() {
        System.out.println("Ya estoy suspendido.");
    }

    @Override public void caminar() {
        System.out.println("Caminando...");
        robot.setEventoRobot(robot.getCaminando());
        robot.setRobotActivo(true);
    }

    @Override public void pedirOrden(String pedido) {
        System.out.println("No puedo pedir ordenes mientras estoy suspendido.");
    }

    @Override public void cocinar(String pedido) {
        System.out.println("No puedo cocinar mientras estoy suspendido.");
    }

}