package practica.OO2.ejercicio18;

public class Vegetariano extends Sanguche{

	@Override
	public int precioPan() {
		return 120;
	}

	@Override
	public int precioAderezo() {
		return 0;
	}

	@Override
	public int precioPrincipal() {
		return 200;
	}

	@Override
	public int precioAdicional() {
		return 100;
	}

}
