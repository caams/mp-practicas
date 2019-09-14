public class Cocinando implements EstadoRobot {

    Robot robot;

    public Cocinando(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override public void suspenderse() {
        System.out.println("No puedo suspenderme mientras cocino, sería peligroso.");
    }

    @Override public void caminar() {
        System.out.println("No puedo caminar mientras cocino, sería peligroso.");
    }

    @Override public void pedirOrden(String pedido) {
        System.out.println("No puedo pedir otra orden mientras cocino.");
        if (!robot.getPreparando()) {
            robot.setEventoRobot(robot.getAtendiendo());
        }
    }

    @Override public void cocinar(String pedido) {
        System.out.println("Ya estoy cocinando.");
    }

}