package practica.OO2.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDatabase {

	private DatabaseAccess database;
	private Usuario user;
	
	@BeforeEach
	public void setUp() {
		this.database = new DatabaseProxy();
		this.user = new Usuario("pepito@gmail.com", "12345");
	}
	
	@Test
	public void testSesion() {
		assertFalse(this.database.chequearAcceso(this.user));
		this.database.iniciarSesion(this.user);
		assertTrue(this.database.chequearAcceso(this.user));
		this.database.cerrarSesion(this.user);
		assertFalse(this.database.chequearAcceso(this.user));
	}
	
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
