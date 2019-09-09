import java.util.LinkedList;

public abstract class Servicio implements InterfazServicio{

    protected String nombre;
    protected int costo;
    protected LinkedList<Usuario> suscriptores;
    String recomendacion;

    /**
     * Define el estado inicial de cada servicio.
     * @param nombre el nombre del servicio.
     * @param costo el costo del servicio.
     * @param suscriptores la lista de suscriptores al servicio.
     */
    public Servicio(String nombre, int costo){
        this.nombre = nombre;
        this.costo = costo;
        suscriptores = new LinkedList<Usuario>();
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

    public String getRecomendacion(){
        return recomendacion;
    }

    public void setRecomendacion(String r){
        recomendacion = r;
        //System.out.println("\nTe recomendamos " + r 
        //+ ". Disfrútalo en " + this.nombre + ".");        
    }


    public void agregar(Usuario s) {
        suscriptores.add(s);
    }

    public void remover(Usuario s) {
        suscriptores.remove(s);
    }

    public void notificar() {
        for (Usuario s : suscriptores)
            s.update();
    }

    @Override 
    public void recomendar(Usuario u, int dia){
        //String m = (u.getNombre() + "! Te recomendamos " + this.getRecomendacion()
          //          + ", disfrútalo en " + this.nombre);
        String mensaje = String.format("¡Hey %s! %s", u.getNombre(),
                                         this.getRecomendacion(u, dia));
    }

    @Override
    public void bienvenida(Usuario u) {
        
    }

    @Override
     public void cobrar(Usuario u, int dia){
        if(dia == 1)
            return;
        
    }

    public abstract int getPrecio(int plan);
    public abstract String recomendacionDiaria(int dia);


}