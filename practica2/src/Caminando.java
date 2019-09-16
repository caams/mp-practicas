public class Caminando implements EstadoRobot {

    Robot robot;
    Hamburguesa menu;

    public Caminando(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override
    public void activarse() {
        System.out.println("Ya estoy activado, me encuentro caminando...");
    }

    @Override 
    public void suspenderse() {
        System.out.println("\nSuspendiendo..." + "\nRobot suspendido. [ -c°▥°]-c");
        robot.setEventoRobot(robot.getSuspendido());
        //robot.setRobotActivo(false);
    }

    @Override 
    public void caminar() {
        System.out.println("Ya estoy caminando...");        
    }

    @Override 
    public void atender() {
        System.out.println("\nEn camino a atender tu orden." + "\nRobot atendiendo. [ -c°▥°]-c");
        robot.setEventoRobot(robot.getAtendiendo());
    }

    @Override 
    public void cocinar(int pedido) {
        System.out.println("No puedo cocinar mientras camino, sería muy peligroso.");
    }

}