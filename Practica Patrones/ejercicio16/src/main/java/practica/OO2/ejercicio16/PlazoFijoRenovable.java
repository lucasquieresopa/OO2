package practica.OO2.ejercicio16;

public class PlazoFijoRenovable extends ProductoFinanciero{
	
	//Constructor concreto

	private int cantidadDias;
	private Double interes;
	
	public PlazoFijoRenovable(int cantidadDias, Double interes) {
		this.cantidadDias = cantidadDias;
		this.interes = interes;
	}
	
	public Double ganancia(Double montoInicial) {
		return montoInicial + (montoInicial * this.interes/100);
	}
}
