package Bucles;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		
		Scanner piramide = new Scanner(System.in);
		
        System.out.print("Introduzca numero de filas: ");
        
        int numeroFilas = piramide.nextInt();
        piramide.close();
 
        System.out.println();
        
        for(int altura = 1; altura<=numeroFilas; altura++){
            
            for(int espacios = 1; espacios<=numeroFilas-altura; espacios++){
                System.out.print(" ");
            }
 
            
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
