package ejercicio3;

import tp02.ejercicio2.*;
import tp04.ejercicio1.ArbolGeneral;

/* esta clase surge a partir de un error en la practica que pide que se utilicen valores
 * tipo Integer, sin embargo los arboles son de tipo T. Las dos soluciones son 
 * parsear a Integer esos datos T dentro de la clase ArbolGeneral, o crear una 
 * nueva clase que realice esos metodos pedidos y use un metodo de instancia tipo ArbolGeneral<Integer>
 */

public class RecorridosAG {

	public RecorridosAG() {
		
	}
	
	private ListaGenerica<Integer> preOrden_ (ArbolGeneral<Integer> a, ListaGenerica<Integer> recorrido) {
		recorrido.agregarFinal(a.getDato());
		ListaGenerica<ArbolGeneral<Integer>> lista_hijos = a.getHijos();
		lista_hijos.comenzar();
		while(!lista_hijos.fin()) {
			preOrden_(lista_hijos.proximo(), recorrido);
		}
		return recorrido;
	}
	public ListaGenerica<Integer> preOrden(ArbolGeneral<Integer> a) {
		
		ListaGenerica<Integer> recorrido = new ListaEnlazadaGenerica<Integer>();
		this.preOrden_(a, recorrido);
		return recorrido;
	}
	
	
	private ListaGenerica<Integer> postOrden_(ArbolGeneral<Integer> a, ListaGenerica<Integer> recorrido) {

		ListaGenerica<ArbolGeneral<Integer>> lista_hijos = a.getHijos();
		lista_hijos.comenzar();
		while(!lista_hijos.fin()) {
			postOrden_(lista_hijos.proximo(), recorrido);
		}
		recorrido.agregarFinal(a.getDato());
		return recorrido;
		/* se toma el valor de los hijos (lista)
		 * mientras la lista no llegue al final, se va a llamar con el hijo, y se va
		 * a pasar el puntero al sig. Se toma sucesivamente la lista de hijos hasta que esta
		 * sea vacia. Entonces se guarda el valor del padre. y se regresa
		 * Cuando se regresa, se hace al hd del padre, el cual vuelve a repetir el proceso:
		 * se profundiza hasta hallar la lista de hijos vacia, entonces se guarda el valor del padre
		 * y asi hasta que la lista de padres llegue al final.
		 * Una vez llegue al final, se regresa al hd del padre del padre y asi sucesivamente
		 * 
		 */
	}
	public ListaGenerica<Integer> postOrden(ArbolGeneral<Integer> a) {
		ListaGenerica<Integer> recorrido = new ListaEnlazadaGenerica<Integer>();
		this.postOrden_(a, recorrido);
		return recorrido;
	}
	
	
	private ListaGenerica<Integer> inOrden_ (ArbolGeneral<Integer> a, ListaGenerica<Integer> recorrido) {
		ListaGenerica<ArbolGeneral<Integer>> lista_hijos = a.getHijos();
		lista_hijos.comenzar();
		if(!lista_hijos.fin()) {
			inOrden_(lista_hijos.proximo(),recorrido);
		}
		recorrido.agregarFinal(a.getDato()); 
		
		while(!lista_hijos.fin()) {
			preOrden_(lista_hijos.proximo(), recorrido);
		}
		/*toma la lista de hijos y si no esta vacia, llama con el mismo (y pasa el puntero al sig)
		desciende hasta los hijos de una hoja, por lo que esos hijos (lista) esta vacia.
		Cuando esa lista esta vacia, pasa a tomar el valor del padre de esos hijos.
		Siempre toma el valor del padre.
		Como no tiene hijos, no entra al while, y vuelve al padre del padre, el cual tiene
		el puntero en el hd del padre, por lo que esto se repite y se toman los valores
		hasta que la lista de hermanos termine, por lo que vuelve al padre y se toma el hd de 
		este, y asi sucesivamente.
		*/	
		return recorrido;
	}
	public ListaGenerica<Integer> inOrden(ArbolGeneral<Integer> a) {	
		ListaGenerica<Integer> recorrido = new ListaEnlazadaGenerica<Integer>();
		this.inOrden_(a, recorrido);
		return recorrido;
	}
	

	public ListaGenerica<Integer> porNiveles(ArbolGeneral<Integer> a){
		ListaGenerica<Integer> recorrido = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		cola.encolar(a);
		ArbolGeneral<Integer> arbol_desencolado;
		while(!cola.esVacia()) {
			arbol_desencolado = cola.desencolar();
			if(arbol_desencolado.getDato() != null) {
				recorrido.agregarFinal(arbol_desencolado.getDato());
				ListaGenerica<ArbolGeneral<Integer>> lista_hijos = arbol_desencolado.getHijos();
				while(!lista_hijos.fin()) {
					cola.encolar(lista_hijos.proximo());
				}
			}
		}

		return recorrido;
	}

	
	
