package practica.OO2.ejercicio8;

public class Incompleta extends Estado{

	public void inscribir(Excursion excursion, Usuario usuario) {
		if(excursion.getCupoMaximo() <= excursion.getCupoActual()) {
			excursion.cambiarEstado(new Completa());
		}
		else {
			excursion.agregarUsuario(usuario);
		}
	}


	public String obtenerInformacion(Excursion excursion) {
		
		return "Nombre: " + excursion.getNombre() + "|||" +
				"Costo: " + excursion.getCosto() + "|||" +
				"Fechas" + excursion.getFechaInicio() + " - " + excursion.getFechaFin() + "|||" +
				"Punto de encuentro" + excursion.getPuntoEncuentro() + "|||" +
				"Mails de usuarios inscriptos: " + excursion.getMailsDeUsuarios().toString() + "|||" +
				"Usuarios faltantes para conseguir cupo maximo: " + excursion.getFaltantesParaCupoMaximo();
	}
}
