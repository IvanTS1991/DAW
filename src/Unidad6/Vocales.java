package Unidad6;

public class Vocales {

	String palabra;
	
	public Vocales(String palabra) {
		this.palabra = palabra;
	}
	
	
	int cuentaVocales() {
	String vocales = "aeiouAEIOU";
	int contador = 0;
	char letra;
	
	for (int i = 0; i < palabra.length(); i++) {
		for(int j = 0; j <vocales.length(); j++) {
			letra = palabra.charAt(i);
	    if(vocales.charAt(j) == letra) {
	    	contador += 1;
	    }
		}
	}
	
	return contador;
	
	}
}
