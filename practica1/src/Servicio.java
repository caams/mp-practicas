import java.util.LinkedList;

public abstract class Servicio implements InterfazServicio{

    protected String nombre;
    protected LinkedList<Usuario> suscriptores;
    String recomendacionDeHoy;

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
        return recomendacionDeHoy;
    }

    /**
     * Define la recomendación del día de cada servicio.
     * @param r la recomendación de hoy.
     */
    public void setRecomendacion(String r){
        recomendacionDeHoy = r;            
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

    @Override 
    public void notificar() {
        for (Usuario s : suscriptores)
            s.update(this);
    }

    @Override
    public void bienvenida(Usuario u) {
        System.out.println("\nTe damos la bienvenida a " + this.getNombre() 
        + ", " + u.getNombre() + ". \n" );
    }
    
    @Override
    public void cobrar(Usuario u, int dia) {
        if(dia == 1)
            return;
        int indiceServicio = u.getSuscripciones().indexOf(this);
        int plan = u.getPlanes().get(indiceServicio);
        String mensaje;
        if (u.getDinero() < this.getCosto(plan)) {
            mensaje = String.format("%s, te informamos que tu suscripción a " +
                                    "%s%s ha sido cancelada por " +
                                    "no se ha podido completar el pago.",
                                    u.getNombre(), this.nombre,
                                    u.getServicioPlan(this));
            System.out.println(mensaje);
            u.getPlanes().remove(indiceServicio);
            u.getSuscripciones().remove(this);
            suscriptores.remove(u);
        } else {
            mensaje = String.format("%s, se te han cobrado $%d del servicio " +
                                    "de %s%s.", u.getNombre(),
                                    this.getCosto(plan), nombre,
                                    u.getServicioPlan(this));
            u.setDinero(u.getDinero() - this.getCosto(plan));
            System.out.println(mensaje);
        }
    }
    
    public abstract int getCosto(int plan);
    public abstract String recomendacionDiaria();


}