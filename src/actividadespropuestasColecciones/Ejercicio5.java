package actividadespropuestasColecciones;

import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		
		lista.add(new Alumno("Ivan", 6));
		lista.add(new Alumno("Dani", 7));
		lista.add(new Alumno("Javi", 8));
		lista.add(new Alumno("Juanma", 9));
		lista.add(new Alumno("Roberto", 10));
		
		lista.stream().forEach((f)-> System.out.println(f.getNombre()+ "  "+ f.getNota()));
		
		lista.remove(lista.get(lista.size()-3)); // eliminamos la tercera posicion por ejemplo
		System.out.println("\nLista tras eliminar");
		lista.stream().forEach((h)-> System.out.println(h.getNombre()+ " "+ h.getNota()));
	}

}


