
package Unidad2;

import java.util.Scanner;

public class PuntoMedio {

    public static void main(String[] args) {
       
        
        Scanner puntom = new Scanner(System.in);
        
        double x1;
        double x2;
        double y1;
        double y2;
        double puntomedio;
        
        System.out.println("Introduce un punto X: ");
        x1 = puntom.nextDouble();
        
        System.out.println("Introduce un segundo punto X: ");
        x2 = puntom.nextDouble();
        
        System.out.println("Introduce un punto Y: ");
        y1 = puntom.nextDouble();
        
        System.out.println("Introduce un punto Y: ");
        y2 = puntom.nextDouble();
        
        puntomedio = Math.sqrt(Math.pow((x2 - x1),2))+(Math.pow((y2 - y1),2));
        
        System.out.println("La distancia entre ambos puntos es : " + puntomedio);
    }
    
}
