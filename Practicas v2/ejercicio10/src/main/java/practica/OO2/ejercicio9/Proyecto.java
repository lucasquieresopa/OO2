package practica.OO2.ejercicio9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double margenDeGanancia;
	private int numeroDeIntegrantes;
	private double pagoPorDiaPorIntegrante;
	private Etapa etapa;
	
	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo,
			int numeroDeIntegrantes, double pagoPorDiaPorIntegrante) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margenDeGanancia = 7.0;
		this.numeroDeIntegrantes = numeroDeIntegrantes;
		this.pagoPorDiaPorIntegrante = pagoPorDiaPorIntegrante;
		this.etapa = new EnConstruccion();
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa(this);
	}
	
	public double getCostoDeProyecto() {
		return this.numeroDeIntegrantes * this.pagoPorDiaPorIntegrante * 
				ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}
	
	public void setEtapa(Etapa nuevaEtapa) {
		this.etapa = nuevaEtapa;
	}
	
	public double precioDelProyecto() {
		return getCostoDeProyecto() * traducirMargenDeGanancia();
	}
	
	public void modificarMargenDeGanancia(double nuevoMargen) {
		this.etapa.modificarMargenDeGanancia(this, nuevoMargen);
	}
	
	public void setMargenDeGanancia(double nuevoMargen) {
		this.margenDeGanancia = nuevoMargen;
	}
	
	public double traducirMargenDeGanancia() {
		return 1 + this.margenDeGanancia * 0.01;
	}
	
	public void cancelarProyecto() {
		if(this.objetivo != "Cancelado") {
			this.etapa.cancelarProyecto(this);
		}
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
}
