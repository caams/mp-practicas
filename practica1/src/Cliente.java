
/**
 * Clase para representar clientes. Un cliente tiene un
 * nombre, un usuario y cierta cantidad de dinero.
 */
public class Cliente{

    private String nombre;
    private int dinero;
    
    /**
     * Define el estado inicial del cliente.
     * @param nombre el nombre del cliente.
     * @param dinero la cantidad de dinero disponible del cliente.
     */
    public Cliente(String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
    }

    /**
     * Regresa el nombre del cliente.
     * @return el nombre del cliente.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Define el nombre del cliente.
     * @param nombre el nuevo nombre del cliente.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Regresa el dinero del cliente-
     * @return el dinero del cliente.
     */
    public int getDinero(){
        return dinero;
    }

    /**
     * Define el dinero del cliente.
     * @param dinero el nuevo dinero del cliente.
     */
    public void setDinero(int dinero){
        this.dinero = dinero;
    }

    public void suscribir(String servicio){

    }

    public void cancelarServicio(String servicio){
        
    }
}