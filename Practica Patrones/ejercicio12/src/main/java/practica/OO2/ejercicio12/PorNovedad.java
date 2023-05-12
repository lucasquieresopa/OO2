package practica.OO2.ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class PorNovedad extends Sugeridor{

	public List<Pelicula> sugerir(Decodificador deco){
		
		return super.noReproducidas(deco).stream()
				.sorted((p1, p2) -> Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
				.limit(3)
				.collect(Collectors.toList());
	}
}
