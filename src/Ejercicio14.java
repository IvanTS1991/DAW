package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
//		Escribe un programa que pida 8 palabras y las almacene en un array. A
//		continuación, las palabras correspondientes a colores se deben almacenar al
//		comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
//		auxiliares como quieras. Los colores que conoce el programa deben estar en
//		otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
//		blanco y morado.

		Scanner scn = new Scanner(System.in);	
		
		String[] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		String[] palabra = new String[8];
		String[] resultado = new String[8];
			
		System.out.println("Introduzca 8 palabras: ");
		
		int n = 0;
		
			for(int i = 0; i < 8; i++) {
				palabra[i] = scn.next();
				
				
		// Si la palabra ES UN COLOR , la guarda al principio del array
			
			for(String c : color) {
				if(palabra[i].equals(c)) {
					resultado[n++] = c;
				}
			}
		}
			
		// Si la palabra NO ES UN COLOR , la guarda al final del array
			
			for(int i = 0; i < 8; i++) {
				boolean esColor = false;
				
				for(String c : color) {
					if(palabra[i].equals(c)) {
						esColor = true;
					}
				}
				
				if(!esColor) {
					resultado[n++] = palabra[i];
				}
			}
			
		// Imprime el array original
			
			System.out.println("\n\nArray original:");
			System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
				for (int i = 0; i < 8; i++) {
					System.out.printf("│   %d    ", i);
			    }
			    	System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

			    for (String p : palabra) {
			    	System.out.printf("│%-8s", p);
			    }
			    	System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");

		// Muestra el array resultado.
			    
		   System.out.println("\n\nArray resultado:");
		   System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
			    for (int i = 0; i < 8; i++) {
			    	System.out.printf("│   %d    ", i);
			    }
			    	System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

			    for (String r : resultado) {
			      System.out.printf("│%-8s", r);
			    }
			    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
		}
	}


