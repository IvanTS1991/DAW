package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
//		Escribe un programa que lea 10 n�meros por teclado y que luego los muestre
//		en orden inverso, es decir, el primero que se introduce es el �ltimo en mostrarse
//		y viceversa.
		
		Scanner n = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		int i;
		
		System.out.println("Introduzca 10 numeros enteros: ");
		
		for(i = 0; i < 10; i++) {
			numeros[i] = n.nextInt();
		}
		
		System.out.println("\nLos 10 numeros al reves son estos: ");
		
		for(i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
