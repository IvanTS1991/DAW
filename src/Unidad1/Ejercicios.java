
package Unidad1;

import java.util.Scanner;


public class Ejercicios {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int suma;
        int Diferencia;
        int Cociente;
        int Producto;
        
        System.out.println("Escriba un valor1");
        numero1 = scanner.nextInt();
        
        System.out.println("Escriba un valor2");
        numero2 = scanner.nextInt();
        
        suma = numero1 + numero2;
        Producto = numero1 * numero2;
        Cociente = numero1 / numero2;
        Diferencia = 0;
        
        if (numero1 != numero2){
        System.out.println("aqui te muestra la diferencia : " + (numero1 != numero2) );
        } else {
            System.out.println("Estos numeros son iguales");
        }
        
        System.out.println("la suma es : " + suma);
        System.out.println("aqui te muestra la division : " + Cociente );
        System.out.println("el producto es : " + Producto);
        
        
    }   
    
    
}
