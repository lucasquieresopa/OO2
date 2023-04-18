package practica.OO2.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDecodificador {

	private Decodificador deco;
	private Pelicula p1, p2, p3, p4, p5, p6;
	private Sugeridor s1, s2, s3;
	
	@BeforeEach
	public void setUp() {
		this.deco = new Decodificador();
		this.p1 = new Pelicula("Thor", 2007, 7.9);
		this.p2 = new Pelicula("Capitan America", 2016, 7.8);
		this.p3 = new Pelicula("Iron Man", 2010, 7.9);
		this.p4 = new Pelicula("Dunkirk", 2017, 7.9);
		this.p5 = new Pelicula("Rocky", 1976, 8.1);
		this.p6 = new Pelicula("Rambo", 1979, 7.8);
		
		this.deco.establecerComoSimilares(p1, p2);
		this.deco.establecerComoSimilares(p1, p3);
		this.deco.establecerComoSimilares(p5, p6);
		
		this.deco.agregarAlCatalogo(p1);
		this.deco.agregarAlCatalogo(p2);
		this.deco.agregarAlCatalogo(p3);
		this.deco.agregarAlCatalogo(p4);
		this.deco.agregarAlCatalogo(p5);
		this.deco.agregarAlCatalogo(p6);
		
		this.deco.marcarComoReproducida(this.p1);
		this.deco.marcarComoReproducida(this.p5);
		
		
		
		
	}
	
	
	@Test
	public void testPeliculasSimilares() {
		assertTrue(this.p1.getPeliculasSimilares().contains(this.p2));
		assertTrue(this.p2.getPeliculasSimilares().contains(this.p1));
	}
	
	@Test void testReproducidas() {
		assertEquals(2, this.deco.getReproducidas().size());
		assertTrue(this.deco.getReproducidas().contains(this.p5));
	}
	
	@Test
	public void testListaDeNoReproducidas() {
		this.s1 = new PorNovedad();
		this.deco.configurarSugeridor(this.s1);
		assertTrue(this.deco.FueReproducida(this.p1));
		assertFalse(this.deco.FueReproducida(this.p2));
		assertFalse(this.s1.noReproducidas(this.deco).contains(this.p1));
		assertTrue(this.s1.noReproducidas(this.deco).contains(this.p2));
	}
	
	@Test
	public void testPorNovedad() {
		this.deco.configurarSugeridor(new PorNovedad());
		List<Pelicula> sugeridas = this.deco.sugerir();
//		for (Pelicula peli : sugeridas) {
//			System.out.println(peli.getTitulo());
//		}
		assertTrue(sugeridas.contains(this.p2) && 
				sugeridas.contains(this.p3) &&
				sugeridas.contains(this.p4));
		assertTrue((sugeridas.get(0).equals(this.p4)) &&
				(sugeridas.get(1).equals(this.p2)) &&
				(sugeridas.get(2).equals(this.p3)));
	}
	
	@Test
	public void testPorSimilaridad() {
		this.deco.configurarSugeridor(new PorSimilaridad());
		List<Pelicula> sugeridas = this.deco.sugerir();

		assertTrue((sugeridas.get(0).equals(this.p2)) &&
				(sugeridas.get(1).equals(this.p3)) &&
				(sugeridas.get(2).equals(this.p6)));
		
	}
	
	@Test
	public void testPorPuntaje() {
		this.deco.configurarSugeridor(new PorPuntaje());
		List<Pelicula> sugeridas = this.deco.sugerir();
//		for (Pelicula peli : sugeridas) {
//			System.out.println(peli.getTitulo());
//		}
		assertTrue((sugeridas.get(0).equals(this.p4)) &&
				(sugeridas.get(1).equals(this.p3)) &&
				(sugeridas.get(2).equals(this.p2)));
		
	}
	
	@Test 
	public void testSugerencias() {
		this.deco.configurarSugeridor(new PorSimilaridad());
		List<Pelicula> sugeridas = this.deco.sugerir();
		assertTrue((sugeridas.get(0).equals(this.p2)) &&
				(sugeridas.get(1).equals(this.p3)) &&
				(sugeridas.get(2).equals(this.p6)));
		
		this.deco.configurarSugeridor(new PorPuntaje());
		sugeridas = this.deco.sugerir();
		assertTrue((sugeridas.get(0).equals(this.p4)) &&
				(sugeridas.get(1).equals(this.p3)) &&
				(sugeridas.get(2).equals(this.p2)));
	}
	
}
