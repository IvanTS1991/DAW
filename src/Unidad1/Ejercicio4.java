
package Unidad1;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner aritmetica = new Scanner (System.in);
        
        int valor1;
        int valor2;
        int valor3;
        int suma;
        int promedio;
        int producto;
        
        System.out.println("Escriba el valor 1:");
        valor1 = aritmetica.nextInt();
        
        System.out.println("Escriba el valor 2:");
        valor2 = aritmetica.nextInt();
        
        System.out.println("Escriba el valor 3:");
        valor3 = aritmetica.nextInt();
        
        suma = valor1 + valor2 + valor3;
        promedio = (valor1 + valor2 + valor3) / 3;
        producto = valor1 * valor2 * valor3;
        
        
       
                
        System.out.println("El resultado de la suma es : " + suma);
        System.out.println("El resultado del promedio es : " + promedio);
        System.out.println("El producto es : " + producto);
        

    }
    
}
