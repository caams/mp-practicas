/**
 * Hamburguesa de pollo teriyaki.
 */
public class HamburguesaDulce extends Hamburguesa {

    public HamburguesaDulce() {
        super(9, "Hamburguesa dulce", "Hamburguesa recomendada para aquellos de paladar dulce! No te decepcionará. Está hecha con pollo teriyaki y salsa agridulce.", 7);
        setEsVegetariana(false);
        setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparando pollo teriyaki [ -c°▥°]-c. Estoy preparando un pollo teriyaki bien suaaave.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner salsa [ -c°▥°]-c. Estoy poniendo salsa agridulce.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner pollo teriyaki [ -c°▥°]-c. Estoy poniendo un pollo teriyaki bien jugoso.");
    }
}