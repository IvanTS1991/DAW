package Bucles;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 
		System.out.print("Introduce un número: ");
			Scanner factorial = new Scanner(System.in);
		
		int numero = factorial.nextInt();
		    int factor = 1;
		    
		    for (int n = 1; n <= numero; n++){
		      factor *= n;
		    }
		    System.out.print(numero +"! = " + factor);

	}

}
