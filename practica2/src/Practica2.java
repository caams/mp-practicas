import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Práctica 2 de Modelado y Progrmación
 */
public class Practica2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);     
        Robot robocop = new Robot();   
        int orden;

        do {
            robocop.display();
            orden = scan.nextInt();
            try {
                switch (orden) {
                    case 1:
                        robocop.setRobotActivo(true);
                        robocop.setEventoRobot(robocop.getCaminando());
                        break;
                    case 2:
                        robocop.setEventoRobot(robocop.getAtendiendo());
                        break;
                    case 3:
                        robocop.leerMenu(); 
                        break;
                    case 4: 
                        robocop.setEventoRobot(robocop.getCocinando());
                    case 5:
                        break;
                
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scan.next();
            }          
            
        } while (orden != 5);

        
    }
}