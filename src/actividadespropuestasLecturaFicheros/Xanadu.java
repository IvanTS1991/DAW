package actividadespropuestasLecturaFicheros;

import java.io.*;
import java.util.*;

public class Xanadu {

	static int palabrasTotales;
	static int lineasTotales;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		palabrasTotales = 0;
		lineasTotales = 0;
		
	File entrada = new File("C:/Users/Ivan/Desktop/xanadu.txt");
	
	
	contarLineas(entrada);
		
	}

	private static void contarLineas(File entrada) {
		
	try {
		
		if(entrada.exists()) {
			
			BufferedReader entradaLeer = new BufferedReader(new FileReader(entrada));
			
			String lineaLeida;
					
				while((lineaLeida = entradaLeer.readLine()) != null) {
					
					System.out.println(lineaLeida);
					
					StringTokenizer st = new StringTokenizer(lineaLeida);
					
					lineasTotales++;
					palabrasTotales = palabrasTotales + st.countTokens();
					
					}
				
					System.out.println("\nEl archivo contiene " + palabrasTotales + " palabras.");
					
					entradaLeer.close();
		
			}
			
		} catch (IOException e) {
		
		System.out.println("El archivo o la ruta especificada no se ha encontrado.");
	}
		
	}
	
}

	



