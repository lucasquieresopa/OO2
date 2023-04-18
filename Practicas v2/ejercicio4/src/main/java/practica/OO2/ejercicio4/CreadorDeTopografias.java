package practica.OO2.ejercicio4;

public class CreadorDeTopografias {

	public Agua crearTopografiaDeAgua() {
		return new Agua();
	}
	
	public Tierra crearTopografiaDeTierra() {
		return new Tierra();
	}
	
	public Topografia crearTopografiaCompuesta(Topografia esquinaSI,
			Topografia esquinaSD, Topografia esquinaII, Topografia esquinaID) {
		return new Mixta(esquinaSI, esquinaSD, esquinaII, esquinaID);
	}
	
	public Pantano crearTopografiaDePantano() {
		return new Pantano();
	}
	
}
