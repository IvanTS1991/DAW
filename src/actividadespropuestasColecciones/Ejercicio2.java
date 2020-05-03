package actividadespropuestasColecciones;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		LinkedList<String> nombres = new LinkedList<String>();
		
		for (int i = 0; i<5 ; i++) {
			String nom = JOptionPane.showInputDialog("Introduce un nombre ");
			nombres.add(nom);
			}

		try {
			
			System.out.println(nombres.get((int) (Math.random()*nombres.size())) + " elemento random dentro de rango");
			
		} catch(Exception e) {
			
			System.out.println("Excepcion de " + e.getMessage() + " fuera de rango");
		}
		
		System.out.println(nombres.size() +" es el tamaño de la lista");
		System.out.println(nombres.getFirst() + " elemento de la primera posicion") ;
		System.out.println(nombres.getLast()+ " elemento de la ultima posicion\n");
		
		System.out.println("Lista recorrida con bucle for\n");
		for (String s : nombres) {
			System.out.println(s);
		}
		
		System.out.println("\nLista recorrida por medio de un iterador\n");
		Iterator<String> it = nombres.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nLista recorrida de final a principio con for\n");
		
		for (int i = nombres.size()-1; i>=0; i--) {
			System.out.println(nombres.get(i));
		}
		
		System.out.println("\nLista recorrida de final a principio con iterador\n");
		ListIterator<String> itl = nombres.listIterator(nombres.size());
		
		while(itl.hasPrevious()) {
			System.out.println(itl.previous());
		}
		
		System.out.println("\nLista recorrida con for-each\n");
		
		nombres.forEach((f)-> System.out.println(f));

		
		System.out.println("\nLista recorrida de final a principio con for-each");
		
		nombres.descendingIterator().forEachRemaining((f)-> System.out.println(f)); 
		
		
		
	}

}
