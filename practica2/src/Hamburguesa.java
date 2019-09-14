/**
 * Todos los platillos que están en el menú comparten la misma información: 
 * un id, el nombre del platillo, su descripción, el precio, un booleano 
 * que indica si tiene queso y un booleano que indica si es vegetariano.
 */
public class Hamburguesa extends Preparar{

    int id;
    String nombre;
    String descripcion;
    int precio;
    boolean esVegetariana;
    boolean tieneQueso;

    public Hamburguesa(int id, String nombre, String descripcion, int precio){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * @param tieneQueso nos dice si tiene queso o no.
     */
    public void setTieneQueso(boolean tieneQueso) {
        this.tieneQueso = tieneQueso;
    }

    /**
     * @param esVegetariana nos dice si es vegetariana o no.
     */
    public void setEsVegetariana(boolean esVegetariana) {
        this.esVegetariana = esVegetariana;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    
    
}