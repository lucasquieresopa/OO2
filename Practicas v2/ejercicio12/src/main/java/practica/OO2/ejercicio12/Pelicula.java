package practica.OO2.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private int anioEstreno;
	private List<Pelicula> peliculasSimilares;
	private double puntaje;
	
	public Pelicula(String titulo, int anioEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<Pelicula>();
	}
	
	public void agregarPeliculaSimilar(Pelicula pelicula) {
		this.peliculasSimilares.add(pelicula);
	}
	
	public int getAnioEstreno() {
		return this.anioEstreno;
	}
	
	public List<Pelicula> getPeliculasSimilares(){
		return this.peliculasSimilares;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public boolean similarAReproducida(List<Pelicula> reproducidas) {
		return reproducidas.stream()
				.anyMatch(peli -> peli.estaIncluida(this.peliculasSimilares));
				
	}
	
	private boolean estaIncluida(List<Pelicula> listaDePeliculas) {
		return listaDePeliculas.stream()
				.anyMatch(pelicula -> this.equals(pelicula));
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}

}
