package Bucles;

import java.util.Scanner;

public class L {

	public static void main(String[] args) {
		
		System.out.println("Introduce la altura que quieres que tenga la L a construir: ");
			
			Scanner figura = new Scanner (System.in);
			int altura = figura.nextInt();
			figura.close();
			
			for (int a = 1; a <= altura; a++) {
				for (int b = 1 ; b <= altura /2 + 1; b++) {
					if(a == altura || b == 1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			System.out.println();	
		}
	}
}
