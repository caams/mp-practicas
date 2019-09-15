public class Atendiendo implements EstadoRobot {

    Robot robot;
    Menu menu;

    public Atendiendo(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override public void suspenderse() {
        System.out.println("No puedo suspenderme mientras estoy atendiendo a alguien.");
    }

    @Override public void caminar() {
        System.out.println("No puedo caminar mientras estoy atendiendo a alguien");
    }

    @Override public void pedirOrden(int pedido) {
        System.out.println("Solo puedo atender una orden a la vez");
    }

    @Override public void cocinar(int pedido) {
        System.out.println("Cocinando...");
        
        robot.setEventoRobot(robot.getCocinando());
    }

}