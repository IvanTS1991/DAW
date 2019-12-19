package Circunferencia;

public class TestCirculo {

	public static void main(String[] args) {
		
		// circulo con radio 10
		Circulo c1 = new Circulo(10);
		System.out.println("el area es " + c1.calcularSuperficie(c1.radio));
		
		// circulo con radio por defecto 2
		Circulo c2 = new Circulo();
		System.out.println("el area es " + c2.calcularSuperficie(c2.radio));
	}

}
