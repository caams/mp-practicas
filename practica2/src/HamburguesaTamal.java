public class HamburguesaTamal extends Hamburguesa{

    public HamburguesaTamal() {
        super(10, "Hamburguesa de tamal", "Hamburguesa preparada con el tamal de tu preferencia y salsa... No hay tamales dulces!", 6);
        setEsVegetariana(false);
        setTieneQueso(true);
    }

    @Override
    void prepararCarne() {
        if(esVegetariana == false)
            System.out.println("Preparar tamal [ -c°▥°]-c. Estoy eligiendo el tamal de tu preferencia.");
    }

    @Override
    void ponerQueso() {
        if(tieneQueso == true)
            System.out.println("Poner salsa [ -c°▥°]-c. Estoy poniendo salsa en el tamal.");
    }

    @Override
    void ponerCarne() {
        if(esVegetariana == false)
            System.out.println("Poner tamal [ -c°▥°]-c. Estoy poniendo el tamal que pediste en la hamburguesa.");
    }
}