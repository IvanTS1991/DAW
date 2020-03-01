package Bucles;

import java.util.Scanner;

public class EnterosPositivos {

	public static void main(String[] args) {
		
		System.out.print("Introduce un número entero positivo: ");
			Scanner positivo = new Scanner(System.in);

	    
	    long numero = positivo.nextLong();
	    long reves = 0;
	    int longitud = 0;
	    
	    if (numero == 0) {
	      longitud = 1;
	    }
	    
	    while (numero > 0) {
	      reves = (reves * 10) + (numero % 10);
	      numero /= 10;
	      longitud++;
	    } 

	    
	    System.out.print("Dígitos pares: ");

	    int digito;
	    int sumaPares = 0;
	    
	    for (int n = 0; n < longitud; n++) {

	      digito = (int)(reves % 10);

	      if ((digito % 2) == 0) {
	        System.out.print(digito + " ");
	        sumaPares += digito;
	      }

	      reves /= 10;
	    }
	    
	    
	    System.out.println("\nSuma de los dígitos pares: " + sumaPares);

	}

}
