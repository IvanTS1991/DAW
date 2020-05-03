package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
//		Realiza un programa que pida 10 números por teclado y que los almacene en
//		un array. A continuación se mostrará el contenido de ese array junto al índice
//		(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
//		primos a las primeras posiciones, desplazando el resto de números (los que no
//		son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
//		array resultante
		
		Scanner n = new Scanner(System.in);
		

	    int[] numeros = new int[10];
	    int[] primo = new int[10];
	    int[] noPrimo = new int[10];
	    int i;
	    int j;
	    int primos = 0;
	    int noPrimos = 0;
	    boolean esPrimo = false;
	    
	    System.out.println("Introduzca 10 números enteros :");

	    for (i = 0; i < 10; i++) {
	      numeros[i] = n.nextInt();
	      
	      // Comprueba si el número es o no primo.
	      esPrimo = true;
	      for (j = 2; j < numeros[i] - 1; j++) {
	        if (numeros[i] % j == 0) {
	          esPrimo = false;
	        }
	      }
	      
	      // Si el número es primo, se mete en un array y si
	      // no es primo, se mete en otro diferente.
	      if (esPrimo) {
	        primo[primos++] = numeros[i];
	      } else {
	        noPrimo[noPrimos++] = numeros[i];
	      }
	    }
	    
	    // Muestra el array original
	    System.out.println("\n\nArray original:");
	    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
	    System.out.print("│ Índice ");
	    for (i = 0; i < 10; i++) {
	      System.out.printf("│%4d ", i);
	    }
	    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
	    System.out.print("│ Valor  ");
	    for (i = 0; i < 10; i++) {
	      System.out.printf("│%4d ", numeros[i]);
	    }
	    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
	    
	    // Los números primos se menten en las primeras
	    // posiciones del array original.
	    for (i = 0; i < primos; i++) {
	      numeros[i] = primo[i];
	    }
	    
	    // Los números que no son primos se colocan al final.
	    for (i = primos; i < primos + noPrimos; i++) {
	      numeros[i] = noPrimo[i - primos];
	    }

	    // Muestra el resultado.
	    System.out.println("\n\nArray con los primos al principio:");
	    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
	    System.out.print("│ Índice ");
	    for (i = 0; i < 10; i++) {
	      System.out.printf("│%4d ", i);
	    }
	    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
	    System.out.print("│ Valor  ");
	    for (i = 0; i < 10; i++) {
	      System.out.printf("│%4d ", numeros[i]);
	    }
	    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
	}


}
