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
                        robocop.activarse();
                    case 2:
                        robocop.atender();
                        break;
                    case 3:
                        robocop.leerMenu(); 
                        break;
                    case 4: 
                        System.out.println("¡Excelente! ¿Qué desea ordenar?\n");
                        robocop.leerMenu();
                        System.out.println("Eliga un ID de la hamburguesa que va a ordenar: ");
                        int pedido = scan.nextInt();
                        robocop.cocinar(pedido);
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