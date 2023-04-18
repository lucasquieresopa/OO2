package practica.OO2.ejercicio5;

import java.time.LocalDate;

public class Archivo extends ContenedorDeDatos{

	private int tamano;
	
	public Archivo (String nombre, LocalDate fecha, int tamano) {
		super(nombre, fecha);
		this.tamano = tamano;
	}
	
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	public Archivo archivoMasNuevo() {
		return this;
	}
	


}
