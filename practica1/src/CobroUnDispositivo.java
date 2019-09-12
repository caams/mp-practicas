/**
 * CobroUnDispositivo
 */
public class CobroUnDispositivo extends Netflix {

    int unaPantalla = 7;
    /*
    @Override
    public void cobrar(Usuario u, int dia) {
        if(dia == 1)
            return;
        int indiceServicio = u.getSuscripciones().indexOf(this);
        
        if(u.getDinero() < unaPantalla){
            System.out.println(u.getNombre() + " te informamos que tu suscripción a sido cancelada debido al incumplimiento del pago de  a  " + this.nombre);
            u.getPlanes().remove(indiceServicio);
            u.getSuscripciones().remove(this);
            suscriptores.remove(u);
        }else{
            System.out.println(u.getNombre() + ", te han cobrado " + unaPantalla + " de tu suscripción al servicio " + this.getNombre());
            u.setDinero(u.getDinero() - unaPantalla);
        }        
    }
    */
}