package Bucles;

public class ContadorDecrementoDW {

	public static void main(String[] args) {
		
		//Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while
		
		System.out.println("Mostrara los numeros de 320 al 160 de 20 en 20 con bucle do-while: ");
			
			int num = 320;
			
			do {
				System.out.println(num);
				num -= 20;
			
			} while(num >= 160); 
				
	}

}
