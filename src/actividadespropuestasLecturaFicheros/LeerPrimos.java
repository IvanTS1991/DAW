package actividadespropuestasLecturaFicheros;

import java.io.*;



public class LeerPrimos {

	public static void main(String[] args) throws IOException {
		
		Escribiendo fichero = new Escribiendo();
		
		fichero.escribir();
		
	}	
}	


class Escribiendo {
	
	public void escribir() throws IOException {
		
		int i, j;
		boolean esPrimo;
		int rInicial = 1;
		int rFinal = 500;

		
		for (i = rInicial; i <= rFinal; i++) {

			esPrimo = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					
					esPrimo = false;
					
				}
			}
			
			if(esPrimo) {
				
				FileWriter escritura=new FileWriter("C:/Users/Ivan/Desktop/numerosprimos.txt",true);
				
				escritura.write(i + "\n"); 
				escritura.close();
							
				
			}
			
			
			}
		}
	}
