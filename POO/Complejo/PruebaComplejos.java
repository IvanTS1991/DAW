package Complejo;

import java.util.Scanner;

public class PruebaComplejos {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		
		//objetos en el cual sumaImag se inicializan a 0
		Complejos numComplej1 = new Complejos();
		Complejos numComplej2 = new Complejos();
		
		//mostramos las operaciones
		System.out.println("Introduzca la parte real del numero:  ");
		
		double realComplej1 = numeros.nextDouble();
		double a = numeros.nextDouble();
		
		numComplej1.cambia_Real(realComplej1);
		
		
		System.out.println("Introduce la parte imaginaria del numero");
		
		double imagComplej2 = numeros.nextDouble();
		double b = numeros.nextDouble();
		numComplej2.cambio_Imag(imagComplej2);
		
		Complejos c1 = new Complejos(realComplej1,imagComplej2);
		Complejos c2 = new Complejos(a,b);
		
		
		
		//llamamos al metodo para mostrar
		System.out.println("c1 : " + c1.toString());
		System.out.println("c2 : " + c2.toString());
		c1.sumar(c2);
		System.out.println("suma: " + c1.toString());
		
	}

}
