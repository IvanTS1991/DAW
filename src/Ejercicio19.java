package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
//		Realiza un programa que sea capaz de insertar un n�mero en una posici�n
//		concreta de un array. En primer lugar, el programa generar� un array de 12
//		n�meros enteros aleatorios entre 0 y 200 ambos incluidos. A continuaci�n se
//		debe mostrar el contenido de ese array junto al �ndice (0 � 11). Seguidamente
//		el programa preguntar� por el n�mero que se quiere insertar y por la posici�n
//		donde ser� insertado. Los n�meros del array se desplazan a la derecha para
//		dejar sitio al nuevo. El �ltimo n�mero (el que se encuentra en la posici�n 11)
//		siempre se perder�.
		
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
