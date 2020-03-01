
package Unidad2;

import java.util.Scanner;


public class EjercicioFinanciero {

    
    public static void main(String[] args) {
        Scanner financiero = new Scanner (System.in);
        
        double beneficiomen = 100.3125;
        double interesan;
        double interesmen = 0.003125;
        double cuantia;
        
         System.out.println("Introduce una cuantia : ");
         cuantia = financiero.nextDouble();
         
         interesan = interesmen * 12;
         
        
         
         System.out.println("El primes mes la ganancia sera : " + (cuantia + interesmen) + " €");
         System.out.println("El segundo mes la ganancia sera : " + (cuantia * 2) * (1 + interesmen) + "€");
         System.out.println("El sexto mes la ganancia sera : " + (cuantia * 6) * (1 + interesmen)+ "€");
         System.out.println("La ganancia anual sera : " + (cuantia * 11) * (1 + interesmen) + "€");
    }
    
}
