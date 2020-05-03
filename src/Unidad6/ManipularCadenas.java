package Unidad6;

import java.util.Scanner;

public class ManipularCadenas {
	
	
	Scanner palabra = new Scanner(System.in);
	
	//ATRIBUTOS
	private String[] cadena;
	private char[] cadena2;
	private int tamaño;
	private char[] vocales = {'a','e','i','o','u'};
	private int contador[] = {0,0,0,0,0};
	
	//CONSTRUCTOR
	public ManipularCadenas() {}
	
		//tamaño maximo de la cadena + 1
	public ManipularCadenas(ManipularCadenas kk) {
		this.tamaño = kk.tamaño;
	}
	
	//METODOS
	public String[] leerCadenas(String[] frase) {
		System.out.println(frase + "/0");
		return frase;
	}
	
	public char[] escribirCadena(char[] cadenita) {
		for (int i = 0; i < cadenita.length; i++) {
			System.out.print(cadenita[i]);
		}
		return cadenita;
	}
	
	public int longitudCadena(char[] cad) {
		int longitud = 0;
		longitud = cad.length;
		
		return longitud;
	}
	
	public char[] copiarCadena(char[] cc) {
		char[] cadena2 = new char [cc.length];
		System.arraycopy(cc, 0, cadena2, 0, cc.length);
		
		return cadena2;
	}
	
//	public esVocal() {
//		Scanner palabra = new Scanner(System.in);
//		
//		for(int i = 0; i < sc.lenght(); i++) {
//			for(int j = 0; j < vocales.length; j++) {
//				if (sc.charAt(i) == vocales.charAt(j)) {
//					contador[j]++;
//				}
//			}
//		} 
//	}
	
	public void eliminarVocales(Scanner sc) {
		Scanner palabra = new Scanner(System.in);
	}	
//		for(int i = 0; i < sc.length; i++) {
//			if(sc.charAt(i)) {
//				sc.replace((i), "");
//			}
//		}
//	}
	
//	public contieneCadena() {
//		Scanner palabra = new Scanner(System.in);
//		
//		palabra.contains("");
//	}
//	
//	public convertirAmayusculas() {
//		
//	}
//	
//	public esPalindromo() {}
	

}
