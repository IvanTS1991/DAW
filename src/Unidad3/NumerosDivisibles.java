
package Unidad3;

import java.util.Scanner;

public class NumerosDivisibles {

    
    public static void main(String[] args) {
        Scanner divisible = new Scanner(System.in);
        
        int numero;
        int divisible2 = 2;
        int divisible3 = 3;
        
        System.out.println("Introduce un numero entero : ");
            numero = divisible.nextInt();
            
                
                if(numero %  divisible2 == 0){
			
			System.out.println("El numero es divisible por 2");
			
		}
                
                if( numero % divisible3==0){
			
			System.out.println("El numero es divisible por 3");
			
		}
                
                else {
			
			System.out.println("El numero es divisible por 2 o por 3 pero no por ambos");
			
		}
	
        }
    
    }
