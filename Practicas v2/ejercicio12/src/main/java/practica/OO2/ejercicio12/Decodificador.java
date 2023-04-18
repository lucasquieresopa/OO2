package practica.OO2.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> catalogo;
	private List<Pelicula> peliculasReproducidas;
	private Sugeridor sugeridor;
	
	public Decodificador() {
		this.catalogo = new ArrayList<Pelicula>();
		this.peliculasReproducidas = new ArrayList<Pelicula>();
		this.sugeridor = new PorPuntaje();
	}
	
	public void configurarSugeridor(Sugeridor nuevoSugeridor){
		this.sugeridor = nuevoSugeridor;
	}
	
	public List<Pelicula> sugerir(){
		return this.sugeridor.sugerir(this);
	}
	
	public void establecerComoSimilares(Pelicula p1, Pelicula p2) {
		p1.agregarPeliculaSimilar(p2);
		p2.agregarPeliculaSimilar(p1);
	}
	
	public List<Pelicula> getCatalogo(){
		return this.catalogo;
	}
	
	public List<Pelicula> getReproducidas(){
		return this.peliculasReproducidas;
	}
	
	public boolean FueReproducida(Pelicula peli) {
		return this.peliculasReproducidas.stream()
				.anyMatch(peliRepro -> peliRepro.equals(peli));
	}
	
	public void marcarComoReproducida(Pelicula peli) {
		this.peliculasReproducidas.add(peli);
	}
	
	public void agregarAlCatalogo(Pelicula peli) {
		this.catalogo.add(peli);
	}
}
