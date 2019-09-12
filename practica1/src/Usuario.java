import java.util.LinkedList;

/**
 * Clase para representar usuarios. Un usuario tiene un
 * nombre, un usuario y cierta cantidad de dinero.
 */
public class Usuario implements InterfazObservador{

    /* Nombre del usuario. */
    private String nombre;
    /* Cantidad de dinero del usuario. */
    private int dinero;
    /* Servicios a los que el usuario está suscrito. */
    //private Servicio servicio;
    /* Variable que nos dice si es usuario premium o no. */
    private LinkedList<Servicio> suscripciones;
    /* Estado del servicio (o recomendaciones) que recibe el usuario. */
    private LinkedList<String> recomendaciones;
    /* Lista de planes contratados. */
    private LinkedList<Integer> planes;
    
    
    /**
     * Define el estado inicial del usuario.
     * @param nombre el nombre del usuario.
     * @param dinero el dinero inicial del usuario.
     */
    public Usuario(String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
        this.suscripciones = new LinkedList<Servicio>(); 
        this.planes = new LinkedList<Integer>();    
        this.recomendaciones = new LinkedList<String>();
    }

    /**
     * Regresa el nombre del usuario.
     * @return el nombre del usuario.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Define el nombre del usuario.
     * @param nombre el nuevo nombre del usuario.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Regresa el dinero del usuario.
     * @return el dinero del usuario.
     */
    public int getDinero(){
        return dinero;
    }

    /**
     * Define el dinero del usuario.
     * @param dinero el nuevo dinero del usuario.
     */
    public void setDinero(int dinero){
        this.dinero = dinero;
    }

    public LinkedList<Servicio> getSuscripciones(){
        return this.suscripciones;
    }

    public LinkedList<Integer> getPlanes(){
        return this.planes;
    }

    public LinkedList<String> getNotificaciones(){
        return this.recomendaciones;
    }

    public String getServicioPlan(Servicio servicio){
        int indiceSuscipcion = this.getSuscripciones().indexOf(servicio);
        int plan = this.getPlanes().get(indiceSuscipcion);
        switch(plan){
            case 0 : return " Premium";
<<<<<<< HEAD
            case 1 : return " para 1 dispositivo.";
            case 2 : return " para 2 dispositivos.";
            case 4 : return " para 4 dispositivos.";
=======
            case 1 : return " para 1 dispositivo";
            case 2 : return " para 2 dispositivos";
            case 4 : return " para 4 dispositivos";
>>>>>>> cobro
            default: return "";
        }
    }

    @Override
<<<<<<< HEAD
    public void update(){
        recomendaciones.add(servicio.getRecomendacion());
        mostrarRecomendacion();
    }

    public void mostrarRecomendacion(){
        System.out.println(nombre + ", te recomendamos " + recomendaciones.getLast() +
                            ". Difrútalo en " + servicio.getNombre());
=======
    public void update(Servicio s){
        recomendaciones.add(s.getRecomendacion());
        mostrarRecomendacion(s);
    }

    public void mostrarRecomendacion(Servicio s){
        System.out.println(nombre + ", te recomendamos " + getNotificaciones().element() +
                            ". Difrútalo en " + s.getNombre() + ".\n");
>>>>>>> cobro
    }

    public void suscribir(Servicio servicio, int plan){
        servicio.agregar(this);
        this.getSuscripciones().add(servicio);
        this.getPlanes().add(plan);
        servicio.notificar();
    }

    public void cancelarServicio(Servicio servicio){
        servicio.remover(this);
    }

    public void simulacionPorDia(int dia){
        LinkedList<Servicio> copia = new LinkedList<Servicio>(suscripciones);
        for (Servicio s : copia) {
            if (s.getSuscriptores().contains(this)) 
                s.cobrar(this, dia); 
                this.update(s);                           
        }
        this.getNotificaciones().clear();
        System.out.println();
    }
}