package practica.OO2.ejercicio19.constructorDePersonajes;

import java.util.ArrayList;
import java.util.List;

import practica.OO2.ejercicio19.armaduras.Cuero;
import practica.OO2.ejercicio19.armaduras.Hierro;
import practica.OO2.ejercicio19.armas.Baston;
import practica.OO2.ejercicio19.armas.Martillo;
import practica.OO2.ejercicio19.habilidades.Distancia;
import practica.OO2.ejercicio19.habilidades.Habilidad;
import practica.OO2.ejercicio19.habilidades.Magia;
import practica.OO2.ejercicio19.habilidades.Rayos;
import practica.OO2.ejercicio19.personajes.Arquero;
import practica.OO2.ejercicio19.personajes.Personaje;

public class ConstructorThoor {

	public Personaje constructorThoor(String nombre) {
		List<Habilidad> habs = new ArrayList<Habilidad>();
		habs.add(new Distancia());
		habs.add(new Rayos());
		return new Arquero(nombre, habs, new Hierro(), new Martillo());
	}
}
