package practica.OO2.ejercicio8;


public class Provisoria extends Estado{
	
	public void inscribir(Excursion excursion, Usuario usuario) {
		excursion.agregarUsuario(usuario);
		if(excursion.getCupoMinimo() <= excursion.getCupoActual()) {
			excursion.cambiarEstado(new Incompleta());
		}
	}
	
	public String obtenerInformacion(Excursion excursion) {
		return "Nombre: " + excursion.getNombre() + "|||" +
				"Costo: " + excursion.getCosto() + "|||" +
				"Fechas: " + excursion.getFechaInicio() + " - " + excursion.getFechaFin() + "|||" +
				"Punto de encuentro" + excursion.getPuntoEncuentro() + "|||" +
				"Usuarios faltantes para conseguir cupo minimo: " + excursion.getFaltantesParaCupoMinimo();
	}


}
