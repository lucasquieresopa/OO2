package ejer7;

import tp04.ejercicio1.ArbolGeneral;

public class prueba_ej7 {
	
	public static void main(String[]args) {
		
		ArbolGeneral<Integer> nodoA = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoB = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoC = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoD = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoE = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoF = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoG = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoH = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoI = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoJ = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoK = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoL = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoM = new ArbolGeneral<Integer>(null);
		ArbolGeneral<Integer> nodoN = new ArbolGeneral<Integer>(null);
		
		nodoA.agregarHijo(nodoB);
		nodoA.agregarHijo(nodoC);
		nodoA.agregarHijo(nodoD);
		nodoA.agregarHijo(nodoE);
		nodoC.agregarHijo(nodoF);
		nodoC.agregarHijo(nodoG);
		nodoG.agregarHijo(nodoL);
		nodoD.agregarHijo(nodoH);
		nodoD.agregarHijo(nodoI);
		nodoD.agregarHijo(nodoJ);
		nodoD.agregarHijo(nodoK);
		nodoJ.agregarHijo(nodoM);
		nodoJ.agregarHijo(nodoN);
		
		RedAguaPotable red = new RedAguaPotable();
		red.setArbol(nodoA);
		System.out.println(red.minimoCaudal(1000));
		
		
		
	}
}
