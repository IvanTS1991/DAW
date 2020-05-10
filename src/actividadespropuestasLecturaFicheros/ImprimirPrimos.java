package actividadespropuestasLecturaFicheros;

import java.io.FileReader;
import java.io.IOException;

public class ImprimirPrimos {

	public static void main(String[] args) {
		
		Leer_Fichero ficherito = new Leer_Fichero();
		
		ficherito.lee();

	}

}


class Leer_Fichero {
	
	public void lee() {
		
		 try {
			 
			FileReader entrada = new FileReader("C:/Users/Ivan/Desktop/numerosprimos.txt");
			
			//inicializamos a 0 para que nos lea el primer caracter de la frase
			int c=0;
					
			while(c!=-1) {  // -1 marca el final del archi
				
				c=entrada.read();
				
				char num=(char)c; //hacemos casting para que no salga el valor ASCI
				
				System.out.print(num);
			}
			
			entrada.close(); //cerramos el flujo
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");;
		}
	}


	}


