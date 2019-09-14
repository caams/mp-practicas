/**
 * Hamburguesa de pollo.
 */
public class HamburguesaPollo extends Hamburguesa{

    public HamburguesaPollo() {
        super(4, "Hamburguesa de pollo", "Hamburguesa con carne de pollo.", 4);
        this.setEsVegetariana(false);
        this.setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparar pollo [ -c°▥°]-c. Estoy preparando un pollo bien asado.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carne de pollo [ -c°▥°]-c. Estoy poniendo una carne de pollo excelentemente cocinada.");
    }
}