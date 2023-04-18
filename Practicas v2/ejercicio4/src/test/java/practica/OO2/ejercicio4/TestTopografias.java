package practica.OO2.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTopografias {
	private CreadorDeTopografias creador;
	private Topografia agua, tierra, mixta1, mixta2, mixta3, mixta4, mixta5, mixta6, pantano;
	private ComparadorDeTopografias comparador;
	
	@BeforeEach
	public void setUp() {
		this.creador = new CreadorDeTopografias();
		this.agua = creador.crearTopografiaDeAgua();
		this.tierra = creador.crearTopografiaDeTierra();
		this.mixta1 = creador.crearTopografiaCompuesta(agua, tierra, tierra, agua);
		this.mixta2 = creador.crearTopografiaCompuesta(agua, tierra, tierra, mixta1);
		this.mixta3 = creador.crearTopografiaCompuesta(agua, tierra, tierra, agua);
		this.mixta4 = creador.crearTopografiaCompuesta(agua, tierra, agua, agua);
		this.pantano = creador.crearTopografiaDePantano();
		this.mixta5 = creador.crearTopografiaCompuesta(agua, tierra, agua, pantano);
		this.mixta6 = creador.crearTopografiaCompuesta(agua, tierra, pantano, mixta2);
		this.comparador = new ComparadorDeTopografias();
	}
	
	@Test
	public void testProporcionDeAgua() {
		assertEquals(1.0, this.agua.proporcionDeAgua());
		assertEquals(0.0, this.tierra.proporcionDeAgua());
		assertEquals(0.5, this.mixta1.proporcionDeAgua());
		assertEquals( ((1.0 + 0.0 + 0.0 + ((1.0 + 0.0 + 0.0 + 1.0) / 4)) / 4) , this.mixta2.proporcionDeAgua());
	}
	
	@Test
	public void testComparaciones() {
		assertFalse(this.comparador.compararTopografias(this.agua, this.tierra));
		assertFalse(this.comparador.compararTopografias(this.agua, this.mixta1));
		assertFalse(this.comparador.compararTopografias(this.mixta2, this.mixta1));
		assertTrue(this.comparador.compararTopografias(this.mixta1, this.mixta3));
		assertFalse(this.comparador.compararTopografias(this.mixta1, this.mixta4));
		
		
	}
	
	@Test
	public void testComparacionesConPantano() {
		assertFalse(this.comparador.compararTopografias(this.mixta1, this.mixta5));
	}
	
	@Test
	public void testProporcionesDeAgua() {
		assertEquals(0.5, this.mixta1.proporcionDeAgua());
		assertEquals(1.5/4, this.mixta2.proporcionDeAgua());
		assertEquals((1.0 + 0.0 + 1.0 + 0.7) /4 , this.mixta5.proporcionDeAgua());
		double m1 = (1.0 + 0.0 + 0.0 + 1.0) / 4;
		double m2 = (1.0 + 0.0 + 0.0 + m1) / 4 ;
		assertEquals((1.0 + 0.0 + 0.7 + m2) / 4, this.mixta6.proporcionDeAgua());
	}
	

	 
		
	


}
