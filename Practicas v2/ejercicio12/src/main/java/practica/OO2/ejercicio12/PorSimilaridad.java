package practica.OO2.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class PorSimilaridad extends Sugeridor{

public List<Pelicula> sugerir(Decodificador deco){
		
		return super.noReproducidasOrdenadasPorAnioDescendente(deco).stream()
				.filter(peli -> peli.similarAReproducida(deco.getReproducidas()))
				.limit(3)
				.collect(Collectors.toList());
	}
}
