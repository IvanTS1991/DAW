package Unidad6;

import java.util.Scanner;

public class ContarVocales {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		Vocales v1 = new Vocales(palabra);
		
		System.out.println("La palabra " + palabra + " tiene " + v1.cuentaVocales() + " vocales.");

	}

}
