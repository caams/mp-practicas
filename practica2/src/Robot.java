import java.util.ArrayList;
import java.util.Iterator;

public class Robot {

    EstadoRobot suspendido;
    EstadoRobot caminando;
    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot estadoActual;
    //boolean activo = false;
    boolean preparando = false;
    //String pedido;
    //ArrayList menus = new ArrayList();
    MenuArreglo menu1 = new MenuArreglo();
    MenuLista menu2 = new MenuLista();
    MenuHash menu3 = new MenuHash();

    public Robot() {
        suspendido = new Suspendido(this);
        caminando = new Caminando(this);
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        estadoActual = suspendido;
        //menus.add(menu1);
        //menus.add(menu2);
        //menus.add(menu3);
    }

    public void setEventoRobot(EstadoRobot nuevoEstado) {
        estadoActual = nuevoEstado;
    }
    
/*
    public void setRobotActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }*/

    public boolean getPreparando() {
        return preparando;
    }  
    

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
        "\n|        5. Suspender            |" +
        "\n|        6. Exit                 |" +
        "\n==================================" 
        );
        System.out.print("\nOpción: ");     
    
                
    }

    public void leerMenu(){
        menu1.menuBasico();
        menu2.menuDiario();
        menu3.menuDeLujo();

    }

    public void prepararHamburguesa(int id) {
        if (id <= 3) {
            Iterator<Hamburguesa> menuB = menu1.createIterator();
            while (menuB.hasNext()) {
                Hamburguesa ham = menuB.next();
                if(ham.getId() == id){
                    ham.preparar();
                    ham.entregarOrden();
                    this.preparando = false;
                }
            }
        }
        else if (id > 3 && id < 11) {
            Iterator<Hamburguesa> menuD = menu2.createIterator();
            while (menuD.hasNext()) {
                Hamburguesa ham = menuD.next();
                if(ham.getId() == id){
                    ham.preparar();
                    ham.entregarOrden();
                    this.preparando = false;
                }
            }
        }
        else if (id < 14 && id > 10) {
            Iterator<Hamburguesa> menuL = menu3.createIterator();
            while (menuL.hasNext()) {
                Hamburguesa ham = menuL.next();
                if(ham.getId() == id){
                    ham.preparar();
                    ham.entregarOrden();
                    this.preparando = false;
                }
            }
        }else{
        System.out.println("\nID inválido.");
        this.preparando = false;
        }
    }
    
}