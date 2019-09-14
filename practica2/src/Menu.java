public abstract class Menu {

    int id;

    String nombreHamburguesa;

    String descripcion;

    double precio;

    boolean tieneQueso;

    boolean esVegetariano;

    public void hacerHamburguesa() {}

    public void ponerPan() {}

    public void ponerMayonesa() {}

    public void ponerMostaza() {}

    public abstract void prepararCarne();

    public void ponerCarne() {}

    public abstract void ponerQueso();

    public void ponerVegetales() {}

    public void ponerCastup() {}

}