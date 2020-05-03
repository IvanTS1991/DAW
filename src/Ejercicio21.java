package ArrayUnidimensional;

public class Ejercicio21 {

	public static void main(String[] args) {
		
//		Escribe un programa que rellene un array de 15 elementos con n�meros enteros
//		comprendidos entre 0 y 500 (ambos incluidos). A continuaci�n, se mostrar� el
//		array �cincuerizado�, seg�n el siguiente criterio: si el n�mero que hay en una
//		posici�n del array es m�ltiplo de 5, se deja igual, y si no, se cambia por el
//		siguiente m�ltiplo de 5 que exista a partir de �l.
		
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
