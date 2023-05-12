package practica.OO2.ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {

	private Empleado temp1, temp2, pas1, pas2, planta1, planta2;
	
	@BeforeEach
	public void setUp() {
		this.temp1 = new Temporario(0, 0, false);
		this.temp2 = new Temporario(10, 10, true);
		this.pas1 = new Pasante(0);
		this.pas2 = new Pasante(1);
		this.planta1 = new Planta(false, 0, 0);
		this.planta2 = new Planta(true, 10, 10);
	}
	
	@Test
	public void testTemporario() {
		assertEquals(20000.0 * 1.13 + 0.0 * 1.05, this.temp1.sueldo());
		assertEquals((20000.0 + 10 * 300.0) * 1.13 + 
						(10 * 2000.0 + 5000.0) * 1.05,
						this.temp2.sueldo());
	}
	
	@Test
	public void testPasante() {
		assertEquals(20000.0 * 1.13 + 2000.0 * 0 * 1.05, this.pas1.sueldo());
		assertEquals(20000.0 * 1.13 + 2000.0 * 1 * 1.05, this.pas2.sueldo());
	}
	
	@Test
	public void testPlanta() {
		assertEquals(50000.0 * 1.13 + (0 + 2000.0 * 0 + 2000.0 * 0) * 1.05, this.planta1.sueldo());
		assertEquals(50000.0 * 1.13 + (5000.0 + 2000.0 * 10 + 2000.0 * 10) * 1.05, this.planta2.sueldo());
	}
	
}
