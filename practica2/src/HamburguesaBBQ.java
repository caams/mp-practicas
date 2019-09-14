/**
 * HamburguesaBBQ
 */
public class HamburguesaBBQ extends Hamburguesa{

    public HamburguesaBBQ() {
        super(13, "Hamburguesa a la BBQ", "Hamburguesa con doble carne preparada a la BBQ", 14);
        setEsVegetariana(false);
        setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparando carnes [ -c°▥°]-c. Estoy preparando unas carnes a la BBQ bien jugosas.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carnes [ -c°▥°]-c. Estoy poniendo doble carne a la BBQ excelentemente cocinada.");
    }
}