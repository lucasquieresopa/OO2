package practica.OO2.ejercicio16;

public class CompraPesos extends ProductoFinanciero{

	private Double valorCompra;
	
	//Constructor concreto
	
	public CompraPesos(Double valor) {
		this.valorCompra = valor;
	}
	
	public Double ganancia(Double montoInicial) {
		return montoInicial / this.valorCompra;
	}
	

}
