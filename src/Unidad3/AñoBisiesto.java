
package Unidad3;

import java.util.Scanner;

public class A�oBisiesto {

    public static void main(String[] args) {
        Scanner bisiesto = new Scanner(System.in);
        
        int a�o;
        int divisible = 4;
        int divisible1 = 100;
        int divisible4 = 400;
        
       
        System.out.println("Introduce un a�o y te dire si es bisiesto o no : ");
            a�o = bisiesto.nextInt();
            
                if(a�o % divisible == 0 && a�o % divisible1 != 0 || a�o % divisible4 == 0){ 
			
			System.out.println("El a�o " + a�o + " es bisiesto");
			
		
                } else {
                    System.out.println("El a�o " + a�o + " no es bisiesto");
                }
    }
    
}
