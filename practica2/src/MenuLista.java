import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MenuLista {

    ArrayList<Hamburguesa> menu = new ArrayList<Hamburguesa>();
    
    
    ArrayList<Hamburguesa> m = new ArrayList<Hamburguesa>();

    public ArrayList<Hamburguesa> elegirMenu(){

        Random dice = new Random(); 
        
        menu.add(new HamburguesaPollo());
        menu.add(new HamburguesaIguana());
        menu.add(new HamburguesaPavo());
        menu.add(new HamburguesaPizza());
        menu.add(new HamburguesaPastor());
        menu.add(new HamburguesaDulce());
        menu.add(new HamburguesaTamal());

        //for (int i = 0; i <= 3; i++) {
            m.add(menu.get(dice.nextInt(7)));
            m.add(menu.get(dice.nextInt(7)));
            m.add(menu.get(dice.nextInt(7)));
            menu = new ArrayList<Hamburguesa>(m);

        //}
        return menu;
    }

    public void menuDiario() {          

        ArrayList<Hamburguesa> menuCopia = new ArrayList<Hamburguesa>(elegirMenu());
        Iterator<Hamburguesa> it = menuCopia.iterator();

        System.out.println(String.format("|%-30s|", "Menú Diario"));
        while(it.hasNext())
            it.next().getHamburguesa();

    }

}