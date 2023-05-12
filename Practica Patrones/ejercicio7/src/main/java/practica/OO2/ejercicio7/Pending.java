package practica.OO2.ejercicio7;

import java.time.Clock;
import java.time.Duration;

public class Pending extends State{

	public void switchToInProgress(ToDoItem tdi) {
		tdi.setState(new InProgress());
		tdi.startTimer();
	}
	
	public void switchToPause(ToDoItem tdi) {
		throw new RuntimeException("Error: No puede ponerse en pausa en estado 'Pending'");
	}
	
	public Duration calcularTiempoTranscurrido(Clock horaInicio) {
		throw new RuntimeException("Error: la tarea no fue iniciada aun");
	}
}
