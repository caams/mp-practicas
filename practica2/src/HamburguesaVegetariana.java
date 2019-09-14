public class HamburguesaVegetariana extends Hamburguesa{

    public HamburguesaVegetariana(){
        super(3, "Hamburguesa vegetariana", "Hamburguesa con pseudocarne preparada con soya.", 3);
        setTieneQueso(true);
        setEsVegetariana(false);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparar carne vegetariana [ -c°▥°]-c. Estoy preparando una carne de soya.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner queso [ -c°▥°]-c. Estoy poniendo el queso gratinado.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner carne [ -c°▥°]-c. Estoy poniendo la carne vegetariana.");
    }
}