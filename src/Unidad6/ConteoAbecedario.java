package Unidad6;

import java.util.Scanner;

public class ConteoAbecedario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Abecedario abc = new Abecedario();
		String frase;

	


		System.out.println("Escribe una frase: ");

		frase = sc.nextLine();

		abc.setFrase(frase);

		abc.pasarMinusculas(frase);

		abc.imprimeArray(abc.cuentaVocales());

		

	}

}
