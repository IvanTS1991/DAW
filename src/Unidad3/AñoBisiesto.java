
package Unidad3;

import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String[] args) {
        Scanner bisiesto = new Scanner(System.in);
        
        int año;
        int divisible = 4;
        int divisible1 = 100;
        int divisible4 = 400;
        
       
        System.out.println("Introduce un año y te dire si es bisiesto o no : ");
            año = bisiesto.nextInt();
            
                if(año % divisible == 0 && año % divisible1 != 0 || año % divisible4 == 0){ 
			
			System.out.println("El año " + año + " es bisiesto");
			
		
                } else {
                    System.out.println("El año " + año + " no es bisiesto");
                }
    }
    
}
