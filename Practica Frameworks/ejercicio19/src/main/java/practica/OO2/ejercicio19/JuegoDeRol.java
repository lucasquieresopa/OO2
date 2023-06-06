package practica.OO2.ejercicio19;

import java.util.ArrayList;
import java.util.List;

import practica.OO2.ejercicio19.armaduras.Acero;
import practica.OO2.ejercicio19.armaduras.Cuero;
import practica.OO2.ejercicio19.armaduras.Hierro;
import practica.OO2.ejercicio19.armas.Arco;
import practica.OO2.ejercicio19.armas.Baston;
import practica.OO2.ejercicio19.armas.Espada;
import practica.OO2.ejercicio19.armas.Martillo;
import practica.OO2.ejercicio19.habilidades.CuerpoACuerpo;
import practica.OO2.ejercicio19.habilidades.Distancia;
import practica.OO2.ejercicio19.habilidades.Habilidad;
import practica.OO2.ejercicio19.habilidades.Magia;
import practica.OO2.ejercicio19.habilidades.Rayos;
import practica.OO2.ejercicio19.personajes.Arquero;
import practica.OO2.ejercicio19.personajes.Guerrero;
import practica.OO2.ejercicio19.personajes.Mago;
import practica.OO2.ejercicio19.personajes.Personaje;

public class JuegoDeRol {
	
	private List<Personaje> personajes;
	
	public JuegoDeRol() {
		this.personajes = new ArrayList<Personaje>();
	}

	
	public void enfrentamiento(Personaje p1, Personaje p2) {
		p1.recibirDaño(p2.getArma());
		p2.recibirDaño(p1.getArma());
	}
	
	
	//Dado que los constructores y los tipos de Personaje son clases de datos
	//¿no sería mejor crear Personajes de esta manera?
	//se borrarían los constructores y las subclases de personaje, para dejar solo la clase Personaje
	
//	public Personaje crearArquero(String nombre) {
//		List<Habilidad> habs = new ArrayList<Habilidad>();
//		habs.add(new Distancia());
//		return new Personaje(nombre, habs, new Cuero(), new Arco());
//	}
//	
//	public Personaje constructorGuerrero(String nombre) {
//		List<Habilidad> habs = new ArrayList<Habilidad>();
//		habs.add(new CuerpoACuerpo());
//		return new Personaje(nombre, habs, new Acero(), new Espada());
//	}
//	
//	public Personaje constructorMago(String nombre) {
//		List<Habilidad> habs = new ArrayList<Habilidad>();
//		habs.add(new Distancia());
//		habs.add(new Magia());
//		return new Personaje(nombre, habs, new Cuero(), new Baston());
//	}
//	
//	public Personaje constructorThoor(String nombre) {
//		List<Habilidad> habs = new ArrayList<Habilidad>();
//		habs.add(new Distancia());
//		habs.add(new Rayos());
//		return new Personaje(nombre, habs, new Hierro(), new Martillo());
//	}
	
	
}
