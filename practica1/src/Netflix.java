/**
 * Netflix cobra $7 diarios para un sólo dispositivo, 
 * $10 para 2 dispositivos y $15 para 4 dispositivos. 
 */
public class Netflix extends Servicio {

    int uno = 7;
    int dos = 10;
    int cuatro = 15;

    public Netflix() {
        super("Netflix");
    }

    @Override
    public String recomendacionDiaria(int dia) {
        // TODO Auto-generated method stub
        return null;
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