package ArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
//		Implementa un programa que calcule la denominaci�n ordinal de los reyes de
//		una secuencia hist�rica. El programa solicitar� la cantidad de reyes que se
//		van a introducir, y a continuaci�n recibir� los nombres de los reyes. Presentar�
//		por pantalla dichos nombres, pero coloc�ndoles el ordinal correspondiente. As�,
//		por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero deber�a
//		aparecer como Felipe 1� y el segundo como Felipe 2�.
		
			Scanner scn = new Scanner(System.in);
			
			System.out.print("Introduzca el n�mero total de nombres de reyes: ");
			int n = scn.nextInt();
			
			String[] reyes = new String[n];
			
			System.out.print("Introduzca el nombre de los reyes: ");
			
			for(int i = 0; i < n; i++) {
				reyes[i] = scn.next();
			}
			
			for(int i= 0; i < n; i++) {
				int orden = 1;
			
			
			for(int j = 0; j < i; j++) {
				if(reyes[i].equals(reyes[j])) {
					orden++;
				}
			}
				System.out.println(reyes[i] + " " + orden + "�");
	}

	}
}
