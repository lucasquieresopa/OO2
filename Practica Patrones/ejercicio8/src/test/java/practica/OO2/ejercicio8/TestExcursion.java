package practica.OO2.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExcursion {

	private Usuario u1, u2, u3;
	private Excursion exc1;
	
	@BeforeEach
	public void setUp() {
		this.exc1 = new Excursion("Dos días en kayak bajando el Paraná", 
				LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 3), 
				"Santa Fe", 200.0, 1, 2);
		this.u1 = new Usuario("jorge", "lopez", "jl@gmail.com");
		this.u2 = new Usuario("tomas", "perez", "tp@gmail.com");
		this.u3 = new Usuario("leo", "diaz", "ld@gmail.com");
	}
	
	@Test
	public void testExcursion1() {
		//System.out.println(this.exc1.obtenerInformacion());
		assertEquals("Nombre: Dos días en kayak bajando el Paraná|||Costo: 200.0|||Fechas: 2023-01-01 - 2023-01-03|||Punto de encuentroSanta Fe|||Usuarios faltantes para conseguir cupo minimo: 1",
				this.exc1.obtenerInformacion());
		this.exc1.inscribir(this.u1);
		//System.out.println(this.exc1.obtenerInformacion());
		assertEquals("Nombre: Dos días en kayak bajando el Paraná|||Costo: 200.0|||Fechas2023-01-01 - 2023-01-03|||Punto de encuentroSanta Fe|||Mails de usuarios inscriptos: [jl@gmail.com]|||Usuarios faltantes para conseguir cupo maximo: 1",
				this.exc1.obtenerInformacion());
		this.exc1.inscribir(this.u2);
		assertEquals("Nombre: Dos días en kayak bajando el Paraná|||Costo: 200.0|||Fechas2023-01-01 - 2023-01-03|||Punto de encuentroSanta Fe|||Mails de usuarios inscriptos: [jl@gmail.com, tp@gmail.com]|||Usuarios faltantes para conseguir cupo maximo: 0",
				this.exc1.obtenerInformacion());
		//System.out.println(this.exc1.obtenerInformacion());
		this.exc1.inscribir(this.u3);
		assertEquals("Nombre: Dos días en kayak bajando el Paraná|||Costo: 200.0|||Fechas2023-01-01 - 2023-01-03|||Punto de encuentroSanta Fe"
				+ "",
				this.exc1.obtenerInformacion());
		//System.out.println(this.exc1.obtenerInformacion());
	}
}
