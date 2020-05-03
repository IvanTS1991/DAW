package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
//		Realiza un programa que pida 8 números enteros y que luego muestre esos
//		números junto con la palabra “par” o “impar” según proceda.

		Scanner n = new Scanner(System.in);
		
		int[] numeros = new int[8];
		int i;
		
		System.out.println("Introduce 8 numeros enteros: ");
		
			for(i = 0; i < 8; i++) {
				numeros[i] = n.nextInt();
			}
		
			for (i = 0; i < 8; i++) {
				if(numeros[i] %2 == 0) {
					System.out.println(numeros[i] + " par");
				} else {
					System.out.println(numeros[i] + " impar");
				}
			}
		
	}

}
