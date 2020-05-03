package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
//		Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
//		n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado del
//		m�ximo y del m�nimo respectivamente.
		
		Scanner n = new Scanner(System.in);
		
		int[] numero = new int[10];
	    int maximo = Integer.MIN_VALUE;
	    int minimo = Integer.MAX_VALUE;
	    int i;
	    
	    System.out.println("Introduzca 10 numeros enteros : ");
	    
	    for(i = 0; i < 10; i++) {
	    	numero[i] = n.nextInt();
	    	
	    	if (numero[i] < minimo) {
	    		minimo = numero[i];
	    	}
	    	
	    	if (numero[i] > maximo) {
	    		maximo = numero[i];
	    	}
	    }
		
	    	System.out.println();
	    	
	    for (i = 0; i < 10; i++) {
	    	System.out.print(numero[i]);
	    	if (numero[i] == maximo) {
	    		System.out.print(" maximo");
	    	}
	    	
	    	if (numero[i] == minimo) {
	    		System.out.print(" minimo");
	    	}
	    	
	    		System.out.println();
	    }
	}

}
