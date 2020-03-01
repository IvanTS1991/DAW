
package Unidad2;

import java.util.Scanner;

public class NotaMedia {

    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double notamedia;
        
        System.out.println("Escribe la nota del primer examen: ");
        nota1 = nota.nextDouble();
        
        System.out.println("Escribe la nota que quieres sacar en el trimestre: ");
        nota2 = nota.nextDouble();
        
        notamedia = (nota2 - nota1 * 0.4)/(0.6);
        
        System.out.println("Para tener un " + nota2 + " en el trimestre necesitas sacar un " + notamedia + " en el segundo examen.");
        
    }
    
}
