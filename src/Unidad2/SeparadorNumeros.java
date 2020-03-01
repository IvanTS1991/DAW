
package Unidad2;

import java.util.Scanner;

public class SeparadorNumeros {

    public static void main(String[] args) {
       
        
        Scanner separador = new Scanner(System.in);
        
        int num;
        int quinto;
        int cuarto;
        int tercero;
        int segundo;
        int primero;
        
        System.out.println("Escriba un numero entero de 5 digitos: ");
        num = separador.nextInt();
        
        quinto = num%10;
        
        num = num/10;
        cuarto = num%10;
        
        num = num/10;
        tercero = num%10;
        
        num = num/10;
        segundo = num%10;
        
        num = num/10;
        primero = num%10;
        
        System.out.println("El numero descompuesto es : ");
        System.out.printf("%d %d %d %d %d ", primero, segundo, tercero, cuarto, quinto);
    }
    
}
