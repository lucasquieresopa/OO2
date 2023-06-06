package practica.OO2.fw_ej1;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import java.util.logging.*;


public class DatabaseProxy implements DatabaseAccess{
	
	private DatabaseAccess database;
	private List<Usuario> sesionesIniciadas;
	
	public DatabaseProxy() {
		this.database = new DatabaseRealAccess();
		this.sesionesIniciadas = new ArrayList<Usuario>();
		
	}
	
	public Collection<String> getSearchResults(String queryString, Usuario user){
		this.chequearAcceso(user);
		Logger.getLogger("bbdd").log(Level.INFO, "Busqueda exitosa");
		return this.database.getSearchResults(queryString, user);

	}
	
	public int insertNewRow(List<String> rowData, Usuario user){
		this.chequearAcceso(user);
		Logger.getLogger("bbdd").log(Level.WARNING, "Fila agregada");
		return this.database.insertNewRow(rowData, user);
	}
	
	public void chequearAcceso(Usuario user) {
		if(!this.sesionesIniciadas.contains(user)) {
			Logger.getLogger("bbdd").log(Level.SEVERE, "Acceso indebido");
			throw new RuntimeException("Acceso denegado");
		}
			
	}
	
	public void iniciarSesion(Usuario user){
		this.sesionesIniciadas.add(user);

	}
	
	public void cerrarSesion(Usuario user) {
		this.sesionesIniciadas.remove(user);
	}
	
	public List<Usuario> getSesionesIniciadas(){
		return this.sesionesIniciadas;
	}
	

	
}
