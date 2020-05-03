package actividadespropuestasColecciones;

import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Map<Integer,String> equipo = new LinkedHashMap<Integer, String>();
		
		equipo.put(1, "Casillas");
		equipo.put(15, "Ramos");
		equipo.put(3, "Pique");
		equipo.put(5, "Puyol");
		equipo.put(11, "Capdevila");
		equipo.put(14, "Xabi_Alonso");
		equipo.put(16, "Busquets");
		equipo.put(8, "Xavi_Hernandez");
		equipo.put(18, "Pedrito");
		equipo.put(6, "Iniesta");
		equipo.put(7, "Villa");
		
		// Mostrando el LinkedHashMap
		
		for (Map.Entry<Integer, String> esp : equipo.entrySet()) {
			
			Integer dorsal = esp.getKey(); // ALMACENAMOS LA CLAVE
			
			String nombre = esp.getValue(); // ALMACENAMOS EL VALOR
			
			System.out.println("\nDorsal = " + dorsal + " , Nombre= " + nombre);
			
		}
		
		System.out.println("\n************** TRABAJANDO CON LOS METODOS DE TREEMAP **************\n");
		
		System.out.println("Mostramos el nº de elementos que tiene el hashMap con el metodo .size():\t" + equipo.size() + "\n");
		
		System.out.println("Vemos si el hashMap esta vacio .isEmpty():\t" + equipo.isEmpty() + "\n");
		
		System.out.println("Obtenemos un elemento del Map pasandole la clave 6 .get(6):\t" + equipo.get(6) + "\n");
		
		System.out.println("Borramos un elemento del Map el 18 .remove(18):\t" + equipo.remove(18) + "\n");
		
		System.out.println("Veamos que pasa si queremos obtener la clave 18 que ya no existe:\t" + equipo.get(18) + "\n");
		
		System.out.println("Veamos si existe un elemento con la clave 18 .constainsKey():\t" + equipo.containsKey(18) + "\n");
		
		System.out.println("Veamos si existe un elemento con la clave 1 .constainstKey(1):\t" + equipo.containsKey(1) + "\n");
		
		System.out.println("Veamos si existe el valor Villa en el Map .constaintValue():\t" + equipo.containsValue("Villa") + "\n");
		
		System.out.println("Veamos si existe el valor Pele .constainsValue():\t" + equipo.containsValue("Pele") + "\n");
		
		System.out.println("Borramos todos los elementos del Map .clear()\n");
		equipo.clear();
		
		System.out.println("Comprobamos que se han borrado todos los elementos del Map .size():\t" + equipo.size() + "\n");
		
		System.out.println("Lo comprobaos tambien viendo si esta vacio .isEmpty():\t" + equipo.isEmpty());

	}

}
