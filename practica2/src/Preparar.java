/**
 * Preparar - Template
 */
public abstract class Preparar{

    /*
	* Metodo abstracto para que cada clase lo modifique a su antojo.
	*/
    abstract void prepararCarne();
    
    abstract void ponerCarne();

	abstract void ponerQueso();

	/*
	* Metodo template (plantilla)
	*/
	public final void rutinaCoccion(){
        ponerPan();
        ponerMayonesa();
        prepararCarne();//hook
        ponerCarne();//hook
        ponerQueso();//hook
        ponerVegetales();
        ponerCatsup();
        ponerPan();
	}

	void ponerPan(){
		System.out.println("\nPoner pan [ -c°▥°]-c. Estoy poniendo el pan.");
	}

	void ponerMayonesa(){
		System.out.println("Poner mayonesa [ -c°▥°]-c. Estoy untando la mayonesa en el pan.");
	}

	void ponerVegetales(){
		System.out.println("Poner vegetales [ -c°▥°]-c. Estoy poniendo los vegetales.");
	}

	void ponerCatsup(){
		System.out.println("Poner catsup [ -c°▥°]-c. Estoy poniendo catsup.");
	}
	
}