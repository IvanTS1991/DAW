package Unidad1;

import java.util.Scanner;

public class GradosCF {

    public static void main(String[] args) {
        Scanner grados = new Scanner(System.in);
        System.out.println("Escriba 0 si quiere convertir de ºF a ºC y escriba 1 si quiere pasar de ºC a ºF.\n");
        System.out.println("0. ºC  a  ºF");
        System.out.println("1. ºF  a  ºC");
        
        int opcion = grados.nextInt();
        
        if (opcion == 0) {
            System.out.println("Ingresa grados celsius");
            int celsius = grados.nextInt();
            double fahr = (celsius * 1.8) + 32;
            System.out.println(celsius + "ºCelsius equivale a " + fahr + " ºFahrenheit");
       
        } else {
            System.out.println("Ingresa grados fahrenheit");
            int fahr = grados.nextInt();
            double celsius = (fahr - 32) / 1.8;
            System.out.println(fahr + "ºFahrenheit equivale  a " + celsius + " ºCelsius");
        }
    }

}
