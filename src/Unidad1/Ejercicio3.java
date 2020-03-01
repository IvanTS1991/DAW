
package Unidad1;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner circulo = new Scanner (System.in);
        
        int radio;
        int diametro;
        int circunferencia;
        int area;
        double Pi;
        Pi = 3.14159;
        
        System.out.println("Introduce un valor para asignarle al radio : ");
        radio = circulo.nextInt();
        
        System.out.println("El diametro del circulo es : " + 2 * radio);
        System.out.println("La circunferencia es : " + 2 * Pi * radio);
        System.out.println("El area del circulo es : " + Pi * radio * radio);
    }
    
}