	private ListaGenerica<Integer> numerosImparesMayoresQuePreOrden_(ArbolGeneral<Integer> a,
					Integer n, ListaGenerica<Integer> impares_inOrden){
		
		Integer dato = a.getDato();
		if((dato > n) && (dato % 2 != 0)){
			impares_inOrden.agregarFinal(dato);
		}
		ListaGenerica<ArbolGeneral<Integer>> lista_hijos = a.getHijos();
		lista_hijos.comenzar();
		while(!lista_hijos.fin()) {
			numerosImparesMayoresQuePreOrden_(lista_hijos.proximo(), n, impares_inOrden);
		}
		return impares_inOrden;
	}
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral <Integer> a, Integer n) {

		ListaGenerica<Integer> impares_inOrden = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePreOrden_(a, n, impares_inOrden);
		return impares_inOrden;
	}

	
	private ListaGenerica<Integer> numerosImparesMayoresQuePostOrden_(ArbolGeneral<Integer> a,
			Integer n, ListaGenerica<Integer> impares_postOrden){
		ListaGenerica<ArbolGeneral<Integer>> lista_hijos = a.getHijos();
		lista_hijos.comenzar();
		while(!lista_hijos.fin()) {
			numerosImparesMayoresQuePostOrden_(lista_hijos.proximo(),n,impares_postOrden);
		}
		Integer dato = a.getDato();
		if((dato > n) && (dato % 2) != 0) {
			impares_postOrden.agregarFinal(dato);
		}
		return impares_postOrden;
	}
	public ListaGenerica< Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral <Integer> a, Integer n){

		ListaGenerica<Integer> impares_postOrden = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePostOrden_(a, n, impares_postOrden);
		return impares_postOrden;
	}

	
	
	private ListaGenerica<Integer> numerosImparesMayoresQueInOrden_(ArbolGeneral<Integer> a,
			Integer n, ListaGenerica<Integer> impares_inOrden){
		ListaGenerica<ArbolGeneral<Integer>> lista_hijos = a.getHijos();
		if(!lista_hijos.fin()) {
			numerosImparesMayoresQueInOrden_(lista_hijos.proximo(), n, impares_inOrden);
		}
		Integer dato = a.getDato();
		if ((dato > n) && (dato % 2) != 0) {
			impares_inOrden.agregarFinal(dato);
		}
		while(!lista_hijos.fin()) {
			numerosImparesMayoresQueInOrden_(lista_hijos.proximo(), n, impares_inOrden);
		}
		return impares_inOrden;
	}
	public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral <Integer> a, Integer n){
		
		ListaGenerica<Integer> impares_inOrden = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQueInOrden_(a, n, impares_inOrden);
		return impares_inOrden;
	}

	
	
	
	
	public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles(ArbolGeneral <Integer> a, Integer n) {

		ListaGenerica<Integer> impares_porNiveles = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		cola.encolar(a);
		
		ArbolGeneral<Integer> arbol_desencolado;
		Integer dato;
		
		while(!cola.esVacia()) {
			arbol_desencolado = cola.desencolar();
			if(arbol_desencolado != null) {
				dato = arbol_desencolado.getDato();
				if((dato > n) && (dato % 2) != 0) {
					impares_porNiveles.agregarFinal(dato);
				}
				ListaGenerica<ArbolGeneral<Integer>> lista_hijos = arbol_desencolado.getHijos();
				while(!lista_hijos.fin()) {
					cola.encolar(lista_hijos.proximo());
				}
			}
		}
		
		
		return impares_porNiveles;
	}

	
	private ListaGenerica<Integer> caminoHojaMasLejana_(ArbolGeneral<Integer> a,
			ListaGenerica<Integer> camMasLargo, ListaGenerica<Integer> camAct){
		camAct.agregarFinal(a.getDato());
		//agrego primero porque es preOrden
		if(a.esHoja()) {
			//si es hoja, chequear si camAct > camMasLargo
			if(camAct.tamanio() > camMasLargo.tamanio()) {
				//si es mas largo, paso los elementos de camAct a camMasLargo
				camMasLargo.comenzar();
				while(!camMasLargo.fin()) {
					camMasLargo.eliminar(camMasLargo.proximo());
					//recorro camMasLargo borrando sus elementos
				}
				camAct.comenzar();
				while(!camAct.fin()) {
					camMasLargo.agregarFinal(camAct.proximo());
					//agrego cada elem de camAct a camMasLargo
				}
			}
		}
		else {
			//si no es hoja, tomar hijos
			ListaGenerica<ArbolGeneral<Integer>> lista_hijos = a.getHijos();
			lista_hijos.comenzar();
			while(!lista_hijos.fin()) {
				caminoHojaMasLejana_(lista_hijos.proximo(), camMasLargo, camAct);
				camAct.eliminarEn(camAct.tamanio());
				//si elimina el ultimo es porque se vuelve de la recursion al padre,
				//por lo tanto ese valor ya no sirve
				//si era el camino mas largo, ya habra sido añadido a camMasLargo.
			}
		}
		
		return camMasLargo;
	}
	
	public ListaGenerica<Integer> caminoHojaMasLejana(ArbolGeneral<Integer> a){
		
		ListaGenerica<Integer> camino_mas_largo = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<Integer> camino_actual = new ListaEnlazadaGenerica<Integer>();
		if (!a.esVacio())
			caminoHojaMasLejana_(a, camino_mas_largo, camino_actual);
		
		return camino_mas_largo;
	}
	
}
