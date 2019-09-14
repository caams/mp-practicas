public class HamburguesaPavo extends Hamburguesa {

    public HamburguesaPavo() {
        super(6, "Hamburguesa de pavo", "Hamburguesa con carne de pavo.", 5);
        setEsVegetariana(false);
        setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparar pavo [ -c°▥°]-c. Estoy preparando un pavo bien jugoso.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carne de pavo [ -c°▥°]-c. Estoy poniendo una carne de pavo excelentemente cocinada.");
    }
}