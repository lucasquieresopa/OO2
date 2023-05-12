package ejer5;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class AnalizadorArbol {

	public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa> arbol) {
		//a) devolver promedio utiliza recorrido por niveles con implementacion
		//de una cola para recorrer un nivel y comparar el promedio con el anterior.
		
		int max_prom = 0;
		int suma = 0;
		int prom_act = 0;
		int cant_nodos = 0;
		ArbolGeneral<AreaEmpresa> dato_desencolado;
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		if(!arbol.esVacio()) {
			cola.encolar(arbol);
			cola.encolar(null);
		}
		while(!cola.esVacia()) {
			dato_desencolado = cola.desencolar();
			if(dato_desencolado != null) {
				suma = suma + dato_desencolado.getDato().getRetardo();
				cant_nodos++;
				ListaGenerica<ArbolGeneral<AreaEmpresa>> lista_hijos = dato_desencolado.getHijos();
				lista_hijos.comenzar();
				while(!lista_hijos.fin()) {
					cola.encolar(lista_hijos.proximo());
				}
			}
			else {
				//si entra aca es cambio de nivel
				if(cant_nodos != 0) {
					prom_act = suma/cant_nodos;
					if(prom_act > max_prom) {
						max_prom = prom_act;
					}
					suma = 0;
					cant_nodos = 0;
					cola.encolar(null);
				}
			}	
		}
		return max_prom;
	}
	
}
