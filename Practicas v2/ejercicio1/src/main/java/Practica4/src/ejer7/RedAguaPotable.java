package ejer7;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedAguaPotable {

	private ArbolGeneral<Integer> arbol;
	
	public void setArbol(ArbolGeneral<Integer> arbol) {
		//constructor del arbol
		this.arbol = arbol;
	}

	private void minimoCaudal_(Caudal c, int cant_nodos, double caudal_actual, ArbolGeneral<Integer> a) {
		ListaGenerica<ArbolGeneral<Integer>> lista_hijos = a.getHijos();
		cant_nodos = lista_hijos.tamanio();
		if(cant_nodos != 0) {
			caudal_actual = caudal_actual / cant_nodos;
		
			if(c.getCaudal_min() > caudal_actual) {
				c.setCaudal_min(caudal_actual);
			}
		}
		lista_hijos.comenzar();
		while(!lista_hijos.fin()) {
			minimoCaudal_(c, 0, caudal_actual, lista_hijos.proximo());
		}
	}
	
	public double minimoCaudal(double caudal) {
		//preOrden
		Caudal c = new Caudal();
		c.setCaudal_entrada(caudal);
		minimoCaudal_(c, 0, caudal, this.arbol);
		
		return c.getCaudal_min();
	}
}
