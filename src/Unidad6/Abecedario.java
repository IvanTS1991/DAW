package Unidad6;

public class Abecedario {
	
	//ATRIBUTOS

			private int[] contador = new int[32];
			private char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','á','é','í','ó','ú'};
			private String frase;


	//CONSTRUCTOR

			public Abecedario() {}


	//METODOS

		
				//contador de letras 
			public int[] cuentaVocales() {
				for(int i = 0; i < frase.length(); i++) {
					for(int j = 0; j < letras.length; j++) {
						if(frase.charAt(i) == letras[j]) {
							this.contador[j]++;
						}
					}
				}
				return contador;
			}

			
	// imprime  array

			public void imprimeArray(int[] array ) {
				for(int i = 0; i < array.length; i++) {
					System.out.println("La letra "+this.letras[i]+" se repite "+array[i]+" veces.");
				}
			}



	//pasa letras a minusculas

			public void pasarMinusculas(String frase) {
				this.frase = frase.toLowerCase();
			}


			public String getFrase() {
				return frase;
			}


			public void setFrase(String frase) {
				this.frase = frase;
			}

}