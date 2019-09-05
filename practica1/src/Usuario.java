//import java.util.Observable;
//import java.util.Observer;
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
    private Servicio servicio;
    /* Variable que nos dice si es usuario premium o no. */
    private boolean premium;
    /* Estado del servicio (o recomendaciones) al que está suscrito el usuario. */
    private String recomendacion:
    
    
    
    public Usuario(String nombre, int dinero, Servicio servicio){
        this.nombre = nombre;
        this.dinero = dinero;
        this.servicio = servicio;
        premium = false;
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

    @Override
    public void update(){
        recomendacion = servicio.getRecomendacion();
    }

    public void suscribir(Servicio servicio){
        servicio.agregar(this);
    }

    public void cancelarServicio(Servicio servicio){
        servicio.remover(this);
    }
}