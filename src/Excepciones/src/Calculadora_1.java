
public class Calculadora_1 {

	public static void main(String[] args) {
		
		try {
			
			String signo = args[0];
			int numero1 = Integer.parseInt(args[1]);
			int numero2 = Integer.parseInt(args[2]);
			System.out.println(signo);
			System.out.println(numero1);
			System.out.println(numero2);
			
			if(signo.equals("+")) {
				System.out.println("Sumar " + numero1 + " + " + numero2);
				int suma = numero1 + numero2;
				System.out.println("Resultado " + suma);
				
			} else if(signo.equals("-")) {
				System.out.println("Restar " + numero1 + " - " + numero2);
				int resta = numero1 - numero2;
				System.out.println("Resultado " + resta);
			
			} else if (signo.equals("*")) {
				System.out.println("Multiplicar " + numero1 + " * " + numero2);
				int multiplicacion = numero1 + numero2;
				System.out.println("Resultado " + multiplicacion);
			
			}else if(signo.equals("/")) {
				System.out.println("Dividir " + numero1 + " / " + numero2);
				int division = numero1 / numero2;
				System.out.println("Resultado " + division);
			}
			
		} catch(Exception e) {
			
			
			System.out.println("Algun valor introducido no es correcto");
		}

	}

}
