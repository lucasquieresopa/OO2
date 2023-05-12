package practica.OO2.ejercicio6;

public class Planta extends Empleado{

	private boolean estaCasado;
	private int hijos;
	private int aniosAntiguedad;
	
	public Planta(boolean casado, int hijos, int antiguedad) {
		this.estaCasado = casado;
		this.hijos = hijos;
		this.aniosAntiguedad = antiguedad;
	}
	public double basico() {
		return 50000.0;
	}
	
	public double adicional() {
		return this.montoPorCasado() + this.montoSegunHijos() + this.montoSegunAntiguedad();
	}
	
	
	
	public double montoSegunAntiguedad() {
		return 2000.0 * this.aniosAntiguedad;
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
