package practica.OO2.ejercicio16;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
	
	//Constructor

	private LocalDate fechaOperacion;
	
	public ProductoFinanciero() {
		this.fechaOperacion = LocalDate.now();
	}
	
	public abstract Double ganancia(Double montoInicial);	//Construir parte
}
