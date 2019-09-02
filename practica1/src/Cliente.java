
/**
 * Clase para representar clientes. Un cliente tiene un
 * nombre, un usuario y cierta cantidad de dinero.
 */
public class Cliente{

    private String nombre;
    private String usuario;
    private int dinero;
    
    /**
     * Define el estado inicial del cliente.
     * @param nombre el nombre del cliente.
     * @param usuario el usuario del cliente.
     * @param dinero la cantidad de dinero disponible del cliente.
     */
    public Cliente(String nombre, String usuario, int dinero){
        this.nombre = nombre;
        this.usuario = usuario;
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
     * Regresa el usuario del cliente.
     * @return el usuario del cliente.
     */
    public String getUsuario(){
        return usuario;
    }

    /**
     * Define el usuario del cliente.
     * @param usuario el nuevo usuario del cliente.
     */
    public void setUsuario(String usuario){
        this.usuario = usuario;
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