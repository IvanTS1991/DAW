package NumerosPrimos;

public class FuncionesMatematicas {
	
		//ATRIBUTOS
	public int n;
		
		//METODOS
	
	public boolean esPrimo(int n) {
		
		for(int a=2; 2 < n; a++) {
			
			if ((n % a) == 0 ) {
				return false; //devuelve false cuando no lo sea
			}
			
		}
		return true;  //devuelve true cuando sea numero primo
		
	}
	
	
		//contador de digitos enteros
	
	public static int cuentaDigitos(int n) {
		
		if ( n == 0) {
			return 1;
		
		} else {
			
			int z = 0;
			while (n > 0) {
				n = n / 10;
				z++;
			}
			return z;
		}
		
	}

}
