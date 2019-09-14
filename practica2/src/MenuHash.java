import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MenuHash implements IteradorHash {

    @Override public Object next() {
        return null;
    }

    @Override public boolean hasNext() {
        return false;
    }

    int key;
    Hashtable<Integer, Hamburguesa> menu = new Hashtable<>();
    Iterator hashIt = menu.values().iterator();
    //Set<Integer> keys = menu.keySet();

    public void menuDeLujo() {
     
        //menu.put(11, HamburguesaSencilla);
        //menu.put(12, HamburguesaVegetariana);
        //menu.put(13, HamburguesaSinQueso);

        while(hashIt.hasNext()){
            System.out.println(hashIt.next());
        }
    }
    
    

    
}