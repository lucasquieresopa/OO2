package practica.OO2.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends Archivo{

	private List<ContenedorDeDatos> contenido;
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
		this.contenido = new ArrayList<ContenedorDeDatos>();
	}

	public int tamanoTotalOcupado() {
		//Retorna el espacio total ocupado, incluyendo su contenido.
		return super.tamanoTotalOcupado() + this.contenido.stream()
				.mapToInt(c -> c.tamanoTotalOcupado())
				.sum();
	}

	public Archivo archivoMasGrande() {
		//Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
		//filesystem contenido por directorio receptor
		return this.contenido.stream()
				.map(a -> a.archivoMasGrande())
				.max((c1, c2) -> Integer.compare(
						c1.archivoMasGrande().tamanoTotalOcupado(),
						c2.archivoMasGrande().tamanoTotalOcupado()))
				.orElse(null);		
	}
	

	public Archivo archivoMasNuevo() {
		//Retorna el archivo con fecha de creación más reciente en cualquier nivel
		//del filesystem contenido por directorio receptor.
		return this.contenido.stream()
				.map(a -> a.archivoMasGrande())
				.max((c1, c2) -> c1.archivoMasNuevo().getFechaDeCreacion().compareTo(
						c2.archivoMasNuevo().getFechaDeCreacion()))
				.orElse(null);	
	}
	
	
	public void agregar(ContenedorDeDatos contenido) {
		this.contenido.add(contenido);
	}
	
	

}
