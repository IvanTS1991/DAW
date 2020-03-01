
package Unidad2;

import java.util.Scanner;

public class Triangulo {

   
    public static void main(String[] args) {
        Scanner triangulo = new Scanner (System.in);
        
        int lado1;
        int lado2;
        double area;
        double volumen;
        
        System.out.println("Introduce un valor para el lado 1: ");
        lado1 = triangulo.nextInt();
        
        System.out.println("Introduce un valor para el lado 2: ");
        lado2 = triangulo.nextInt();
        
        area = (1.73 / 4)* (lado1 * lado2);
        volumen = area * (lado1 + lado2 + lado2);
        
        System.out.println("El area del triangulo es : " + area);
        System.out.println("El volumen del triangulo es : " + volumen);
    }
    
}
