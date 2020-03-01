package Bucles;

import java.util.Scanner;

public class TrianguloRelleno {

	public static void main(String[] args) {
		Scanner triangulo = new Scanner(System.in);
		
		System.out.println("Introduce la altura que deseas para el triangulo: ");
		
		int altura = triangulo.nextInt();
        
		int a = 0, b=0;
 
        for(a = 1; a <= altura; a = a+1)
        {
            
            for(b = 0; b < a; b++)
            {
                System.out.print("*");
            }
            System.out.println();

	}
  }
}
