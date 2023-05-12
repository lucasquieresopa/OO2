package practica.OO2.ejercicio15;

public class PromedioFahrenheitDecorador extends InfoDecorador{
	
	public PromedioFahrenheitDecorador(EstacionMeteorologica est) {
		super(est);
	}

	public String displayData() {
		return super.displayData() + "Promedio T° Fahrenheit: " + super.getPromedioFahrenheit();
	}


}
