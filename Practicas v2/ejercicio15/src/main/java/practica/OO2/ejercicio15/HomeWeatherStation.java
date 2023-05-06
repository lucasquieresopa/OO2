package practica.OO2.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {

	private Double temperaturaF;
	private Double presion;
	private Double radiacionSolar;
	private List<Double> historialTemperaturaFahrenheit;
	
	public HomeWeatherStation(Double temperaturaF, Double presion, Double radiacionSolar) {
		this.temperaturaF = temperaturaF;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.historialTemperaturaFahrenheit = new ArrayList<Double>();
	}


	public Double getTemperaturaFahrenheit() {
//		int min = 0;  
//		int max = 600; 
//		double t = Math.random()*(max-min+1)+min;
//		this.historialTemperaturaFahrenheit.add(t);
//		return t;
		return this.temperaturaF;
	}

	public Double getPresion() {
//		int min = 0;  
//		int max = 2000; 
//		return Math.random()*(max-min+1)+min;
		return this.presion;
	}

	public double getRadiacionSolar() {
//		int min = 0;  
//		int max = 2000; 
//		return Math.random()*(max-min+1)+min;
		return this.radiacionSolar;
	}
	
	public List<Double> getTemperaturasFahrenheit(){
		return this.historialTemperaturaFahrenheit;
		
	}
	

}
