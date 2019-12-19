package Bucles;

import java.util.Scanner;

public class ContadorDigitos {

	public static void main(String[] args) {
		
		//Programa que nos dira cuantos digitos tiene un numero introducido por el usuario.
		Scanner digitos = new Scanner(System.in);
		int numerodig = 1; 
		int a; 
		int num;

	    System.out.print("Introduce un numero por teclado y te mostrare cuantos digitos lo compone: ");
	    		num = digitos.nextInt();
	    
	    		a = num;
	    
	    		if (a >= 0) {
	    			while (a >= 10) {
	    				a /= 10;
	    				numerodig++;
	    			}
	    }
	    System.out.println(num + " tiene " + numerodig + " digitos.");
	    	
	}

}
