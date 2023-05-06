package practica.OO2.ejercicio15;

public abstract class InfoDecorador extends EstacionMeteorologica{

	private EstacionMeteorologica componenteEstacion;
	
	public InfoDecorador(EstacionMeteorologica est) {
		this.componenteEstacion = est;
	}
	
	public String getTemperaturaCelsius() {
		return this.componenteEstacion.getTemperaturaCelsius();
	}
	
	public String getPresion() {
		return this.componenteEstacion.getPresion();
	}
	
	public String getRadiacionSolar() {
		return this.componenteEstacion.getRadiacionSolar();
	}
	
	public String getPromedioFahrenheit() {
		return this.componenteEstacion.getPromedioFahrenheit().toString();
	}
	
	public String displayData() {
		return this.componenteEstacion.displayData() + " | ";
	}
}
