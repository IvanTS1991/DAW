package Unidad6;


public class ArrayCadenas {
	
	//ATRIBUTOS
	public static String letras[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q","r","s","t", "u", "w", "x", "y", "z"};
	public static String[] Array1 = {"Pepe", "Ana", "Carlos"};
	public static String[] Array2 = {"Cristina", "Monica", "Jose"};
	public static String[] SumArray = new String[6];
	public static String ordenar = "";
	 
	
	//CONSTRUCTORES
	public ArrayCadenas() {}
	
	//METODOS
	 static void mostrarArray(String[] mostArray) {
		for(int i=0; i < Array1.length; i++){
            System.out.print(Array1[i] + " " );
            System.out.print(Array2[i] + " ");
        }
		
	}
	
	
	 static String[] ordenarArray(String[] array) {
		for(int j=0; j < Array1.length ;j++) {
           for(int i=0; i < Array2.length-1; i++) {
                if (array[i].charAt(0)>array[i+1].charAt(0)) {
                    ordenar=array[i];
                   array[i]=array[i+1];
                   letras[i+1]=ordenar;
               }
            }
        }
		return array;
		
	}
	
	static String[] fusionarArray(String[] fusion) {
		for(int i=0;i<Array1.length;i++) {
			SumArray[i]=Array1[i];	
	}
		int s=3;	
		while (s<SumArray.length) {
			for(int a=0;a<Array2.length;a++) {
				SumArray[s]=Array2[a];
					s++;
			}
		}
		return SumArray;		
	}
	
} 
