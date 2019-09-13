import java.util.ArrayList;
import java.util.Random;
/**
 * YouTube es gratis para usuarios normales, 
 * pero cobra $6 diarios para los usuarios premium. 
 */
public class Youtube extends Servicio {

    int premium = 6;
    ArrayList<String> recsYouTube = new ArrayList<String>();
    
    public Youtube() {
        super("YouTube");
    }

    @Override
    public String recomendacionDiaria() {
        
        Random dice = new Random(); 
        int n = dice.nextInt(5);
        recsYouTube.add(" Do you Want to See a Dead Body? ");
        recsYouTube.add(" Impulse");
        recsYouTube.add(" Weird City");
        recsYouTube.add(" Origin");
        recsYouTube.add(" Cobra Kai");
        setRecomendacion(recsYouTube.get(n));
        return recsYouTube.get(n);
    }

    @Override
    public int getCosto(int plan) {
        if(plan == 1)
            return premium;
        return 0;
    }
}