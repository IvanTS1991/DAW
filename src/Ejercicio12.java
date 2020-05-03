package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
//		Realiza un programa que pida 10 números por teclado y que los almacene en
//		un array. A continuación se mostrará el contenido de ese array junto al índice
//		(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
//		“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
//		números están entre 0 y 9. El programa deberá colocar el número de la posición
//		inicial en la posición final, rotando el resto de números para que no se pierda
//		ninguno. Al final se debe mostrar el array resultante.
			
			Scanner scn = new Scanner(System.in);
			
			int[] n = new int[10];
			int[] resultado = new int[10];
			int i, nInicial, nFinal;
			boolean correcto;
			
				System.out.println("Introduzca 10 enteros: ");
			
			for(i= 0; i < 10; i++) {
				n[i] = scn.nextInt();
			}
			
				// Imprime el array original
			
				System.out.println("\nArray original: ");
				System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
				System.out.print("│ Índice ");
		    
		    for ( i = 0; i < 10; i++) {
		    	System.out.printf("|%4d ", i);
		    }
			
		    	System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
		    	System.out.print("│ Valor  ");
		    for ( i = 0; i < 10; i++) {
		    	System.out.printf("|%4d ", n[i]);
		    }
		    	System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
		    
		    
		    	// Pediremos las posiciones inicial y final
		    do {
		    	correcto = true;
		    	
		    	System.out.println("Introduzca la posicion inicial ( 0 - 9): ");
		    	nInicial = scn.nextInt();
		    		if((nInicial < 0) || (nInicial > 9)) {
		    			System.out.println("Incorrecto. Debe ser un numero entre 0 y 9.");
		    			correcto = false;
		    		}
		    		
		    	System.out.println("Introduzca la posicion final (0-9): ");
		    	nFinal = scn.nextInt();
		    		if((nFinal < 0) || (nFinal > 9)) {
		    			System.out.println("Incorrecto. Debe ser un numero entre 0 y 9.");
		    			correcto = false;
		    		}
		    		
		    		if(nInicial >= nFinal ) {
		    			System.out.println("Incorrecto. La posicion inicial debe ser menor ala posicion final.");
		    			correcto = false;
		    		}
		    } while (!correcto);
		    
		    	// Imprime el nuevo array original.
		    
		    System.out.println("\n\nArray original:");
		    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		    System.out.print("│ Índice ");
		    	for (i = 0; i < 10; i++) {
		      System.out.printf("│%4d ", i);
		    }
		    	
		    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
		    System.out.print("│ Valor  ");
		    	for (i = 0; i < 10; i++) {
		      System.out.printf("│%4d ", n[i]);
		    }
		    	
		    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
		    
		    // Copia el array n en resultado.
		    
		    for (i = 0; i < 10; i++) {
		      resultado[i] = n[i];
		    }
		    
		    resultado[nFinal] = n[nInicial];
		    
		    for (i = nFinal + 1; i < 10; i++)
		      resultado[i] = n[i - 1];
		    
		    resultado[0] = n[9];
		    
		    for (i = 0; i < nInicial; i++)
		      resultado[i + 1] = n[i];
		    
		    // Muestra el resultado.
		    System.out.println("\nArray resultante:");
		    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		    System.out.print("│ Índice ");
		    	for (i = 0; i < 10; i++) {
		      System.out.printf("│%4d ", i);
		    }
		    	
		    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
		    System.out.print("│ Valor  ");
		    	for (i = 0; i < 10; i++) {
		      System.out.printf("│%4d ", resultado[i]);
		    }
		    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");  
		  }
		


	}


