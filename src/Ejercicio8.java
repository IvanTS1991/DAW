package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
//		Realiza un programa que pida la temperatura media que ha hecho en cada mes
//		de un determinado año y que muestre a continuación un diagrama de barras
//		horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
//		de asteriscos o cualquier otro carácter.
		
		Scanner n = new Scanner(System.in);
		
		String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		
		int[] temperatura = new int[12];
		int i, j;
		
		 String verde = " ";
		 String naranja = " ";
		 String azul = " ";
		 String morado = " ";
		 String blanco = " ";
		 
		for ( i= 0; i < 12; i++) {
			System.out.println("Introduzca la temperatura media de " + mes[i] + ": " );
			temperatura[i] = n.nextInt();
		} 
		
		for (i = 0; i < 12; i++) {
			System.out.printf(azul + "%12s" + verde + "|", mes[i]);
				for(j = 0; j < temperatura[i]; j++) {
					System.out.print(morado + "*");
				}
			System.out.println(naranja + " " + temperatura[i] + "ºC" + blanco);	
		}

	}

}
