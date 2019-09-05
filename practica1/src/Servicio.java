import java.util.ArrayList;

abstract public class Servicio implements InterfazServicio{

    private String nombre;
    private int costo;
    private ArrayList<String> suscriptores;

    /**
     * Define el estado inicial de cada servicio.
     * @param nombre el nombre del servicio.
     * @param costo el costo del servicio.
     * @param suscriptores la lista de suscriptores al servicio.
     */
    public Servicio(String nombre, int costo, ArrayList<String> suscriptores){
        this.nombre = nombre;
        this.costo = costo;
        this.suscriptores = suscriptores;
    }

    /**
     * Regresa el nombre del servicio.
     * @return el nombre del servicio.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Define el nombre del servicio.
     * @param nombre el nuevo nombre del servicio.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el costo del servicio.
     * @return el costo del servicio.
     */
    public int getCosto(){
        return costo;
    }

    /**
     * Define el costo del servicio.
     * @param costo el nuevo costo del servicio.
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    /*
    public ArrayList<String> getSuscriptores(){
        return suscriptores;
    }

    public ArrayList<String> setSuscriptores(){
        this.suscriptores = suscriptores;
    }
    */

    public void cobrar(String usuario){

    }

    public String cancelarServicio(){
        return "";
    }

    public String notificarCobro(){
        return "";
    }

    public String recomendar(){
        return "";
    }

    public String bienvenida(String u){
        return "Hola " + u + ", bienvenido a " + getNombre();
    }


}