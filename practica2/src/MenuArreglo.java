import java.util.Arrays;
import java.util.Iterator;

public class MenuArreglo implements Menu{

    Hamburguesa[] menu = new Hamburguesa[3];
    //Iterable<Hamburguesa> iterable = Arrays.asList(menu);
    
    public void menuBasico(){

        menu[0] = new HamburguesaSencilla();
        menu[1] = new HamburguesaVegetariana();
        menu[2] = new HamburguesaSinQueso();

        Iterable<Hamburguesa> iterable = Arrays.asList(menu);
        Iterator<Hamburguesa> it = iterable.iterator();
        
        System.out.println(String.format("|%-30s|", "Menú Basico"));
        while(it.hasNext()){
            it.next().getHamburguesa();
        }
    }

    //@Override
    public Iterator<Hamburguesa> createIterator() {
        menu[0] = new HamburguesaSencilla();
        menu[1] = new HamburguesaVegetariana();
        menu[2] = new HamburguesaSinQueso();

        Iterable<Hamburguesa> iterable = Arrays.asList(menu);
        Iterator<Hamburguesa> it = iterable.iterator();

        return it;
    }

}