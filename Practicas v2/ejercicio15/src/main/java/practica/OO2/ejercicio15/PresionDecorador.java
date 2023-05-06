package practica.OO2.ejercicio15;

public class PresionDecorador extends InfoDecorador{
	
	public PresionDecorador(EstacionMeteorologica est) {
		super(est);
	}

	public String displayData() {
		return super.displayData() + "Presion: " + super.getPresion();
	}

}
