import java.util.Hashtable;
import java.util.Iterator;
//import java.util.Set;

/**
 * Menú de Lujo utilizando Hashtable
 */
public class MenuHash {

    int key;
    Hashtable<Integer, Hamburguesa> menu = new Hashtable<>();

    Hamburguesa ham1 = new HamburguesaHawaiana();
    Hamburguesa ham2 = new HamburguesaRibeye();
    Hamburguesa ham3 = new HamburguesaBBQ();
    
    //Integer n;

    public void menuDeLujo() {
     
        menu.put(ham1.getId(), ham1);
        menu.put(ham2.getId(), ham2);
        menu.put(ham3.getId(), ham3);

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
    
    //@Override
    public Iterator<Hamburguesa> createIterator(){

        menu.put(ham1.getId(), ham1);
        menu.put(ham2.getId(), ham3);
        menu.put(ham3.getId(), ham3);
        Iterator<Hamburguesa> it = menu.values().iterator();
        return it;
    }
    

    
}