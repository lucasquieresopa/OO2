package practica.OO2.ejercicio19.personajes;

import java.util.List;

import practica.OO2.ejercicio19.armaduras.Armadura;
import practica.OO2.ejercicio19.armas.Arma;
import practica.OO2.ejercicio19.habilidades.Habilidad;

public class Arquero extends Personaje{
	

	public Arquero(String nombre, List<Habilidad> habs, Armadura armor, Arma arma) {
		super(nombre, habs, armor, arma);
	}
	
	
}
