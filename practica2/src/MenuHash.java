import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Menú de Lujo utilizando Hashtable
 */
public class MenuHash {

    int key;
    Hashtable<Integer, Hamburguesa> menu = new Hashtable<>();
    
    //Integer n;

    public void menuDeLujo() {
     
        menu.put(11, new HamburguesaHawaiana());
        menu.put(12, new HamburguesaRibeye());
        menu.put(13, new HamburguesaBBQ());

        Iterator<Hamburguesa> it = menu.values().iterator();
        //Set<Integer> keys = menu.keySet();
        //Iterator<Integer> itr = keys.iterator();

        System.out.println(String.format("|%-30s|", "Menú de Lujo"));
        while(it.hasNext()){
            
            it.next().getHamburguesa();

            //n = itr.next();
            //System.out.println("Key: "+n+" & Value: "+menu.get(n));

            //Integer key = itr.next();
            //Hamburguesa mappedValue = menu.get(key);             
            //mappedValue.getHamburguesa();
        }
    }
    
    

    
}