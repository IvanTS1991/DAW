
package Unidad1;

import java.util.Scanner;


public class Ejercicio6 {

   
    public static void main(String[] args) {
        Scanner bascula = new Scanner(System.in);
        
        double peso;
        double altura;
        double BMI;
        
        System.out.println("Introduce el peso:");
        peso = bascula.nextDouble();
        
        System.out.println("Introduce la altura:");
        altura = bascula.nextDouble();
        
        System.out.println("El indice de masa corporal es: " + (peso / (altura * altura)));
        System.out.println("\nVALORES DE BMI\nBajo peso: menos de 18.5\nNormal: entre 18.5 y 24.9\nSobrepeso: entre 25 y 29.9\nADELGAZA: 30 o mas");
    }
    
}
