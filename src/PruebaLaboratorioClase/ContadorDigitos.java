package PruebaLaboratorioClase;

import java.util.Scanner;

public class ContadorDigitos {

	public static void main(String[] args) {
		
		Scanner contador = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		long numero = contador.nextLong();
		
		int numPar = 0;
		int numInpar = 0;
		long digito;
		
			while (numero > 0) {   			//mientras que numero sea mayor que 0
				digito = numero % 10;		//digito guarda el valor introducido
				if ( digito % 2 == 0)		//si el nº introducido es resto 
					numPar++;				//sumale 1 a pares
				else						//si no cumple lo anterior
					 numInpar++;			//sumale 1 a inpares
				numero = numero / 10;		//separamos digitos puesto que sera la crifra 2 
			}
		
		System.out.printf("Numero de pares %d\nNumero de impares %d", numPar, numInpar);
        	
       
	}

}
