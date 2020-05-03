package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
//		Escribe un programa que genere 100 n�meros aleatorios del 0 al 20 y que los
//		muestre por pantalla separados por espacios. El programa pedir� entonces por
//		teclado dos valores y a continuaci�n cambiar� todas las ocurrencias del primer
//		valor por el segundo en la lista generada anteriormente. Los n�meros que se
//		han cambiado deben aparecer entrecomillados.
		
		Scanner n = new Scanner(System.in);
		
		int[] numero = new int[100];
	    int i;
	    String verde = " ";
	    String blanco = " ";
	    
	    // Rellena el array con n�meros aleatorios
	    for (i = 0; i < 100; i++) {
	      numero[i] = (int)(Math.random() * 21);
	      System.out.print(numero[i] + "  ");
	    }
	    
	    System.out.print("\nIntroduzca un n�mero de los que se han mostrado: ");
	    int valor1 = n.nextInt();
	    System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
	    int valor2 = n.nextInt();

	    System.out.println();
	    
	    for (i = 0; i < 100; i++) {
	      if (numero[i] == valor1) {
	        numero[i] = valor2;
	        System.out.print(verde + "\"" + numero[i] + "\"  ");
	      } else {
	        System.out.print(blanco + numero[i] + "  ");
	      }
	    }

	    System.out.println();

	}

}
