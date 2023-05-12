package practica.OO2.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugeridor {

	public abstract List<Pelicula> sugerir(Decodificador deco);
	
	public List<Pelicula> noReproducidas(Decodificador deco){
		return deco.getCatalogo().stream()
				.filter(peli -> !deco.FueReproducida(peli))
				.collect(Collectors.toList());
	}
	
	public List<Pelicula> noReproducidasOrdenadasPorAnioDescendente(Decodificador deco){
		return this.noReproducidas(deco).stream()
				.sorted((p1, p2) -> Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
				.collect(Collectors.toList());
	}
}
