package practica.OO2.ejercicio16;

public class CompraDolares extends ProductoFinanciero{

	private Double valorCompra;
	
	//Constructor concreto
	
	public CompraDolares(Double valor) {
		this.valorCompra = valor;
	}
	
	public Double ganancia(Double montoInicial) {
		return montoInicial / this.valorCompra;
	}
	

	
	
}
