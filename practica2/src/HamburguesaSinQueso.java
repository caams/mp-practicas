/**
 * Hamburguesa sin queso.
 */
public class HamburguesaSinQueso extends Hamburguesa{

    public HamburguesaSinQueso(){
        super(2, "Hamburguesa sin queso", "Hamburguesa sin queso :(", 3);
        setEsVegetariana(false);
        setTieneQueso(true);
    }
    

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparar carne [ -c°▥°]-c. Estoy preparando una carne bien jugosa.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == false)
            System.out.println();
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carne [ -c°▥°]-c. Estoy poniendo una carne excelentemente cocinada.");
    }
    
}