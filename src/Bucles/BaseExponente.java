package Bucles;

import java.util.Scanner;

public class BaseExponente {

	public static void main(String[] args) {
		// Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
		
			Scanner base = new Scanner(System.in);
			Scanner exponente = new Scanner(System.in);
			int b;
			int e;
			double potencia = 1;
			
			System.out.println("Calculo de potencias.");
			
			System.out.println("Introduzca un numero entero para la base: ");
				b = base.nextInt();
			
			System.out.println("Introduzca un valor entero para el exponente: ");
				e = exponente.nextInt();
				
				if (e == 0) {
				potencia = 1;
				}
				
				if (e > 0) {
					for (int a = 0; a < e; a++) {
						potencia *= b;
					}
				}
				
				if (e < 0) {
					for (int a = 0; a < -e; a++) {
						potencia *= b;
					}
						potencia = 1/potencia;
				}
			System.out.println(b + "^" + e + " = " + potencia);
	}

}
