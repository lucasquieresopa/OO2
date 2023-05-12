package practica.OO2.ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Clock;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestToDoItem {

	private ToDoItem tdi;
	private Scanner in; 
	private State pending, inProgress, paused, finished;
	
	@BeforeEach
	public void setUp() {
		this.tdi = new ToDoItem("juan");
		this.in = new Scanner(System.in);
		
		this.pending = new Pending();
		this.inProgress = new InProgress();
		this.paused = new Paused();
		this.finished = new Finished();
	}
	
	@Test
	public void testEstadoPending() {
		assertTrue(tdi.getState().getClass().equals(pending.getClass()));
		this.tdi.addComment("Pending");
		assertEquals("[Pending]", tdi.getComments().toString());
		
	}
	
	@Test
	public void testEstadoInProgress() {
		this.tdi.start();
		assertTrue(tdi.getState().getClass().equals(inProgress.getClass()));
		System.out.println(this.tdi.workedTime().getSeconds());
		this.tdi.addComment("En progreso");
		assertEquals("[En progreso]", tdi.getComments().toString());
		//assertTrue(this.tdi.workedTime().getSeconds() > 0);
		
		this.tdi.togglePause();
		assertTrue(tdi.getState().getClass().equals(paused.getClass()));
		System.out.println(this.tdi.workedTime().getSeconds());
		this.tdi.addComment("En pausa");
		assertEquals("[En pausa]", tdi.getComments().toString());
		
		this.tdi.togglePause();
		assertTrue(tdi.getState().getClass().equals(inProgress.getClass()));
		System.out.println(this.tdi.workedTime().getSeconds());
	}
	
	@Test
	public void testEstadoFinish1() {
		this.tdi.start();
		assertTrue(tdi.getState().getClass().equals(inProgress.getClass()));
		this.tdi.finish();
		assertTrue(tdi.getState().getClass().equals(finished.getClass()));
	}
	
	@Test
	public void testEstadoFinish2() {
		this.tdi.start();
		this.tdi.togglePause();
		assertTrue(tdi.getState().getClass().equals(paused.getClass()));
		this.tdi.finish();
		assertTrue(tdi.getState().getClass().equals(finished.getClass()));

	}
	
//	@Test
//	public void testClock() {
//		this.tdi.start();
//		System.out.println(this.tdi.getState().calcularTiempoTranscurrido(this.tdi.getHoraInicio()).getSeconds());
//		System.out.println(this.tdi.getState().calcularTiempoTranscurrido(this.tdi.getHoraInicio()));
//	}
}
