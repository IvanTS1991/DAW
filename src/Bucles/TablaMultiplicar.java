package Bucles;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		// Muestra la tabla de multiplicar de un número introducido por teclado.
		
			Scanner multiplicar = new Scanner(System.in);
			
			System.out.println("Introduce un numero y te imprimire su tabla de multiplicar: ");
			int num = multiplicar.nextInt();
			
				for (int a = 0; a <= 10; a++) {
					System.out.println(num + " x " + a + " = " + (num * a));
				}
			

	}

}
