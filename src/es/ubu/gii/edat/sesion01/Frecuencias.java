/**
 * @author Diego Urbaneja portal
 * @Version:1.0 
 */


package es.ubu.gii.edat.sesion01;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Frecuencias {
	
	public static <E> int frecuencia(Collection<E> coleccion, Object o, boolean usarEquals) {
		Iterator<E> iterador = coleccion.iterator();
		int contador = 0;
		while (iterador.hasNext()) {
			 if (usarEquals) {
				 if (iterador.equals(o)) {
					 contador++;
				 }
			 }else {
				 if (iterador == o) {
					 contador ++; 
				 }
			 }
		 }
		 return contador;
	}
	
	public static <E> E menosFrecuente(Collection <E> coleccion , boolean usarEquals ) {
		int contMin = coleccion.size();
		E menosF = null;
		Iterator<E> iterador = coleccion.iterator();
		while (iterador.hasNext()) {
			if (coleccion.isEmpty()) 
				throw new NoSuchElementException();
			if (frecuencia(coleccion, iterador, usarEquals) < contMin){
				menosF =  (E) iterador;
				contMin = frecuencia(coleccion, iterador, usarEquals);
			}
		}
		return menosF;
	}
}
 