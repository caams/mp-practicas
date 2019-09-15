public class HamburguesaPastor extends Hamburguesa {

    public HamburguesaPastor() {
        super(8, "Hamburguesa de pastor", "Hamburguesa preparada con carne de pastor, like a taco.", 8);
        setEsVegetariana(false);
        setTieneQueso(true);
    }
    
    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparando carne al pastor [ -c°▥°]-c. Estoy cortando la carne al pastor de un trompo GIGANTE.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner jardín [ -c°▥°]-c. Estoy poniendo cebolla y cilantro en el pastor.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carne al pastor [ -c°▥°]-c. Estoy poniendo una carne al pastor excelentemente preparada.");
    }
}