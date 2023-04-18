package practica.OO2.ejercicio7;

import java.time.Clock;
import java.time.Duration;

public class Paused extends State{

	public void switchToPause(ToDoItem tdi) {
		tdi.setState(new InProgress());
	}
	
	public void switchToFinished(ToDoItem tdi) {
		tdi.setState(new Finished());
	}
	
	public Duration calcularTiempoTranscurrido(Clock horaInicio) {
		return Duration.between(horaInicio.instant(), Clock.systemUTC().instant());
	}
}
