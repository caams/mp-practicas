import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 * Clase para representar usuarios. Un usuario tiene un
 * nombre, un usuario y cierta cantidad de dinero.
 */
public class Usuario implements Observer {

    private String nombre;
    private int dinero;
    private ArrayList<String> suscripciones;
    boolean premium = false;
    
    
    /**
     * Define el estado inicial del usuario.
     * @param nombre el nombre del usuario.
     * @param dinero la cantidad de dinero disponible del usuario.
     */
    public Usuario(String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
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
     * Regresa el dinero del usuario-
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

    public void update(Observable o, Object arg){
        
    }

    public void suscribir(String servicio){

    }

    public void cancelarServicio(String servicio){
        
    }
}