package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest2 {
	private Biblioteca biblioteca;

	@BeforeEach
	public void setUp() throws Exception{
		this.biblioteca = new Biblioteca();
		this.biblioteca.setExporter(new Exporter());
	}
	@Test
	public void testBiblioteca() throws ParseException {
		
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
		JSONParser parser = new JSONParser();
		assertEquals(parser.parse(salida), parser.parse(this.biblioteca.exportarSocios()));
//		assertEquals(salida, biblioteca.exportarSocios());
	}
}
