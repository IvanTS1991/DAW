package Unidad1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner multiplos = new Scanner(System.in);

        int num1;
        int num2;
        int residuo;

        System.out.println("Escriba el valor 1 : ");
        num1 = multiplos.nextInt();

        System.out.println("Escriba el valor 2 : ");
        num2 = multiplos.nextInt();

        residuo = num1 % num2;
       
        if (residuo==0) {
        System.out.println(num1 + " es multiplo de " + num2);
        }  else {
        System.out.println(num1 + " NO es multiplo de " + num2);
    }

    }
}
