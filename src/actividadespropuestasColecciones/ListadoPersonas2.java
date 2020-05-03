package actividadespropuestasColecciones;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListadoPersonas2 {
		
	 static Persona personita = null;
	 static ArrayList <Persona> list = new ArrayList<>();
	
	 public ListadoPersonas2() {
		
	}
	 
	 public static void buscarPorNombre(String nombre) {

			for (Persona p : list) {

				if (p.nombre.contentEquals(nombre)) {

					System.out.println("El nombre " + nombre + " se en cuentra en la lista");
					personita = p;

				}
			}
			
			if (nombre.isEmpty()) {
				
				System.out.println("El campo esta vacio , ingrese un nombre");
			}
			
		}

		public static void buscarApe(String apellido) {

			Pattern pp = Pattern.compile(apellido);

			for (Persona p : list) {
				
				Matcher mm = pp.matcher(p.apellidos);
				
				if (mm.find()) {
					
					personita = p;
					System.out.println("El apellido " + apellido + " se encuentra en la lista.");
				}

			}
			if (apellido.equals(null)) {
				
				System.out.println("No hay nadie con ese apellido. Busca mejor.");
			}

		}

		public static void buscarApeCadena(String apellido2) {
			
			Pattern pp = Pattern.compile(apellido2);

			for (Persona p : list) {
				
				Matcher mm = pp.matcher(p.apellidos);
				
				if (mm.find()) {
					
					personita = p;
					System.out.println("Los apellidos " + apellido2 + " se encuentran en la lista.");
				}

			}
			if (apellido2.equals(null)) {
				
				System.out.println("No hay nadie con ese apellido. Busca mejor.");
			}

		}

		public static void buscarNacimiento(int año) {
			
			for (Persona p : list) {
				
				if (p.añoNacimiento == año) {
					personita = p;
					System.out.println("Se ha encontrado el año " + año + " en la lista.");
				
			}
			
			if (p.equals(null)) {
				System.out.println("No hay nadie con ese año de nacimiento");
			}

		}

		}
		
		public static void main(String[] args) {
			
			ListadoPersonas lp = new ListadoPersonas();
			ListadoPersonas.list.add(new Persona("Ivan", "Tapetado Silva" , 1991));
			ListadoPersonas.list.add(new Persona("Daniel","Arroyo Torvisco", 1988));
			ListadoPersonas.list.add(new Persona("Juanma","Moyano Ceballos", 1986));
			ListadoPersonas.list.add(new Persona("Javier","Barbero Siesto", 1991));
			ListadoPersonas.list.add(new Persona("Roberto","Mendoza Ballesteros", 1991));
			
			
			ListadoPersonas.buscarPorNombre("");
			ListadoPersonas.buscarApe("Moyano");
			ListadoPersonas.buscarApeCadena("Mendoza Ballesteros");
			ListadoPersonas.buscarNacimiento(1988);
		
			

		}

}
