package practica.OO2.ejercicio15;

public class TemperaturaCelciusDecorador extends InfoDecorador{

	public TemperaturaCelciusDecorador(EstacionMeteorologica est) {
		super(est);
	}

	public String displayData() {
		return super.displayData() + "Temperatura C: " + super.getTemperaturaCelsius();
	}
}
