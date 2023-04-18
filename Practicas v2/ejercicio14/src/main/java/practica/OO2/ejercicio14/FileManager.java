package practica.OO2.ejercicio14;

import java.util.ArrayList;
import java.util.List;

//DECORATOR

public class FileManager {

	private List<File> archivos;
	
	public FileManager() {
		this.archivos = new ArrayList<File>();
	}
	
//	public String prettyPrint() {
//		String cadena = "";
//		for(File archivo : this.archivos){
//			cadena = cadena + archivo.getOrden();
//		}
//		return cadena;
//	}
	
	public File prettyPrint() {
		this.archivos.stream()
			.map(arch -> arch.prettyPrint());
	}
}
