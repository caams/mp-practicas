/**
 * Modelado y Programación: Práctica 1.
 */
public class Practica1{

    public static void main(String[] args) {
        
        System.out.println("Empezando simulación...");

        //int dia = 1;
        int g = 9;

        Servicio netflix = new Netflix();
        Servicio amazon = new AmazonPrimeVideo();
        Servicio spotify = new Spotify();
        Servicio youtube = new Youtube();

        
        Usuario alicia = new Usuario("Alicia", 500);
        alicia.suscribir(spotify, 0);
        alicia.suscribir(amazon, 0);
        alicia.suscribir(netflix, 4);
        alicia.suscribir(youtube, 0);

        Usuario bob = new Usuario("Bob", 40);
        bob.suscribir(spotify, 0);
        bob.suscribir(amazon, 0);
        bob.suscribir(netflix, 4);
        bob.suscribir(youtube, 0);

        Usuario cesar = new Usuario("César", 40);
        cesar.suscribir(spotify, 0);
        cesar.suscribir(youtube, g);

        Usuario diego = new Usuario("Diego", 80);
        diego.suscribir(netflix, 2);
        diego.suscribir(amazon, 0);
         
        Usuario erika = new Usuario("Erika", 300);
        erika.suscribir(spotify, g);
        erika.suscribir(netflix, 4);
        erika.suscribir(youtube, g);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nDia: " + i);
            if (i == 2) {
                erika.suscribir(spotify, 0);
                erika.suscribir(youtube, 0);
            }
            if (i == 3) {
                erika.cancelarServicio(netflix);                
                erika.suscribir(amazon, 0);
                diego.suscribir(spotify, g);
            }
            alicia.simulacionPorDia(i);
            bob.simulacionPorDia(i);
            cesar.simulacionPorDia(i);
            diego.simulacionPorDia(i);
            erika.simulacionPorDia(i);
        }

        System.out.println("____Final de la simulación.____");
    }
}