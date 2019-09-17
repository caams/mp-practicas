public class Cocinando implements EstadoRobot {

    Robot robot;
    //Hamburguesa ham;

    public Cocinando(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override
    public void activarse() {
        System.out.println("Ya estoy activado, me encuentro cocinando...");
    }

    @Override 
    public void suspenderse() {
        System.out.println("No puedo suspenderme mientras cocino, sería peligroso.");
    }

    @Override 
    public void caminar() {
        System.out.println("No puedo caminar mientras cocino, sería peligroso.");
    }

    @Override 
    public void atender() {
        System.out.println("No puedo pedir otra orden mientras cocino.");
        
        if (!robot.getPreparando()) {
            robot.setEventoRobot(robot.getAtendiendo());
        }
        
    }

    @Override 
    public void cocinar(int pedido) {
        robot.preparando = true;
        System.out.println("Empezando a preparar hamburguesa. \nRobot preparando hamburguesa [ -c°▥°]-c");
        robot.prepararHamburguesa(pedido);
        robot.setEventoRobot(robot.getSuspendido());
    }

}