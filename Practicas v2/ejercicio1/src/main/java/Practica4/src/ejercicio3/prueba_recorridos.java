package ejercicio3;

import tp02.ejercicio2.*;
import tp04.ejercicio1.ArbolGeneral;

public class prueba_recorridos {

	public static void main (String[]args) {
		
		//carga de arbol
		
		ArbolGeneral<Integer> nodo1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> nodo2 = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> nodo3 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> nodo4 = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> nodo5 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> nodo6 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> nodo7 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> nodo8 = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> nodo9 = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> nodo10 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> nodo11 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> nodo12 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> nodo13 = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> nodo14 = new ArbolGeneral<Integer>(17);
		ArbolGeneral<Integer> nodo15 = new ArbolGeneral<Integer>(23);

		nodo1.agregarHijo(nodo2);
		nodo1.agregarHijo(nodo3);
		nodo1.agregarHijo(nodo4);
		nodo2.agregarHijo(nodo5);
		nodo2.agregarHijo(nodo6);
		nodo2.agregarHijo(nodo7);
		nodo3.agregarHijo(nodo8);
		nodo3.agregarHijo(nodo9);
		nodo3.agregarHijo(nodo10);
		nodo4.agregarHijo(nodo11);
		nodo4.agregarHijo(nodo12);
		nodo4.agregarHijo(nodo13);
		nodo10.agregarHijo(nodo14);
		nodo14.agregarHijo(nodo15);

		RecorridosAG recorrido = new RecorridosAG();
		//System.out.println(recorrido.numerosImparesMayoresQuePreOrden(nodo1, 0));

		//System.out.println(recorrido.numerosImparesMayoresQuePostOrden(nodo1, 0));

		//System.out.println(recorrido.numerosImparesMayoresQueInOrden(nodo1,0));

		//System.out.println(recorrido.numerosImparesMayoresQuePorNiveles(nodo1, 0));
		
		//System.out.println(recorrido.caminoHojaMasLejana(nodo1));
		
		//System.out.println(nodo1.altura());
		
		Integer nro = 4;
		System.out.println(nodo1.nivel2(nro));
		
		System.out.println(nodo1.ancho());
	}
	
}
