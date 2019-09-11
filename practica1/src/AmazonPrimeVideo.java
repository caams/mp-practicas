import java.util.ArrayList;
import java.util.Random;
/**
 * Amazon tiene una versión de 
 * usuario normal con un costo de $7 diarios y 
 * una versión premium con un costo de $13. 
 */

public class AmazonPrimeVideo extends Servicio {

    int basico = 7;
    int premium = 13;

    public AmazonPrimeVideo() {
        super("Amazon Prime Video");
    }

    @Override
    public void recomendacionDiaria() {
        ArrayList<String> recsAmazon = new ArrayList<String>();
        Random dice = new Random(); 
        int n = dice.nextInt(5);
        recsAmazon.add(" Bosch");
        recsAmazon.add(" Mozart in the Jungle");
        recsAmazon.add(" The Man on High Castle");
        recsAmazon.add(" Sneaky Pete");
        recsAmazon.add(" Goliath");
        setRecomendacion(recsAmazon.get(n));
    }


    
    @Override
    public int getCosto(int plan) {
        if(plan == 0)
            return premium;
        return basico;
        
    }
}