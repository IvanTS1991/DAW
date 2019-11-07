
package Unidad3;

import java.util.Scanner;


public class Radianes {

    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        double a;
        
            System.out.print("Introduce un Angulo de (0...360°): ");
            a = num.nextDouble();
    
        
        System.out.println("Seno de " + a + " es: " + Math.sin(a) );
        System.out.println("Coseno de " + a + " es: " + Math.cos(a) );
        System.out.println("Tangente de " + a + " es: " + Math.tan(a) );
        System.out.println("Radianes de " + a + " es: " + Math.toRadians(a));
    }
    
}
