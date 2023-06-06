package practica.OO2.ejercicio19.personajes;

import java.util.List;

import practica.OO2.ejercicio19.armaduras.Armadura;
import practica.OO2.ejercicio19.armas.Arma;
import practica.OO2.ejercicio19.habilidades.Habilidad;

public abstract class Personaje {
	
	private String nombre;
	private List<Habilidad> habilidades;
	private Armadura armadura;
	private Arma arma;
	private int vida;

	public Personaje(String nombre, List<Habilidad> habs, Armadura armor, Arma arma) {
		this.nombre = nombre;
		this.habilidades = habs;
		this.armadura = armor;
		this.arma = arma;
		this.vida = 100;
	}
	
	public Arma getArma() {
		return this.arma;
	}
	
	public void recibirDaño(Arma armaAtacante) {
		//this.vida -= this.armadura.mitigacion() + armaAtacante.daño();
		this.vida -= this.armadura.dañoRecibidoBase() 
				+ (this.armadura.multiplicadorDeDaño() 
				* armaAtacante.dañoBase());
	}
	
	public int getVidaRestante() {
		return this.vida;
	}
}
