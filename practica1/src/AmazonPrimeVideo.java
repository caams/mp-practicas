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

    @Override public String recomendacionDiaria(int dia) {

        String day1 = "Bosch";
        String day2 = "Mozart in the Jungle";
        String day3 = "The Man on High Castle";
        String day4 = "Sneaky Pete";
        String day5 = "Goliath";

        switch (dia) {
            case 1:
                return day1;              
                
            case 2:
                return day2;              
                
            case 3:
                return day3;                
                
            case 4:
                return day4;                
                
            case 5:
                return day5;           
            default:
                return "";
                
        }


    }
    @Override
    public int getCosto(int plan) {
        if(plan == 0)
            return premium;
        return basico;
        
    }
}