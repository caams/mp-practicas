/**
 * Hamburguesa de Ribeye
 */
public class HamburguesaRibeye extends Hamburguesa {

    public HamburguesaRibeye(){
        super(12, "Hamburguesa Ribeye", "Hamburguesa con corte de carne Ribeye a tu cocción preferida.", 15);
        setEsVegetariana(false);
        setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparar corte de Ribeye [ -c°▥°]-c. Estoy preparando un corte Ribeye bien jugoso.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carne [ -c°▥°]-c. Estoy poniendo un corte Ribeye excelentemente cocinada.");
    }
    
}