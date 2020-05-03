package Unidad6;

public class PruebaArrayCadenas {

	public static void main(String[] args) {
		
		ArrayCadenas abc = new ArrayCadenas();
		System.out.print("******************* mostrar sin ordeanr**************");
		System.out.print("\n");
		abc.mostrarArray(abc.Array1);
		abc.ordenarArray(ArrayCadenas.Array1);
		
		System.out.print("******************* mostrar ordenado**************");
		System.out.print("\n");
		abc.mostrarArray(abc.Array1);
		

		
	}
	

}