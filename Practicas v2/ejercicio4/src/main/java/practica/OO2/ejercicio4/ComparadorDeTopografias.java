package practica.OO2.ejercicio4;

public class ComparadorDeTopografias {

	public boolean compararTopografias(Topografia t1, Topografia t2) {
		return (t1.proporcionDeAgua() == t2.proporcionDeAgua()) && mismaDisposicion(t1, t2);
	}
	
	public boolean mismaDisposicion(Topografia t1, Topografia t2) {
		return t1.disposicion().equals(t2.disposicion());
	}

}
