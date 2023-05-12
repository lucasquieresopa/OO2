package practica.OO2.ejercicio9;

public abstract class Etapa {

	public abstract void aprobarEtapa(Proyecto pr);

	public abstract void modificarMargenDeGanancia(Proyecto pr, double nuevoMargen);

	
	public void cancelarProyecto(Proyecto pr) {
		pr.setObjetivo("Cancelado");
	}
}
