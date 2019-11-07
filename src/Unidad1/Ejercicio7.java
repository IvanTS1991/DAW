
package Unidad1;

import java.util.Scanner;


public class Ejercicio7 {

   
    public static void main(String[] args) {
        Scanner coche = new Scanner (System.in);
        
        double km;
        double gasoil;
        
        
        System.out.println("Introduce el total del km del trayecto: ");
        km = coche.nextDouble();
        
        System.out.println("Introduce el coste del gasoil €/l : ");
        gasoil = coche.nextDouble();
        
        System.out.println("El consumo del coche en l/100km es : "+ (km * gasoil) / 100);
    }
    
}
