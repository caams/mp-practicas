public class HamburguesaIguana extends Hamburguesa{

    public HamburguesaIguana() {
        super(5, "Hamburguesa de Iguana", "Hamburguesa hecha con carne de iguana. Receta del chef.", 6);
        setEsVegetariana(false);
        setTieneQueso(false);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparar carne de iguana... (´⊙ω⊙`)\n [ -c°▥°]-c. Estoy preparando una carne de iguana.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado.");
        System.out.println();
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carne de iguana [ -c°▥°]-c. Estoy poniendo una carne de iguana excelentemente cocinada.");
    }
}