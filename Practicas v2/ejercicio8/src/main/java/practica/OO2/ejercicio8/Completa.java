package practica.OO2.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Completa extends Estado{

	private List<Usuario> listaDeEspera;
	
	public Completa() {
		this.listaDeEspera = new ArrayList<Usuario>();
	}
	
	public void inscribir(Excursion excursion, Usuario usuario) {
		this.listaDeEspera.add(usuario);
	}
	
	public String obtenerInformacion(Excursion excursion) {
		
		return "Nombre: " + excursion.getNombre() + "|||" +
				"Costo: " + excursion.getCosto() + "|||" +
				"Fechas" + excursion.getFechaInicio() + " - " + excursion.getFechaFin() + "|||" +
				"Punto de encuentro" + excursion.getPuntoEncuentro();
	}
}
