package practica.OO2.ejercicio21;

import java.time.LocalDate;

public class MamiferoReal {
	
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;

	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (esAncestro(this.getMadre(), unMamifero) || esAncestro(this.getPadre(),unMamifero));
	}
	
	private boolean esAncestro(Mamifero parent, Mamifero unMamifero) {
		return (unMamifero.equals(parent) || parent.tieneComoAncestroA(unMamifero));
	}
}
