import java.util.Arrays;
import java.util.Iterator;

public class MenuArreglo implements IteradorArreglo {

    @Override public Object next() {
        return null;
    }

    @Override public boolean hasNext() {
        return false;
    }

    Hamburguesa[] menu = new Hamburguesa[3];
    //Iterable<Hamburguesa> iterable = Arrays.asList(menu);
    
    public void menuBasico(){

        Iterable<Hamburguesa> iterable = Arrays.asList(menu);
        Iterator<Hamburguesa> it = iterable.iterator();
        menu[0] = new HamburguesaSencilla();
        menu[1] = new HamburguesaVegetariana();
        menu[2] = new HamburguesaSinQueso();
        
        System.out.println(String.format("|%-30s|", "Menú Basico"));
        while(it.hasNext()){
            it.next().getHamburguesa();
        }
    }

}