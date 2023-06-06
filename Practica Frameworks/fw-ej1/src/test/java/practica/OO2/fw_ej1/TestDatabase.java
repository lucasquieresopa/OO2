package practica.OO2.fw_ej1;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDatabase {

	private DatabaseProxy database;
	private Usuario user;
	private static Logger logger = Logger.getLogger("bbdd");
	
	
	@BeforeAll
	public static void config(){
		//LogManager.reset quita el handler por defecto 
		//Logger.log imprime una vez por cada hanlder que tenga.
		
		LogManager.getLogManager().reset(); 
		ConsoleHandler ch = new ConsoleHandler();
		ch.setFormatter(new MayusFormatter());
		Logger.getLogger("bbdd").addHandler(ch);
		
		try {
			FileHandler fh = new FileHandler("logs/logs.txt");
			fh.setFormatter(new JSONFormatter());
			Logger.getLogger("bbdd").addHandler(fh);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		WordHandler wh = new WordHandler(new ConsoleHandler());
		wh.filterWord("exitosa");
		wh.filterWord("Fila");
		Logger.getLogger("bbdd").addHandler(wh);
		
		try {
			WordHandler wh2 = new WordHandler(new FileHandler("logs/wordFilteredLogs.txt"));
			wh2.setFormatter(new JSONFormatter());
			Logger.getLogger("bbdd").addHandler(wh2);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@BeforeEach
	public void setUp() {
		this.database = new DatabaseProxy();
		this.user = new Usuario("pepito@gmail.com", "12345");
		
		
		
	}
	
//	@Test
//	public void testSesion() {
//		assertFalse(this.database.chequearAcceso(this.user));
//		this.database.iniciarSesion(this.user);
//		assertTrue(this.database.chequearAcceso(this.user));
//		this.database.cerrarSesion(this.user);
//		assertFalse(this.database.chequearAcceso(this.user));
//	}
	
	@Test
	public void testGetSearchResults() {
		this.database.iniciarSesion(this.user);
		assertEquals(Arrays.asList("Spiderman", "Marvel"), 
				this.database.getSearchResults("select * from comics where id=1", this.user));
        assertEquals(Collections.emptyList(), 
        		this.database.getSearchResults("select * from comics where id=10", this.user));
	}
	
	@Test
	public void testInsertNewRow() {
		this.database.iniciarSesion(this.user);
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor"), this.user));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), 
        		this.database.getSearchResults("select * from comics where id=3", this.user));
    }
	
		
}
