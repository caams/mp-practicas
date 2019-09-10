import java.util.LinkedList;

public abstract class Servicio implements InterfazServicio{

    protected String nombre;
    protected LinkedList<Usuario> suscriptores;
    String recomendacion;

    /**
     * Define el estado inicial de cada servicio.
     * @param nombre el nombre del servicio.
     * @param costo el costo del servicio.
     * @param suscriptores la lista de suscriptores al servicio.
     */
    public Servicio(String nombre){
        this.nombre = nombre;
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
    }


    public void agregar(Usuario s) {
        suscriptores.add(s);
        bienvenida(s);
    }

    public void remover(Usuario s) {
        suscriptores.remove(s);
        System.out.println("¿Por qué nos dejas? " + s.getNombre() + 
                            " Tendremos que dejarte ir...\n");      
    }

    public void notificar() {
        for (Usuario s : suscriptores)
            s.update();
    }

    @Override 
    public void recomendar(Usuario u, int dia){
        
    }

    @Override
    public void bienvenida(Usuario u) {
        System.out.println("\nTe damos la bienvenida a " + this.getNombre() 
        + ", " + u.getNombre() + ". \n" );
    }

    @Override
     public void cobrar(Usuario u, int dia){
        if(dia == 1)
            return;
        
    }

    public abstract int getCosto(int plan);
    public abstract String recomendacionDiaria(int dia);


}