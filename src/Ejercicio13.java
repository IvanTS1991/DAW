package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
//		Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
//		el programa mostrará el array y preguntará si el usuario quiere destacar el
//		máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
//		el número destacado entre dobles asteriscos.
			
		Scanner opcion = new Scanner(System.in);
			int[] n = new int[100];
			int maximo = 0;
			int minimo = 100;
			
			
			// Genera nº random y calcula el maximo y el minimo
			
			for(int i = 0; i < 100; i++) {
				n[i] = (int)(Math.random() * 501);
				
				if(n[i] < minimo) {
					minimo = n[i];
				}
				
				if(n[i] > maximo) {
					maximo = n[i];
				}
			}
			
			
			// Imprime el array original
			
			for(int objeto : n) {
				System.out.print(objeto + " ");
			}
			
			System.out.print("\n\n¿ Que opcion quiere? 1 - minimo ; 2 - maximo ");
			int opc = opcion.nextInt();
			
			int destacado; // numero que se va a destacar del resto
			
				if(opc == 1) {
					destacado = minimo;
				} else {
					destacado = maximo;
				}
				
				System.out.println();
				
				
				// Muestra el resultado
				
			for(int objeto : n) {
				if (objeto == destacado) {
					System.out.print(" **" + objeto + "** ");
				} else {
					System.out.print(objeto + " ");
			}
		}
	}

}
