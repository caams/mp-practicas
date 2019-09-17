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

        try {

            do {
                robocop.display();
                orden = scan.nextInt();
                
                    switch (orden) {
                        case 1:
                            robocop.activarse();
                            break;
                        case 2:
                            robocop.atender();
                            break;
                        case 3:
                            robocop.leerMenu(); 
                            break;
                        case 4: 
                            //robocop.atender();
                            robocop.cocinar(0);
                            System.out.println("¡Excelente! (┌|o^▽^o|┘)♪ \nEstás son las hamburguesas del menú: \n");
                            robocop.leerMenu();                        
                            System.out.print("Eliga un ID de la hamburguesa que va a ordenar: ");
                            int pedido = scan.nextInt();
                            robocop.cocinar(pedido);
                            System.out.println("Robot suspendido. [ -c°▥°]-c\n");
                            //robocop.suspenderse();
                            break;
                        case 5:
                            robocop.suspenderse();
                            break;
                        case 6:
                            break;
                    
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    
                }while (orden != 6);
            
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número.");
            scan.next();
        }       
        
    }
}