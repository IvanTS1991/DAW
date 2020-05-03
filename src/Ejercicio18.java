package ArrayUnidimensional;

public class Ejercicio18 {

	public static void main(String[] args) {
		
//		Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
//		ambos incluidos y que los almacene en un array. A continuación, el programa
//		debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
//		programa debe colocar de forma alterna y en orden los menores o iguales de
//		100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
//		mayor… Cuando se acaben los menores o los mayores, se completará con los
//		números que queden.
			
			int[] a = new int[10];
			int[] menor = new int[10];
			int[] mayor = new int[10];
			int cuentaMenor = 0;
			int cuentaMayor = 0;
			
		// Genera el array aleatorio y clasifica los numeros
			
			for(int i = 0; i < 10; i++) {
				a[i] = (int)(Math.random() * 201);
				
				if(a[i] <= 100) {
					menor[cuentaMenor++] = a[i];
				} else {
					mayor[cuentaMayor++] = a[i];
				}
			}
		
		// Muestra el array original
				
			System.out.println("\nArray original:");
		    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		    System.out.print("│ Índice ");
		   
		    	for (int i = 0; i < 10; i++) {
		    		System.out.printf("│%4d ", i);
		    }
		    	
		    System.out.println("│");
		    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
		    System.out.print("│ Valor  ");
		   
		    	for (int i = 0; i < 10; i++) {
		    		System.out.printf("│%4d ", a[i]);
		    }
		    	
		    System.out.println("│");
		    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
		    
	// Imprime el array resultante
		    
		    int[] resultado = new int[10];
		    int menorColocado = 0;
		    int mayorColocado = 0;
		    int j = 0;
		    
		    do {
		    	if(menorColocado < cuentaMenor) {
		    		resultado[j++] = menor[menorColocado++];
		    	}
		    	
		    	if(mayorColocado < cuentaMayor) {
		    		resultado[j++] = mayor[mayorColocado++];
		    	}
		    	
		    } while (j < 10);
		    
	// Imprime el resultado
		    
		    System.out.println("\nArray resultado:");
		    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		    System.out.print("│ Índice ");
		   
		    	for (int i = 0; i < 10; i++) {
		    		System.out.printf("│%4d ", i);
		    }
		    	
		    System.out.println("│");
		    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
		    System.out.print("│ Valor  ");
		   
		    	for (int i = 0; i < 10; i++) {
		    		System.out.printf("│%4d ", resultado[i]);
		    }
		    	
		    System.out.println("│");
		    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
	}

}
