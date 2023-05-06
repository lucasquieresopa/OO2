package practica.OO2.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstacionMeteorologicaTest {

	private HWSAdapter m1;
	
	
	@BeforeEach
	public void setUp() {
		this.m1 = new HWSAdapter(new HomeWeatherStation(0.0, 1008.0, 500.0));
		
	}
	
	@Test
	public void testEjemplo2() {
		EstacionMeteorologica presion = new PresionDecorador(this.m1);
		EstacionMeteorologica radiacion = new RadiacionSolarDecorador(presion);
		EstacionMeteorologica temperatura = new TemperaturaCelciusDecorador(radiacion);
		EstacionMeteorologica promedioF = new PromedioFahrenheitDecorador(temperatura);
		System.out.println(promedioF.displayData());
		assertEquals("Info: | Presion: 1008.0 | Radiacion: 500.0 | Temperatura C: -17.77777777777778 | Promedio T° Fahrenheit: 100.0", 
				promedioF.displayData());
	}
	

}
