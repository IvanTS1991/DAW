
package Unidad3;

import java.util.Scanner;

public class Transportes {

    
    public static void main(String[] args) {
        Scanner porte = new Scanner(System.in);
        
        double peso;
        
        
        System.out.println("Escribe el peso del paquete que quieres mandar: ");
            peso = porte.nextDouble();
            
            if(peso > 0 && peso <= 2) {
                System.out.println("El evio de tu paquete costara " + peso * 2.5 + " $"); // el coeficiente en este caso sera 2.5
            
            }else if (peso > 2 && peso <= 4) {
                System.out.println("El envio de tu paquete costara " + peso * 4.5 + " $"); // el coeficiente en este caso sera 2.5
            
            }else if (peso > 4 && peso <= 10) {
                System.out.println("El envio de tu paquete costara " + peso * 7.5 + " $"); // el coeficiente en este caso sera 7.5
            
            }else if (peso > 10 && peso <= 20) {
                System.out.println("El envio de tu paquete costara " + peso * 10.5 + " $"); // el coeficiente en este caso sera 10.5
            
            } else {
                System.out.println("El paquete no podra ser enviado.");
            }
            
            
        
        
    }
    
}
