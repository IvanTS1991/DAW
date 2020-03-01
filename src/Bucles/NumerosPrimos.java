package Bucles;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		//Escribe un programa que diga si un número introducido por teclado es o no primo
		
		Scanner primos = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
			int numero = primos.nextInt();
			
			boolean acierto = true;
			
			for (int a = 2; a < numero; a++) {
				if ((numero % a) == 0) {
					acierto = false;
				} 
			}
				if (acierto) {
					System.out.println("El numero " + numero + " es primo");
				
				} else {
					System.out.println("El numero " + numero + " no es primo");
				} 
				
			}

	}


