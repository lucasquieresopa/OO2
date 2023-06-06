package practica.OO2.ejercicio19.constructorDePersonajes;

import java.util.ArrayList;
import java.util.List;

import practica.OO2.ejercicio19.armaduras.Cuero;
import practica.OO2.ejercicio19.armas.Arco;
import practica.OO2.ejercicio19.habilidades.Distancia;
import practica.OO2.ejercicio19.habilidades.Habilidad;
import practica.OO2.ejercicio19.personajes.Arquero;
import practica.OO2.ejercicio19.personajes.Personaje;

public class ConstructorArquero {

	public Personaje constructorArquero(String nombre) {
		List<Habilidad> habs = new ArrayList<Habilidad>();
		habs.add(new Distancia());
		return new Arquero(nombre, habs, new Cuero(), new Arco());
	}
	
}
