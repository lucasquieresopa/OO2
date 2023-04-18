package practica.OO2.ejercicio8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Estado estado;
	private List<Usuario> usuariosInscriptos;

	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
			String puntoEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado = new Provisoria();
		this.usuariosInscriptos = new ArrayList<Usuario>();
	}
	
	public void inscribir(Usuario usuario) {
		this.estado.inscribir(this, usuario);
	}
	
	public int getCupoActual() {
		return this.usuariosInscriptos.size();
	}
	
	public int getCupoMinimo() {
		return this.cupoMinimo;
	}
	
	public int getCupoMaximo() {
		return this.cupoMaximo;
	}
	
	public void cambiarEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public void agregarUsuario(Usuario usuario) {
		this.usuariosInscriptos.add(usuario);
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}
	
	public int getFaltantesParaCupoMinimo() {
		return this.cupoMinimo - getCupoActual();
	}
	
	public int getFaltantesParaCupoMaximo() {
		return this.cupoMaximo - getCupoActual();
	}
	
	public List<String> getMailsDeUsuarios(){
		return this.usuariosInscriptos.stream()
				.map(usuario -> usuario.getMail())
				.collect(Collectors.toList());
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}
}
