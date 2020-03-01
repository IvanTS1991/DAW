package Rectangulo;

import java.util.Scanner;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Scanner rec = new Scanner(System.in);
		
		System.out.println("Introduce dos numeros que seran la base y la altura del rectangulo: ");
		double base1 = rec.nextDouble();
		double altura1 = rec.nextDouble();
		Rectangulo r1 = new Rectangulo(base1,altura1);
		
		
		
		System.out.println("El area del rectangulo es : " + r1.getArea(base1, altura1));
		
		System.out.println("El perimetro del rectangulo es : " + r1.getPerimetro(base1, altura1));

	}

}
