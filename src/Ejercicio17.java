package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
//		Escribe un programa que muestre por pantalla un array de 10 números enteros
//		generados al azar entre 0 y 100. A continuación, el programa debe pedir un
//		número al usuario. Se debe comprobar que el número introducido por teclado
//		se encuentra dentro del array, en caso contrario se mostrará un mensaje por
//		pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
//		correctamente. A continuación, el programa rotará el array hacia la derecha
//		las veces que haga falta hasta que el número introducido quede situado en la
//		posición 0 del array. Por último, se mostrará el array rotado por pantalla.
		
			Scanner scn = new Scanner(System.in);
			
			int[] n = new int[10];
			
		// Genera el array aleatorio
			for(int i = 0; i < 10; i++) {
				n[i] = (int)(Math.random() * 101); 
			}
			
			
		// Imprime el array original
			
			System.out.println("\n\nArray original:");
		    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		    System.out.print("│ Índice ");
		    	
		    	for (int i = 0; i < 10; i++) {
		    		System.out.printf("│%4d ", i);
		    }
		    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
		    System.out.print("│ Valor  ");
		    
		    	for (int i = 0; i < 10; i++) {
		    		System.out.printf("│%4d ", n[i]);
		    }
		    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

		    
		// Pide un número que esté dentro del array
		    
		    boolean existeNumero = false;
		    int numeroIntroducido;
		    do {
		      System.out.print("\nIntroduzca uno de los números del array: ");
		      numeroIntroducido = scn.nextInt();
		     
		      
		// Comprueba si el numero introducido se encuentra dentro del array
		      
		      for(int objeto : n) {
		    	 if(objeto == numeroIntroducido) {
		    		 existeNumero = true;
		    	 } 
		      }
		      
		      if(!existeNumero) {
		    	  System.out.println("Ese numero no se encuentra en el array");
		      }
		      
		} while (!existeNumero);
		    
		    
		// Rota los nº del array hasta que el nº introducido se coloque en la posicion 0
		    
		    while (n[0] != numeroIntroducido) {
		    	int nn = n[9];
		    	
		    	for(int i = 9; i > 0; i--) {
		    		n[i] = n[i -1];
		    	}
		    	n[0] = nn;
		    }
		    
		// Muestra el resultado
		    
		    System.out.println("\nArray resultante:");
		    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		    System.out.print("│ Índice ");
		    
		    	for (int i = 0; i < 10; i++) {
		    		System.out.printf("│%4d ", i);
		    }
		    
		    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
		    System.out.print("│ Valor  ");
		    
		    	for (int i = 0; i < 10; i++) {
		    		System.out.printf("│%4d ", n[i]);
		    }
		    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘"); 
	}

}
