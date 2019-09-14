/**
 * Hamburguesa Hawaiana
 */
public class HamburguesaHawaiana extends Hamburguesa {

    public HamburguesaHawaiana() {
        super(11, "Hamburguesa Hawaiana", "Hamburguesa preparada con doble carne y una rodaja de piña asada, excelente combinación.", 13);
        setEsVegetariana(false);
        setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparando carnes y asando piña [ -c°▥°]-c. Estoy preparando unas dos carnes bien jugosas junto a la piña.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carnes [ -c°▥°]-c. Estoy poniendo doble carne y una rodaja de piña asada excelentemente cocinadas.");
    }
    
}