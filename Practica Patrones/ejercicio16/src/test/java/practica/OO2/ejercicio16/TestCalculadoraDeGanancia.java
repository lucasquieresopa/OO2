package practica.OO2.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculadoraDeGanancia {

	private ProductoFinanciero pf1, pf2, pf3, pf4;
	private CalculadoraDeGanancia c1, c2;
	private List<ProductoFinanciero> lista1;
	private Double montoInicial1, montoInicial2;
	
	@BeforeEach
	public void setUp() {
		this.pf1 = new CompraDolares(400.0);
		this.pf2 = new PlazoFijo(30, 50.0);
		this.pf3 = new CompraPesos(0.35);
		this.pf4 = new PlazoFijoRenovable(60, 80.0);
		
		this.lista1 = new ArrayList<ProductoFinanciero>();
		this.lista1.add(pf1);
		this.lista1.add(pf2);
		this.lista1.add(pf3);
		this.lista1.add(pf4);
		
		this.c1 = new CalculadoraDeGanancia(lista1);
		this.c2 = new CalculadoraDeGanancia(lista1);
		
		this.montoInicial1 = 1000.0;
		this.montoInicial2 = 2000.0;
	}
	
	@Test 
	public void testCompraDolares() {
		assertEquals(1000.0/400.0, this.pf1.ganancia(montoInicial1));
	}
	
	@Test
	public void testCompraPesos() {
		assertEquals(1000.0 / 0.35, this.pf3.ganancia(montoInicial1));
	}
	
	@Test
	public void testPlazoFijo() {
		assertEquals(1000.0+(1000.0*50.0/100) , this.pf2.ganancia(montoInicial1));
	}
	
	@Test
	public void testPlazoFijoRenovable() {
		assertEquals(1000.0+(1000.0*80.0/100) , this.pf4.ganancia(montoInicial1));
	}
	
	@Test
	public void testGanancia1() {
		assertEquals(((((1000.0/400.0)*1.5)/0.35)*1.8), this.c1.calcularGanancia(this.montoInicial1));
	}
	
	@Test
	public void testGanancia2() {
		assertEquals(((((2000.0/400.0)*1.5)/0.35)*1.8), this.c1.calcularGanancia(this.montoInicial2));
	}
}
