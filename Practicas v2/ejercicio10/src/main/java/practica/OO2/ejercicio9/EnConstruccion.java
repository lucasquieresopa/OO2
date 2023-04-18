package practica.OO2.ejercicio9;

public class EnConstruccion extends Etapa{

	public void aprobarEtapa(Proyecto pr) {
		if(pr.getCostoDeProyecto() == 0) {
			throw new RuntimeException("El precio del proyecto no puede ser 0");
		}
		else {
			pr.setEtapa(new EnEvaluacion());
		}
	}
	
	public void modificarMargenDeGanancia(Proyecto pr, double nuevoMargen) {
		if((nuevoMargen > 7.0) && (nuevoMargen < 10.0)) {
			pr.setMargenDeGanancia(nuevoMargen);
		}
	}
	
	
	
}
