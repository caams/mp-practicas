public class Robot {

    EstadoRobot suspendido;
    EstadoRobot caminando;
    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot estadoActual;
    //boolean activo = false;
    //boolean preparando = false;
    //String pedido;
    MenuArreglo menu1 = new MenuArreglo();
    MenuLista menu2 = new MenuLista();
    MenuHash menu3 = new MenuHash();

    public Robot() {
        suspendido = new Suspendido(this);
        caminando = new Caminando(this);
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        estadoActual = suspendido;
    }

    public void setEventoRobot(EstadoRobot nuevoEstado) {
        estadoActual = nuevoEstado;
    }
    
/*
    public void setRobotActivo(boolean activo) {
        this.activo = activo;
    }
    
    public boolean getPreparando() {
        return preparando;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
    */

    public EstadoRobot getSuspendido() {
        return suspendido;
    }

    public EstadoRobot getCaminando() {
        return caminando;
    }

    public EstadoRobot getAtendiendo() {
        return atendiendo;
    }

    public EstadoRobot getCocinando() {
        return cocinando;
    }

    public void activarse(){
        this.estadoActual.activarse();
    }

    public void suspenderse(){
        this.estadoActual.suspenderse();
    }

    public void atender() {
        this.estadoActual.atender();
    }

    public void cocinar(int pedido) {
        this.estadoActual.cocinar(pedido);
    }

    public void display() {
        System.out.println("\n-- Robot's Actions --");
        System.out.println(
        "Soy un robot a tu servicio, qué deseas que haga?\n" +
        "\n==================================" +
        "\n|   Bienvenido a MCHamburguesas! |" +
        "\n==================================" +
        "\n| Selecciona una opción:         |" +
        "\n|        1. Activar              |" +//Se activa y empieza a caminar
        "\n|        2. Atender              |" +//Atiende al cliente
        "\n|        3. Ver menú             |" +
        "\n|        4. Ordenar              |" +//Cocina la opción elegida por el cliente
        "\n|        5. Exit                 |" +
        "\n==================================" 
        );
        System.out.print("\nOpción: ");
        
                
    }

    public void leerMenu(){
        menu1.menuBasico();
        menu2.menuDiario();
        menu3.menuDeLujo();

    }
}