package practica.OO2.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica.OO2.ejercicio19.constructorDePersonajes.ConstructorArquero;
import practica.OO2.ejercicio19.constructorDePersonajes.ConstructorGuerrero;
import practica.OO2.ejercicio19.constructorDePersonajes.ConstructorMago;
import practica.OO2.ejercicio19.constructorDePersonajes.ConstructorThoor;
import practica.OO2.ejercicio19.personajes.Personaje;

public class TestJuegoDeRol {

	
	private JuegoDeRol juego;
	private ConstructorArquero constArq;
	private ConstructorGuerrero constGuer;
	private ConstructorMago constMago;
	private ConstructorThoor constThoor;
	private Personaje mago1, mago2, guerrero1, arq1, thoor1;
	
	@BeforeEach
	public void setUp() {
		this.juego = new JuegoDeRol();
		
		this.constMago = new ConstructorMago();
		this.constArq = new ConstructorArquero();
		this.constGuer = new ConstructorGuerrero();
		this.constThoor = new ConstructorThoor();
		
		this.mago1 = constMago.constructorMago("Ramirez");
		this.mago2 = constMago.constructorMago("Juan Román");
		this.guerrero1 = constGuer.constructorGuerrero("Paolo");
		this.arq1 = constArq.constructorArquero("El mono Burgos");
		this.thoor1 = constThoor.constructorThoor("Thor Nado");
		
	}
	
	@Test
	public void testMagoVsMago() {
		this.juego.enfrentamiento(mago1, mago2);
		assertEquals(98, mago1.getVidaRestante());
		assertEquals(98, mago2.getVidaRestante());
	}
	
	@Test
	public void testMagoVsGuerrero() {
		this.juego.enfrentamiento(mago1, guerrero1);
		assertEquals(92, mago1.getVidaRestante());
		assertEquals(99, guerrero1.getVidaRestante());
	}
	
	@Test
	public void testMagoVsArquero() {
		this.juego.enfrentamiento(mago1, arq1);
		assertEquals(95, mago1.getVidaRestante());
		assertEquals(98, arq1.getVidaRestante());
	}
	
	@Test 
	public void testMagoVsThoor() {
		this.juego.enfrentamiento(mago1, thoor1);
		assertEquals(89, mago1.getVidaRestante());
		assertEquals(99, thoor1.getVidaRestante());
	}
	
	@Test
	public void testAcumulacionDeDaño() {
		this.juego.enfrentamiento(mago1, mago2);
		assertEquals(98, mago1.getVidaRestante());
		assertEquals(98, mago2.getVidaRestante());
		
		this.juego.enfrentamiento(mago1, guerrero1);
		assertEquals(90, mago1.getVidaRestante());
		assertEquals(99, guerrero1.getVidaRestante());
	}
}
