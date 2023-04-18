package practica.OO2.ejercicio13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{

	private DatabaseAccess database;
	private List<Usuario> sesionesIniciadas;
	
	public DatabaseProxy() {
		this.database = new DatabaseRealAccess();
		this.sesionesIniciadas = new ArrayList<Usuario>();
	}
	
	public Collection<String> getSearchResults(String queryString, Usuario user){
		if(!this.chequearAcceso(user)) {
			throw new RuntimeException("Acceso denegado");
		}
		else {
			return this.database.getSearchResults(queryString, user);
		}
	}
	
	public int insertNewRow(List<String> rowData, Usuario user){
		if(!this.chequearAcceso(user)) {
			throw new RuntimeException("Acceso denegado");
		}
		else {
			return this.database.insertNewRow(rowData, user);
		}
	}
	
	
	
	public boolean chequearAcceso(Usuario user) {
		if(this.sesionesIniciadas.contains(user)) {
			return true;
		}
		else {
			return false;
		}
	}
	

	
	public void iniciarSesion(Usuario user) {
		this.sesionesIniciadas.add(user);
	}
	
	public void cerrarSesion(Usuario user) {
		this.sesionesIniciadas.remove(user);
	}
	
	public List<Usuario> getSesionesIniciadas(){
		return this.sesionesIniciadas;
	}
	
	
}
