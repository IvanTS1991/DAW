package Bucles;

import java.util.Scanner;

public class NumerosPosiNega {

	public static void main(String[] args) {
		//leera una lista de diez números y determine cuántos son positivos, y cuántos son negativos
		
		Scanner num = new Scanner(System.in);
		
		int[] numero = new int[10];
        int positivo = 0, negativo = 0; 
        int a;
       

        System.out.println("A continuacion introduzca 10 valores: ");
        for (a = 0; a < 10; a++) {
            System.out.print("numero " + a + " = ");
            numero[a] = num.nextInt();
        }
        
        for (a = 0; a < 10; a++) {
            
        	if (numero[a] > 0) {
                positivo++;
            
        	} else if (numero[a] < 0) {
                negativo++;
            
        	}
        }
        
        System.out.println("Ha introducido " + positivo + " numero/s positivo/s");
        System.out.println("Ha introducido " + negativo + " numero/s negativo/s");
        
	}

}



	
