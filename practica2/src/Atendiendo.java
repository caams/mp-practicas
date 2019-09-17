public class Atendiendo implements EstadoRobot {

    Robot robot;
    Hamburguesa menu;

    public Atendiendo(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override
    public void activarse() {
        System.out.println("\nYa estoy activado, me encuentro atendiendo tu orden...");       
    }

    @Override 
    public void suspenderse() {
        System.out.println("\nNo puedo suspenderme mientras estoy atendiendo a alguien.");
    }

    @Override 
    public void caminar() {
        System.out.println("\nNo puedo caminar mientras estoy atendiendo a alguien");
    }

    @Override 
    public void atender() {
        System.out.println("\nSolo puedo atender una orden a la vez");
    }

    @Override 
    public void cocinar(int pedido) {
        System.out.println("Así que ya estás listo para ordenar. \nRobot cocinando [ -c°▥°]-c");
        //menu.setId(pedido);
        //menu.rutinaCoccion();
        //robot.leerMenu();
        robot.setEventoRobot(robot.getCocinando());
    }

}