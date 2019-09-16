/**
 * Todos los platillos que están en el menú comparten la misma información: 
 * un id, el nombre del platillo, su descripción, el precio, un booleano 
 * que indica si tiene queso y un booleano que indica si es vegetariano.
 */
public abstract class Hamburguesa {

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
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the id
     */
    public int getId() {
        return this.id;
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

    public void getHamburguesa(){
        String format =  String.format("%d %s. Descripción: %s  $%d", 
                                        id, nombre, descripcion, precio);
        System.out.println(format);
    }

    //public void prepararID(int id){}

    abstract void prepararCarne();
    
    abstract void ponerCarne();

	abstract void ponerQueso();

	/*
	* Metodo template (plantilla)
	*/
	public final void rutinaCoccion(){
        ponerPan();
        ponerMayonesa();
        prepararCarne();//hook
        ponerCarne();//hook
        ponerQueso();//hook
        ponerVegetales();
        ponerCatsup();
        ponerPan();
	}

	void ponerPan(){
		System.out.println("\nPoner pan [ -c°▥°]-c. Estoy poniendo el pan.");
	}

	void ponerMayonesa(){
		System.out.println("Poner mayonesa [ -c°▥°]-c. Estoy untando la mayonesa en el pan.");
	}

	void ponerVegetales(){
		System.out.println("Poner vegetales [ -c°▥°]-c. Estoy poniendo los vegetales.");
	}

	void ponerCatsup(){
		System.out.println("Poner catsup [ -c°▥°]-c. Estoy poniendo catsup.");
	}

}