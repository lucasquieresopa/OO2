package practica.OO2.ejercicio7;

import java.time.Clock;
import java.time.Duration;

public class Finished extends State{

	private Clock horaFin;
	
	public Finished() {
		this.horaFin = Clock.systemUTC();
	}
	public void switchToPause(ToDoItem tdi) {
		throw new RuntimeException("Error: No puede ponerse en pausa en estado 'Finished'");
	}
	
	public Duration calcularTiempoTranscurrido(Clock horaInicio) {
		return Duration.between(horaInicio.instant(), this.horaFin.instant());
	}
	
	public void agregarComentario(String comentario) {
		throw new RuntimeException("Error: no puede agregarse un comentario en estado Finished");
	}
}
