package practica.OO2.ejercicio6;

public class Temporario extends Empleado{

	private int horasTrabajadas;
	private int hijos;
	private boolean estaCasado;
	
	public Temporario(int horas, int hijos, boolean casado) {
		this.horasTrabajadas = horas;
		this.hijos = hijos;
		this.estaCasado = casado;
	}
	
	public double basico() {
		return 20000.0 + this.horasTrabajadas * 300.0;
	}
	
	public double adicional() {
		return montoSegunHijos() + montoPorCasado();
	}
	
	
	public double montoPorCasado() {
		if(estaCasado) {
			return 5000.0;
		}
		else {
			return 0.0;
		}
	}
	
	public double montoSegunHijos() {
		return 2000.0 * this.hijos;
	}
}
