package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca biblioteca;

	@Test
	public void testBiblioteca() {
		this.biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));
	
		String salida = "[\r\n"
				+ "	{\r\n"
				+ "		\"nombre\": \"Arya Stark\",\r\n"
				+ "		\"email\": \"needle@stark.com\",\r\n"
				+ "		\"legajo\": \"5234-5\"\r\n"
				+ "	},\r\n"
				+ "	{\r\n"
				+ "		\"nombre\": \"Tyron Lannister\",\r\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\r\n"
				+ "		\"legajo\": \"2345-2\"\r\n"
				+ "	}\r\n"
				+ "]";
		assertEquals(salida, biblioteca.exportarSocios());
	}
}
