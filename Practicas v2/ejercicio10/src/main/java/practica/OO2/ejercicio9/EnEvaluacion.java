package practica.OO2.ejercicio9;

public class EnEvaluacion extends Etapa{

	public void aprobarEtapa(Proyecto pr) {
		pr.setEtapa(new Confirmada());
	}
	
	public void modificarMargenDeGanancia(Proyecto pr, double nuevoMargen) {
		if((nuevoMargen > 11.0) && (nuevoMargen < 15.0)) {
			pr.setMargenDeGanancia(nuevoMargen);
		}
	}
}
