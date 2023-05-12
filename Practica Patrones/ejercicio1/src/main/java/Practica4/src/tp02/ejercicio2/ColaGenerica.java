package tp02.ejercicio2;

public class ColaGenerica<T>{
	
	// creando una var. de inst. de L_E_G accedo a sus metodos a traves de datos.
	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void comenzar() {
		datos.comenzar();
	}
	
	public void encolar(T elem) {
		datos.agregarFinal(elem);
		
	}
	public T desencolar() {
		T elem = datos.elemento(1);
		datos.eliminarEn(1);
		datos.proximo();
		
		return elem;
	
	}
	public T tope() {
		T elem = datos.elemento(1);
		
		return elem;
	}
	public boolean esVacia() {

		if (datos.esVacia() == true){
			return true;
		}
		else
			return false;

	}
	

}
