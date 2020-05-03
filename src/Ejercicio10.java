package ArrayUnidimensional;

public class Ejercicio10 {

	public static void main(String[] args) {
		
//		Escribe un programa que genere 20 n�meros enteros aleatorios entre 0 y 100
//		y que los almacene en un array. El programa debe ser capaz de pasar todos
//		los n�meros pares a las primeras posiciones del array (del 0 en adelante) y
//		todos los n�meros impares a las celdas restantes. Utiliza arrays auxiliares si es
//		necesario
		
		int[] numeros = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int i;
		int pares = 0;
		int impares = 0;
		
		for(i = 0; i < 20; i++) {
			numeros[i] = (int)(Math.random() * 101);
			if (numeros[i] %2 == 0) {  //separa los numeros metiendos pares en un array 
				par[pares++] = numeros[i];
			} else {
				impar[impares++] = numeros[i]; // y alos impares en otro array
			}
		}
		
		// Muestra el array original
		System.out.println("Array original: ");
		for ( i = 0; i < 20; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		
		//Mete a los pares en las primeras posiciones del array original
		for (i = pares; i < 20; i++) {
			numeros[i] = impar[i - pares];
		}
		
		// Muestra el resultado del array
		System.out.println("Array con los pares al principio:");
		
		for (i = 0; i < 20; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
