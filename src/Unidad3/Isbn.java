
package Unidad3;

import java.util.Scanner;

public class Isbn {

   
    public static void main(String[] args) {
        Scanner isbn = new Scanner(System.in);
        
        System.out.println("Escribe tus numeros para el ISBM: ");
        
        System.out.println("Escribe el primero numero: ");
        int d1 = isbn.nextInt();
        
        System.out.println("Escribe el segundo numero: ");
        int d2 = isbn.nextInt();
        
        System.out.println("Escribe el tercer numero: ");
        int d3 = isbn.nextInt();
        
        System.out.println("Escribe el cuarto numero: ");
        int d4 = isbn.nextInt();
        
        System.out.println("Escribe el quinto numero: ");
        int d5 = isbn.nextInt();
        
        System.out.println("Escribe el sexto numero: ");
        int d6 = isbn.nextInt();
        
        System.out.println("Escribe el septimo numero: ");
        int d7 = isbn.nextInt();
        
        System.out.println("Escribe el octavo numero: ");
        int d8 = isbn.nextInt();
        
        System.out.println("Escribe el noveno numero: ");
        int d9 = isbn.nextInt();
        
        int numero10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11 ;
        
        if(numero10 == 10){
            System.out.println("El numero ISBN completo es : " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        }else{
            System.out.println("El numero ISBN competo es : " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + numero10);
        }
    }
    
}
