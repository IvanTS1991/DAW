package Bucles;

import java.util.Scanner;

public class ConsecutivosPrimos {

	public static void main(String[] args) {
		Scanner primos = new Scanner(System.in);
		
		System.out.print("Introduce un número entero positivo: ");
	    int numero = primos.nextInt();
	       
	    boolean Primo;

	    for (int a = numero; a < numero + 5; a++) {

	    Primo = true;
	      	
	      for (int b = 2; b < a; b++) {
	        if (a % b == 0) {
	          Primo = false;
	        }
	      }

	      
	      if (Primo) {
	        
	    	  System.out.println(a + " es primo");
	     
	      } else {
	       
	    	  System.out.println(a + " no es primo");
	      }
	    }
	    System.out.println();

	}

}
