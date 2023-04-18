package practica.OO2.ejercicio6;

public abstract class Empleado {

	
	public double sueldo() {
		return basico() * descuentoBasico() + adicional() * descuentoAdicional();
	}
	
	public double descuentoBasico() {
		return 1.13;
	}
	
	public double descuentoAdicional() {
		return 1.05;
	}
	
	public abstract double basico();
	public abstract double adicional();
	
	
}
