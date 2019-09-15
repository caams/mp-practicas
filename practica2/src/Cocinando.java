public class Cocinando implements EstadoRobot {

    Robot robot;

    public Cocinando(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override public void suspenderse() {
        System.out.println("Suspendiendome... Tenga buena tarde.");
        robot.setEventoRobot(robot.getSuspendido());
    }

    @Override public void caminar() {
        System.out.println("No puedo caminar mientras cocino, sería peligroso.");
    }

    @Override public void pedirOrden(int pedido) {
        System.out.println("No puedo pedir otra orden mientras cocino.");
        if (!robot.getPreparando()) {
            robot.setEventoRobot(robot.getAtendiendo());
        }
    }

    @Override public void cocinar(int pedido) {
        System.out.println("Ya estoy cocinando.");
    }

}