import java.util.ArrayList;
import java.util.Random;
/**
 * Spotify es gratis para los usuarios normales,
 * pero cobra $4 diarios por un servicio premium. 
 */
public class Spotify extends Servicio {

    int premium = 4;
    ArrayList<String> recsSpotify = new ArrayList<String>(); 
    
    public Spotify() {
        super("Spotify");        
    }

    @Override
    public void recomendacionDiaria() {
        
        Random dice = new Random(); 
        int n = dice.nextInt(5);
        recsSpotify.add(" Bebe Rexha");
        recsSpotify.add(" Lizzo");
        recsSpotify.add(" Morat");
        recsSpotify.add(" David Ghetta");
        recsSpotify.add(" Muse");
        setRecomendacion(recsSpotify.get(n));
    }

    @Override
    public int getCosto(int plan) {
        if(plan == 1)
            return premium;
        return 0;
    }
}