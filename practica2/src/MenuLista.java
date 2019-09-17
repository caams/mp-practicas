import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class MenuLista {

    ArrayList<Hamburguesa> menu = new ArrayList<Hamburguesa>();
    
    
    //ArrayList<Hamburguesa> m = new ArrayList<Hamburguesa>();

    public ArrayList<Hamburguesa> elegirMenu(){

        ArrayList<Hamburguesa> m = new ArrayList<Hamburguesa>();
        Random dice = new Random(); 
        
        menu.add(new HamburguesaPollo());
        menu.add(new HamburguesaIguana());
        menu.add(new HamburguesaPavo());
        menu.add(new HamburguesaPizza());
        menu.add(new HamburguesaPastor());
        menu.add(new HamburguesaDulce());
        menu.add(new HamburguesaTamal());

        //Collections.shuffle(menu);

        for (int i = 0; i < 3; i++) {
            int r = dice.nextInt(menu.size());
            m.add(menu.get(r));
            menu.remove(r);
            //m.add(menu.get(dice.nextInt(7)));
            //m.add(menu.get(dice.nextInt(7)));
        }
            menu = new ArrayList<Hamburguesa>(m);

        
        return menu;
    }

    public void menuDiario() {          

        ArrayList<Hamburguesa> menuCopia = new ArrayList<Hamburguesa>(elegirMenu());
        Iterator<Hamburguesa> it = menuCopia.iterator();

        System.out.println(String.format("|%-30s|", "Menú Diario"));
        while(it.hasNext())
            it.next().getHamburguesa();

    }

    //@Override
    public Iterator<Hamburguesa> createIterator(){
        ArrayList<Hamburguesa> menuCopia = new ArrayList<Hamburguesa>(elegirMenu());
        Iterator<Hamburguesa> it = menuCopia.iterator();
        return it;
    }

}