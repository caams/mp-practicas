import java.util.Scanner;

/**
 * Práctica 2 de Modelado y Progrmación
 */
public class Practica2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        Robot robocop = new Robot();
        

        robocop.display();
        int orden = scan.nextInt();
        //robocop.leerMenu();

        switch (orden) {
            case 1:
                robocop.setRobotActivo(true);
                robocop.caminando();
                break;
            case 2:
                robocop.atendiendo();
                break;
            case 3:
                robocop.leerMenu(); 
            case 4: 
                robocop.cocinando();
            case 5:
                break;
        
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}