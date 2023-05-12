package practica.OO2.ejercicio7;

import java.time.Clock;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class State {

	private List<String> comentarios;
	
	public State() {
		this.comentarios = new ArrayList<String>();
	}
	
	public void switchToInProgress(ToDoItem tdi) {
		throw new RuntimeException("Error: no puede cambiarse a ese estado");
	}
	
	public void switchToPause(ToDoItem tdi) {
		throw new RuntimeException("Error: no puede cambiarse a ese estado");
	}
	
	public void switchToFinished(ToDoItem tdi) {
		throw new RuntimeException("Error: no puede cambiarse a ese estado");
	}
	
	public abstract Duration calcularTiempoTranscurrido(Clock horaInicio);
	
	public void agregarComentario(String comentario) {
		this.comentarios.add(comentario);
	}
	
	public List<String> getComments(){
		return this.comentarios;
	}
}
