import java.util.ArrayList;
import java.util.Random;

/**
 * Netflix cobra $7 diarios para un sólo dispositivo, 
 * $10 para 2 dispositivos y $15 para 4 dispositivos. 
 */
public class Netflix extends Servicio {

    int uno = 7;
    int dos = 10;
    int cuatro = 15;
    ArrayList<String> recsNetflix = new ArrayList<String>();

    public Netflix() {
        super("Netflix");
    }

    @Override
    public void recomendacionDiaria() {
        
        Random dice = new Random(); 
        int n = dice.nextInt(5);
        recsNetflix.add(" Black Mirror");
        recsNetflix.add(" House of Cards");
        recsNetflix.add(" Godless");
        recsNetflix.add(" 13 Reasons Why");
        recsNetflix.add(" Baby");
        setRecomendacion(recsNetflix.get(n));
    }

    @Override
    public int getCosto(int plan) {
        if(plan == 1)
            return uno;
        if(plan == 2)
            return dos;
        if(plan == 4)
            return cuatro;
        throw new NumberFormatException();
    }
}