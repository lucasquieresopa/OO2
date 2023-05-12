package practica.OO2.ejercicio5;

import java.time.LocalDate;

public abstract class ContenedorDeDatos {
	private String nombre;
	private LocalDate fechaDeCreación;
	
	public ContenedorDeDatos(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaDeCreación = fecha;
	}
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	
	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreación;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
