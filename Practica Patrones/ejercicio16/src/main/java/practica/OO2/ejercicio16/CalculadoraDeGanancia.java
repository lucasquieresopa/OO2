package practica.OO2.ejercicio16;

import java.util.List;

public class CalculadoraDeGanancia {

	//Director
	
	private List<ProductoFinanciero> productos;
	
	public CalculadoraDeGanancia(List<ProductoFinanciero> prods) {
		this.productos = prods;
	}
	
	public Double calcularGanancia(Double montoInicial) {
		double gananciaAnterior = montoInicial;
		//double gananciaTotal = 0;
		for(ProductoFinanciero prod: this.productos){
			gananciaAnterior = prod.ganancia(gananciaAnterior);

		}
		return gananciaAnterior;
	}
}
