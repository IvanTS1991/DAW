
package Unidad2;

import java.util.Scanner;


public class ConversorMillaKm {

    
    public static void main(String[] args) {
        Scanner conversor = new Scanner(System.in);
        int millas;
        double km;
        System.out.println("Convertir Millas a Kilometros");
       
        do {

            System.out.print("Introduce millas (0 para finalizar): ");
            millas = conversor.nextInt();

            if (millas != 0) {
                km = millas * 1.6;
                System.out.println(millas + " millas equivalen a " + km + " KM.  ");
            }

        } while (millas != 0);
    }
    
}
