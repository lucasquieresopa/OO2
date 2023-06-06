package practica.OO2.ejercicio18;

public abstract class Sanguche {
	//Builder
	
	public int calcularPrecio() {
		return this.precioPan()
				+ this.precioAderezo()
				+ this.precioPrincipal()
				+ this.precioAdicional();
	}
	public abstract int precioPan();
	public abstract int precioAderezo();
	public abstract int precioPrincipal();
	public abstract int precioAdicional();
}
