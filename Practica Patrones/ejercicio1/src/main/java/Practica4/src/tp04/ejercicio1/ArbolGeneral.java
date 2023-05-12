package tp04.ejercicio1;

import ejer4.Numerica;
import ejer6.Ancestro;
import ejercicio3.RecorridosAG;
import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
		//devuelve el dato (tipo T) almacenado en un nodo(tipo ArbolGeneral)
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		//si la lista de hijos recibida es vacia, crea una lista(vacia) y la asigna como variable de clase "hijos"(
		else
			this.hijos = hijos;
		//si la lista recibida tiene elementos, asigna la lista como variable de clase "hijos"
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
		//constructor solo raiz
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
		//constructor de raiz + hijos (la asignacion de los hijos es igual a setHijos())
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
		//devuelve una lista proveniente de la variable de clase "hijos"
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
		//agrega un elemento (tipo ArbolGeneral<T>)al final de la lista de hijos
	}

	public boolean esHoja() {

		return !this.tieneHijos();
		//es hoja si no tiene hijos, pero si tiene dato
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
		//tiene hijos si la var de clase hijos no esta vacia
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
		//es vacio si no tiene hijos ni datos
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	

	private int[] altura_(ArbolGeneral<T> arbol, int[]vector_altura) {
		/*para hallar la altura se debe hacer un recorrido preorden
		 * en el que se incremente la var altura_actual hasta llegar
		 * a una hoja, que sera cuando se compare con altura_maxima
		 */
		
		vector_altura[1]++;
		//se incrementa aca porque es preOrden
		if(arbol.esHoja()) {
			//si es hoja comparo y actualizo
			if(vector_altura[1] > vector_altura[0]) {
				vector_altura[0] = vector_altura[1];
			}
		}
		else {
			//si no es hoja, tomo sus hijos y llamo recursivamente
			ListaGenerica<ArbolGeneral<T>> lista_hijos = arbol.getHijos();
			lista_hijos.comenzar();
			while(!lista_hijos.fin()) {
				altura_(lista_hijos.proximo(), vector_altura);
				vector_altura[1] --;
			}
		}
			
		return vector_altura;
	}
	public int altura() {
		int[] vector_altura = new int[2];
		vector_altura[0]=0;
		vector_altura[1]=0;
		//vector altura: [0]: altura max, [1]: altura act
		//puede implementarse con una nueva clase "alturas", la cual contendrias
		//dos variables de instancia, max y act, las cuales tendrian
		//setters y getters para alterar la info.
		if(!this.esVacio()) {
			 altura_(this, vector_altura);
		}
		return vector_altura[0];
	}

	private Numerica nivel_(ArbolGeneral<T> arbol, Numerica altura_actual, T dato, boolean encontre) {
		/* nivel lo que hace es recorrer en preOrden hasta hallar el
		 * valor buscado (cuando lo encuentra finaliza) mientras maneja
		 * una variable con la altura actual
		 * Devuelve la altura.
		 */
		if((!arbol.getDato().equals(dato))&&(altura_actual.getEncontre()==false)) {
			altura_actual.setAltura_actual(altura_actual.getAltura_actual()+1);
			//altura++;
			//System.out.println(altura_actual.getAltura_actual());
			
			ListaGenerica<ArbolGeneral<T>> lista_hijos = arbol.getHijos();
			lista_hijos.comenzar();
			while(!lista_hijos.fin()) {
				nivel_(lista_hijos.proximo(), altura_actual, dato, encontre);
				if(altura_actual.getEncontre()==false)
					altura_actual.setAltura_actual(altura_actual.getAltura_actual()-1);
				else
					altura_actual.setAltura_actual(altura_actual.getAltura_actual()+1);
			}
		}
		else
			altura_actual.setEncontre(true);

		return altura_actual;
	}
	public int nivel(T dato) {
		
		Numerica altura_actual = new Numerica();
		if(!this.esVacio()) {
			nivel_(this, altura_actual,dato, false);
		}
		return altura_actual.getAltura_actual();
		
	}
	
	
	
	public int nivel2(T dato) {
		int nivel = -1;  // no esta
		if (!this.esVacio()) {
			if (this.getDato().equals(dato)) {
				nivel = 0;
			}
			else {
				ListaGenerica<ArbolGeneral<T>> listaHijos = this.getHijos();
				listaHijos.comenzar();
				while(!listaHijos.fin() && nivel == -1) {
					nivel = listaHijos.proximo().nivel2(dato);
				}
				if (nivel > -1) {
					nivel ++;
				}
			}
		}
		return nivel;
	}

	
	
	public int ancho() {
		int cant_max = 0;
		int cant_act = 0;
		ArbolGeneral<T> arbol_desencolado;
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		//debo usar nulls para determinar fin de nivel
		if(!this.esVacio()) {
			cola.encolar(this);
			cola.encolar(null);
		}
		while(!cola.esVacia()) {
			arbol_desencolado = cola.desencolar(); //linea problematica
			if(arbol_desencolado != null) {
				cant_act++;
				ListaGenerica<ArbolGeneral<T>> lista_hijos = arbol_desencolado.getHijos();
				lista_hijos.comenzar();
				while(!lista_hijos.fin()) {
					cola.encolar(lista_hijos.proximo());
				}
			}
			else {
				if(cant_act > cant_max) {
					cant_max = cant_act;
				}
				cant_act = 0;
				if (!cola.esVacia()) {
					cola.encolar(null);
				}
			}
		}
		return cant_max;
		

	}
	
	private boolean esAncestro_(T a, T b, Ancestro anc, ArbolGeneral<T> arbol) {
		/*mi solucion consiste en buscar el elemento 'a' en el arbol (en preOrden), y una vez hallado
		 *usarlo como raiz, asi solo buscar 'b' entre los descendientes de 'a'
		 */
		if(arbol.getDato() == a) {
			anc.setEncontre(true);
		}
		if((anc.isEncontre() == true) && (arbol.getDato() == b)) {
				anc.setHayCamino(true);
		}
		//busqueda total
		if(!anc.isEncontre()) {
			ListaGenerica<ArbolGeneral<T>> lista_hijos = arbol.getHijos();
			lista_hijos.comenzar();
			while(!lista_hijos.fin() && !anc.isEncontre()) {
				esAncestro_(a, b, anc, lista_hijos.proximo());
		
			}
		}
		//busqueda de los descendientes de a
		else {
			ListaGenerica<ArbolGeneral<T>> lista_hijos_a = arbol.getHijos();
			lista_hijos_a.comenzar();
			while(!lista_hijos_a.fin() && !anc.isHayCamino()) {
				esAncestro_(a, b, anc, lista_hijos_a.proximo());
			}
		}
		return anc.isHayCamino();
	}
	
	public Boolean esAncestro(T a, T b) {
		//asumo que ningun elemento del arbol es igual al otro
		Ancestro anc = new Ancestro();
		boolean hayCamino = esAncestro_(a, b, anc, this);
		return hayCamino;
	}
	
	
}