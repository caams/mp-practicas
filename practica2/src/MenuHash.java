import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Menú de Lujo utilizando Hashtable
 */
public class MenuHash {

    int key;
    Hashtable<Integer, Hamburguesa> menu = new Hashtable<>();
    Iterator<Hamburguesa> it = menu.values().iterator();
    //Set<Integer> keys = menu.keySet();

    public void menuDeLujo() {
     
        menu.put(11, new HamburguesaSencilla());
        menu.put(12, new HamburguesaVegetariana());
        menu.put(13, new HamburguesaSinQueso());

        System.out.println(String.format("|%-30s|", "Menú de Lujo"));
        while(it.hasNext()){
            it.next().getHamburguesa();
        }
    }
    
    

    
}