package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
//		Realiza un programa que sea capaz de insertar un número en una posición
//		concreta de un array. En primer lugar, el programa generará un array de 12
//		números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
//		debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
//		el programa preguntará por el número que se quiere insertar y por la posición
//		donde será insertado. Los números del array se desplazan a la derecha para
//		dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
//		siempre se perderá.
		
			Scanner scn = new Scanner(System.in);
			
			
		// Creamos el array aleatorio
			
			int[] n = new int[12];
			
			for(int i = 0; i < 12; i++) {
				n[i] = (int)(Math.random() * 201);
			}
			
			
		// Muestra el arrray original
			
			System.out.println("Array original: ");
			System.out.print("\nIndice ");
			
			for(int i = 0; i < 12; i++ ) {
				System.out.printf("%4d ", i);
			}
			
			System.out.print("\nValor");
			
			for(int i = 0; i < 12; i++) {
				System.out.printf("%4d ", n[i]);
			}
			
			
		// Pide el numero y la posicion donde colocarlo
			
			System.out.print("\n\nIntroduzca el numero que quieras: ");
			int numero = scn.nextInt();
			
			System.out.print("\n\nIntroduzca la posicion donde lo quieres almacenar: ");
			int posicion = scn.nextInt();
			
		
		// Inserta el numero y desplaza el resto hacia la derecha
			
			for(int i= 11; i > posicion; i--) {
				n[i] = n[i - 1];
			}
			
			n[posicion] = numero;
			
		
		// Imprime el resultado
			System.out.println("\nArray: ");
			System.out.print("\nIndice");
			
				for(int i = 0; i < 12; i++) {
					System.out.printf("%4d ", i);
				}
				
				System.out.print("\nValor  ");
				
				for(int i = 0; i < 12; i++) {
					System.out.printf("%4d ", n[i]);
				}
			
	}

}
