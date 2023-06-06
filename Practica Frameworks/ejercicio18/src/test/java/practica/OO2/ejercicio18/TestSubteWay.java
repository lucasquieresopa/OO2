package practica.OO2.ejercicio18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSubteWay {

	private SubteWay subteway;
	
	@BeforeEach
	public void setUp() {
		this.subteway = new SubteWay();
	}

	
	@Test
	public void testCalcularPrecios() {
		assertEquals(500, this.subteway.calcularPrecioSanguche(new Clasico()));
		assertEquals(420, this.subteway.calcularPrecioSanguche(new Vegetariano()));
		assertEquals(620, this.subteway.calcularPrecioSanguche(new Vegano()));
		assertEquals(618, this.subteway.calcularPrecioSanguche(new SinTACC()));
	}
}
