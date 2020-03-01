package Bucles;

import java.util.Scanner;

public class SerieIndeterminada {

	public static void main(String[] args) {
		

		//Serie indeterminadad de numeros hasta que sumen 10.000. Luego mostrar total acumulado, nº introducidos y media
			
			Scanner indeterminada = new Scanner(System.in);
			
			
			System.out.println("Introduce numeros enteros. El programa parara cuando la suma llegue a 10.000");
			
			int sumar = 0;
			int numero = 0;
			
			for (int num = 0; sumar <=10000; numero++) {
				
				num = indeterminada.nextInt();
				sumar += num;
			}
			
			System.out.println("Has introducido " + numero + " de enteros.");
			System.out.println("La suma total es de : " + sumar);
			System.out.println("La media total es de : " + sumar/numero);
	}

}
