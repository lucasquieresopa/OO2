package practica.OO2.ejercicio14;

public class Nombre implements Caracteristica{

	private String nombre;
	
	public Nombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getString() {
		return this.nombre;
	}
}
