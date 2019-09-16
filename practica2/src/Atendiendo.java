public class Atendiendo implements EstadoRobot {

    Robot robot;
    Hamburguesa menu;

    public Atendiendo(Robot nuevoRobot) {
        robot = nuevoRobot;
    }

    @Override
    public void activarse() {
        System.out.println("Ya estoy activado, me encuentro atendiendo tu orden...");       
    }

    @Override 
    public void suspenderse() {
        System.out.println("No puedo suspenderme mientras estoy atendiendo a alguien.");
    }

    @Override 
    public void caminar() {
        System.out.println("No puedo caminar mientras estoy atendiendo a alguien");
    }

    @Override 
    public void atender() {
        System.out.println("Solo puedo atender una orden a la vez");
    }

    @Override 
    public void cocinar(int pedido) {
        System.out.println("Cocinando...");
        //menu.setId(pedido);
        //menu.rutinaCoccion();
        robot.setEventoRobot(robot.getCocinando());
    }

}