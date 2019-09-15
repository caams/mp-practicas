import java.util.Scanner;

/**
 * Práctica 2 de Modelado y Progrmación
 */
public class Practica2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        MenuArreglo menu1 = new MenuArreglo();
        MenuLista menu2 = new MenuLista();
        MenuHash menu3 = new MenuHash();


        menu1.menuBasico();
        menu2.menuDiario();
        menu3.menuDeLujo();
    }
}