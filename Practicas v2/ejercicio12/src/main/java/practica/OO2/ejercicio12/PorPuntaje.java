package practica.OO2.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class PorPuntaje extends Sugeridor{

public List<Pelicula> sugerir(Decodificador deco){
		return super.noReproducidasOrdenadasPorAnioDescendente(deco).stream()
				.sorted((p1, p2) -> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
				.limit(3)
				.collect(Collectors.toList());
				
	}
}
