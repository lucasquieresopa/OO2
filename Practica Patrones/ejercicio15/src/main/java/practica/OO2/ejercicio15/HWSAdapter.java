package practica.OO2.ejercicio15;

import java.util.stream.Collectors;

public class HWSAdapter extends EstacionMeteorologica{

	private HomeWeatherStation hws;
	
	public HWSAdapter(HomeWeatherStation hws) {
		this.hws = hws;
	}
	
	public String getTemperaturaCelsius() {
		return Double.toString(this.celciusConverter(this.hws.getTemperaturaFahrenheit()));
	}

	public Double celciusConverter(Double tempF) {
		return (tempF - 32) / 1.8;
	}

	@Override
	public String getPresion() {
		return Double.toString(this.hws.getPresion());
	}

	@Override
	public String getRadiacionSolar() {
		return Double.toString(this.hws.getRadiacionSolar());
	}

	@Override
	public String getPromedioFahrenheit() {
		
		//Dado que este metodo está ligado a un sensor que brinda la info de cada medicion de temperatura
		//la cual no se implementa, como no interesa como se hace el calculo, devuelvo un numero hardcodeado
		
		
//		return Double.toString(this.hws.getTemperaturasFahrenheit().stream()
//				.mapToDouble(temp -> temp)
//				.average().orElse(0));
	
		return "100.0";

		
	}

	@Override
	public String displayData() {
		return "Info:";
	}
	
}
