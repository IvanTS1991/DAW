package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
//		Escribe un programa que rellene un array de 20 elementos con n�meros enteros
//		aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuaci�n el
//		programa mostrar� el array y preguntar� si el usuario quiere resaltar los
//		m�ltiplos de 5 o los m�ltiplos de 7. Seguidamente se volver� a mostrar el array
//		escribiendo los n�meros que se quieren resaltar entre corchetes.
			
			Scanner scn = new Scanner(System.in);
			
			int[] n = new int[20];
			
			for(int i = 0; i < 20; i++) {
				n[i] = (int)(Math.random() * 401);
				System.out.print(n[i] + " ");
			}
			
			 System.out.print("\n\n�Qu� n�meros quiere resaltar? ");
			 System.out.print("(1 � los m�ltiplos de 5, 2 � los m�ltiplos de 7): ");
			 
			 int opcion = scn.nextInt();
			 
			 int multiplo = (opcion == 1) ? 5: 7;
			 
		// Muestra el resultado
			 
			 for(int objeto : n) {
				 if(objeto % multiplo == 0) {
					 System.out.print("[" + objeto + "] ");
				 } else {
					 System.out.print(objeto + " ");
				 }
			 }
	}

}
