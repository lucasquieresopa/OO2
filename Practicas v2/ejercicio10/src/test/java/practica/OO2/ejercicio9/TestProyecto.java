package practica.OO2.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProyecto {

	private Proyecto pr1;
	
	@BeforeEach
	public void setUp() {
		this.pr1 = new Proyecto("Vacaciones de invierno", 
				LocalDate.of(2023, 1, 1), LocalDate.of(2023,  1, 11),
				"salir con amigos", 3, 100.0);
		this.pr1.aprobarEtapa();
	}
	
	@Test
	public void TestProyecto1() {
		this.pr1.aprobarEtapa();
		assertEquals(3 * 100.0 * 10 , this.pr1.getCostoDeProyecto());
		assertEquals((3 * 100.0 * 10) * 1.07 , this.pr1.precioDelProyecto());
		this.pr1.aprobarEtapa();
	}
}
