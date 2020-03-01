
package Unidad1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("Escribe un valor 1");
        numero1 = scanner.nextInt();
        
        System.out.println("Escribe el valor 2");
        numero2 = scanner.nextInt();
        
        if (numero1 > numero2) {
            System.out.println(" El valor 1 es mas grande");
        }   
        else if (numero2 > numero1){  
                System.out.println("El valor 2 es mas grande");
            
        } else {
            System.out.println("Estos numeros son iguales");
        }
    }
    
}
