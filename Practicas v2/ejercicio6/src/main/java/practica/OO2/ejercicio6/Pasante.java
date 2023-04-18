package practica.OO2.ejercicio6;

public class Pasante extends Empleado{

	private int examenRendido;
	
	public Pasante(int examenes) {
		this.examenRendido = examenes;
	}
	
	public double basico() {
		return 20000.0;
	}
	
	public double adicional() {
		return 2000.0 * this.examenRendido;
	}
	
}
