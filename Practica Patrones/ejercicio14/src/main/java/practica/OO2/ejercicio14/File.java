package practica.OO2.ejercicio14;

import java.time.LocalDate;

public abstract class File {

	private Caracteristica nombre;
	private Caracteristica extension;
	private Caracteristica tamano;
	private Caracteristica fechaCreacion;
	private Caracteristica fechaModificacion;
	private Caracteristica permisos;
	private String orden;
	
	public File(String nombre, String extension, String tamano,
			LocalDate fechaCreacion, LocalDate FechaModificacion, String permisos) {
		this.nombre = new Nombre(nombre);
		this.extension = new Extension(extension);
		this.tamano = new Tamano(tamano);
		this.fechaCreacion = new FechaCreacion(fechaCreacion);
		this.fechaModificacion = new FechaModificacion(fechaModificacion);
		this.permisos = new Permisos(permisos);
	}
	
	public String prettyPrint() {
		return "";
	}
	
	
}
