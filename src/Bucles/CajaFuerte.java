package Bucles;

import java.util.Scanner;

public class CajaFuerte {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int oportunidad = 4;
		int num;

		while (oportunidad >= 0) {
			System.out.println("Introduzca combinacion");
			num = numero.nextInt();
			
			if(num == 4567) {
				System.out.println("Has abierto la caja fuerte!");
				break; 
				
			} else {
				System.out.println("te quedan " + oportunidad + " oportunidades");
				oportunidad--;
				
			}
			
			
		}
			if ( oportunidad < 0) {
				System.out.println("Has fallado te has quedado sin oportunidades");
			}
	}

}
