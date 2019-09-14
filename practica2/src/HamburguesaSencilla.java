/**
 * Hamburguesa sencilla.
 */
public class HamburguesaSencilla extends Hamburguesa{

    public HamburguesaSencilla() {
        super(1, "Hamburguesa sencilla", "Hamburguesa sencilla, tiene carne, queso y vegetales.", 3);
        this.setEsVegetariana(false);
        this.setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparar carne [ -c°▥°]-c. Estoy preparando una carne bien jugosa.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carne [ -c°▥°]-c. Estoy poniendo una carne excelentemente cocinada.");
    }
}