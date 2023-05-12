package ejer7;

public class Caudal {

	private double caudal_entrada;
	private double caudal_min = 99999;
	private double caudal_actual = caudal_entrada;
	
	public void setCaudal_entrada(double caudal_entrada) {
		this.caudal_entrada = caudal_entrada;
	}
	public double getCaudal_entrada() {
		return caudal_entrada;
	}
	public double getCaudal_min() {
		return caudal_min;
	}
	public void setCaudal_min(double caudal_min) {
		this.caudal_min = caudal_min;
	}


	
}
