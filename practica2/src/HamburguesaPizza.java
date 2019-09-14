/**
 * Hamburguesa de pizza.
 */
public class HamburguesaPizza extends Hamburguesa {

    public HamburguesaPizza() {
        super(7, "Hamburguesa de pizza", "Hamburguesa CON PIZZA! Una novedad! Además de ser vegetariana, no le ponemos carne a la hamburguesa o a la pizza. (•̀ᴗ•́)و ̑̑", 6);
        setEsVegetariana(true);
        setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparando pizza para la hamburguesa [ -c°▥°]-c. Estoy preparando una pizza vegetariana.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado sobre el queso, excelente servicio.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner pizza en hamburguesa [ -c°▥°]-c. Estoy poniendo una pizza vegetariana excelentemente preparada.");
    }
}