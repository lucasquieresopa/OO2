package practica.OO2.ejercicio18;

public class Vegano extends Sanguche{

	@Override
	public int precioPan() {
		return 100;
	}

	@Override
	public int precioAderezo() {
		return 20;
	}

	@Override
	public int precioPrincipal() {
		return 500;
	}

	@Override
	public int precioAdicional() {
		return 0;
	}

}
