package practica.OO2.ejercicio21;

import java.time.LocalDate;

public abstract class Mamifero {

	public abstract String getIdentificador();
	public abstract void setIdentificador(String identificador);
	public abstract String getEspecie();
	public abstract void setEspecie(String especie);
	public abstract LocalDate getFechaNacimiento();
	public abstract void setFechaNacimiento(LocalDate fechaNacimiento);
	public abstract Mamifero getPadre();
	public abstract void setPadre(Mamifero padre);
	public abstract Mamifero getMadre();
	public abstract void setMadre(Mamifero madre);
	public abstract Mamifero getAbueloPaterno();
	public abstract Mamifero getAbuelaPaterna();
	public abstract Mamifero getAbueloMaterno();
	public abstract Mamifero getAbuelaMaterna();
	public abstract boolean tieneComoAncestroA(Mamifero ancestro);
	
}
