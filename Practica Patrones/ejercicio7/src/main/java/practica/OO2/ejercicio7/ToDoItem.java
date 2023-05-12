package practica.OO2.ejercicio7;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ToDoItem {

		private State state;
		private String name;
		private Clock horaInicio;
		
		public ToDoItem(String name) {
			//Instancia un ToDoItem nuevo en estado pending con <name> como nombre
			this.state = new Pending(); 
			this.name = name;
		}
		
		protected void setState(State newState) {
			this.state = newState;
		}

		public void start() {
//			Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
//			pending, si se encuentra en otro estado, no hace nada)
			this.state.switchToInProgress(this);
		}

		public void togglePause() {
//			Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
//			estado es paused. Caso contrario (pending o finished) genera un error
//			informando la causa específica del mismo
			this.state.switchToPause(this);
		}

		public void finish() {
//			Pasa el ToDoItem a finished (siempre y cuando su estado actual sea
//			in-progress o pausada, si se encuentra en otro estado, no hace nada)
			this.state.switchToFinished(this);
		}
		
		public Duration workedTime() {

//		Retorna el tiempo que transcurrió desde que se inició la tarea (start)
//		hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
//		haya transcurrido hasta el momento actual. Si la tarea no se inició,
//		se genera un error informando la causa específica del mismo.
			return this.state.calcularTiempoTranscurrido(this.horaInicio);

			
		}
		
		public void addComment(String comment) {
//			Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
//			contrario no hace nada."
			this.state.agregarComentario(comment);
		}
		
		protected void startTimer() {
			this.horaInicio = Clock.systemUTC();

		}
		
		public State getState() {
			return this.state;
		}
		
		public List<String> getComments(){
			return this.state.getComments();
		}
		
		public Clock getHoraInicio() {
			return this.horaInicio;
		}

}
