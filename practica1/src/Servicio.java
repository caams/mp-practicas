import java.util.LinkedList;

abstract public class Servicio implements InterfazServicio{

    protected String nombre;
    protected int costo;
    protected LinkedList<Usuario> suscriptores;

    /**
     * Define el estado inicial de cada servicio.
     * @param nombre el nombre del servicio.
     * @param costo el costo del servicio.
     * @param suscriptores la lista de suscriptores al servicio.
     */
    public Servicio(String nombre, int costo, LinkedList<Usuario> suscriptores){
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

    /**
     * Regresa la lista de los suscriptores.
     * @return la lista de los suscriptores.
     */
    public LinkedList<Usuario> getSuscriptores(){
        return suscriptores;
    }

    public abstract String agregar(Usuario u);

    public abstract String remover(Usuario u);

    public abstract String notificar();

}