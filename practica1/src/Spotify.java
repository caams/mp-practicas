/**
 * Spotify es gratis para los usuarios normales,
 * pero cobra $4 diarios por un servicio premium. 
 */
public class Spotify extends Servicio {

    int premium = 4;
    
    public Spotify() {
        super("Spotify");
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