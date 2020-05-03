package ArrayUnidimensional;

public class Ejercicio21 {

	public static void main(String[] args) {
		
//		Escribe un programa que rellene un array de 15 elementos con números enteros
//		comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
//		array “cincuerizado”, según el siguiente criterio: si el número que hay en una
//		posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
//		siguiente múltiplo de 5 que exista a partir de él.
		
		// Crea el array aleatorio
			
			int[] n = new int[15];
			
			for(int i = 0; i < 15; i++) {
				n[i] = (int)(Math.random() * 501);
			}
			
			System.out.println("Array original: ");
			
			for(int i = 0; i < 15; i++) {
				System.out.print(n[i] + " ");
			}
			
		// Formatea el array con multiplos de 5
			
			for(int i = 0; i < 15; i++) {
				while(n[i] % 5 != 0) {
					n[i]++;
				}
			}
			
		// Imprime el resultado
			System.out.println("\n\nArray resultante: ");
			
			for(int i = 0; i < 15; i++) {
				System.out.print(n[i] + " ");
			}
	}

}
