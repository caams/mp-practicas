/**
 * YouTube es gratis para usuarios normales, 
 * pero cobra $6 diarios para los usuarios premium. 
 */
public class Youtube extends Servicio {

    int premium = 6;
    
    public Youtube() {
        super("YouTube");
    }

    @Override
    public String recomendacionDiaria(int dia) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getCosto(int plan) {
        if(plan == 1)
            return premium;
        return 0;
    }
}