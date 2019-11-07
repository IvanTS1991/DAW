package Unidad1;

import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10:");
        int calificacion = Integer.parseInt(scanner.nextLine()); //Integer.parseInt Convierte una cadena de texto en un numero entero.
        
        
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Matricula de honor");
        } 
        
        else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Sobresaliente");
        } 
        
        else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("Notable");
        }
        
        else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("Bien");
        } 
        
        else if (calificacion == 5) {
            System.out.println("Suficiente");
        } 
        
        else if (calificacion >= 0 && calificacion < 5) {
            System.out.println("Ponte a estudiar y no lo dejes para el ultimo dia , SUSPENSO");
        
        } else {
            System.out.println("Introduce un valor correcto");
        }
    }
}
