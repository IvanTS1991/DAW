package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
//		Escribe un programa que lea 15 números por teclado y que los almacene en un
//		array. Rota los elementos de ese array, es decir, el elemento de la posición 0
//		debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
//		la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
//		del array
		
		Scanner n = new Scanner(System.in);
		
		int[] numeros = new int[15];
		int i;
		
		System.out.println("Introduce 15 enteros: ");
		
		for (i = 0; i < 15; i++) {
			numeros[i] = n.nextInt();
		}
			System.out.println();
			
		// Muestra el array original
		
		System.out.println(" Array original: ");
		
			for (i = 0; i < 15; i++) {
				System.out.printf("|%3d", i);
			}
				System.out.println("|");
			for ( i = 0; i  < 75; i++) {
				System.out.print("-");
			}
				System.out.println("-");
			for (i = 0; i < 15; i++) {
				System.out.printf("|%3d ", numeros[i]);
			}
				System.out.println("|");
		
				
		// va rotando las posiciones del array ( una a la derecha )
				
			int x = numeros[14];
				for(i = 14; i > 0; i--) {
					numeros[i] = numeros[i-1];
				}
					numeros[0] = x;
					
		// Muestra el array rotado
					
		System.out.println("\nArray rotado a la derecha una posición:");
		
		for (i = 0; i < 15; i++) {
			System.out.printf("|%3d ", i);
		}
		System.out.println("|");
		for (i = 0; i < 75; i++) {
			System.out.print("-");
		}
		System.out.print("-");
		for ( i = 0; i < 15; i++) {
			System.out.printf("|%3d ", numeros[i]);
		}
		System.out.println("|");
	}

}
