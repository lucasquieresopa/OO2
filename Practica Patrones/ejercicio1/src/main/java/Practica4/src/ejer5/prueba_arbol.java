package ejer5;

import tp04.ejercicio1.ArbolGeneral;

public class prueba_arbol {

	public static void main(String[]args) {
	/*	
	 	//PRUEBA 1
		ArbolGeneral<AreaEmpresa> nodo1 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(14));
		ArbolGeneral<AreaEmpresa> nodo2 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(13));
		ArbolGeneral<AreaEmpresa> nodo3 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(25));
		ArbolGeneral<AreaEmpresa> nodo4 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(10));
		ArbolGeneral<AreaEmpresa> nodo5 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(4));
		ArbolGeneral<AreaEmpresa> nodo6 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(7));
		ArbolGeneral<AreaEmpresa> nodo7 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(5));
		ArbolGeneral<AreaEmpresa> nodo8 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(6));
		ArbolGeneral<AreaEmpresa> nodo9 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(10));
		ArbolGeneral<AreaEmpresa> nodo10 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(18));
		ArbolGeneral<AreaEmpresa> nodo11 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(9));
		ArbolGeneral<AreaEmpresa> nodo12 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(12));
		ArbolGeneral<AreaEmpresa> nodo13 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(19));	
		
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
		
		AnalizadorArbol arbol = new AnalizadorArbol();
		System.out.println(arbol.devolverMaximoPromedio(nodo1));
		
		
		//PRUEBA 2
		ArbolGeneral<AreaEmpresa> nodo1 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(14));
		ArbolGeneral<AreaEmpresa> nodo2 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(13));
		ArbolGeneral<AreaEmpresa> nodo3 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(25));
		ArbolGeneral<AreaEmpresa> nodo4 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(10));
		ArbolGeneral<AreaEmpresa> nodo5 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(12));
		ArbolGeneral<AreaEmpresa> nodo6 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(7));
		ArbolGeneral<AreaEmpresa> nodo7 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(5));
		ArbolGeneral<AreaEmpresa> nodo8 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(6));
		ArbolGeneral<AreaEmpresa> nodo9 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(10));
		ArbolGeneral<AreaEmpresa> nodo10 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(18));
		ArbolGeneral<AreaEmpresa> nodo11 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(9));
		ArbolGeneral<AreaEmpresa> nodo12 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(12));
		ArbolGeneral<AreaEmpresa> nodo13 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(19));	
		
		nodo1.agregarHijo(nodo2);
		nodo2.agregarHijo(nodo5);
	
		
		AnalizadorArbol arbol = new AnalizadorArbol();
		System.out.println(arbol.devolverMaximoPromedio(nodo1));
	*/	
		ArbolGeneral<AreaEmpresa> nodo1 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(2));
		ArbolGeneral<AreaEmpresa> nodo2 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(4));
		ArbolGeneral<AreaEmpresa> nodo3 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(7));
		ArbolGeneral<AreaEmpresa> nodo4 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(6));
		ArbolGeneral<AreaEmpresa> nodo5 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(3));
		ArbolGeneral<AreaEmpresa> nodo6 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(1));
		ArbolGeneral<AreaEmpresa> nodo7 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(4));
		ArbolGeneral<AreaEmpresa> nodo8 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(1));
		ArbolGeneral<AreaEmpresa> nodo9 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(2));
		ArbolGeneral<AreaEmpresa> nodo10 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(2));
		ArbolGeneral<AreaEmpresa> nodo11 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa(20));
	
		nodo1.agregarHijo(nodo2);
		nodo1.agregarHijo(nodo3);
		nodo1.agregarHijo(nodo4);
		nodo2.agregarHijo(nodo5);
		nodo2.agregarHijo(nodo6);
		nodo2.agregarHijo(nodo7);
		nodo3.agregarHijo(nodo8);
		nodo3.agregarHijo(nodo9);
		nodo5.agregarHijo(nodo10);
		nodo9.agregarHijo(nodo11);
		
		
		AnalizadorArbol arbol = new AnalizadorArbol();
		System.out.println(arbol.devolverMaximoPromedio(nodo1));
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
