package actividadespropuestasColecciones;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListadoPersonas {

	static Persona personita = null;
	static ArrayList<Persona> list = new ArrayList<>();


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

	public static void buscarNacimiento(int a�o) {
		
		for (Persona p : list) {
			
			if (p.a�oNacimiento == a�o) {
				personita = p;
				System.out.println("Se ha encontrado el a�o " + a�o + " en la lista.");
			
		}
		
		if (p.equals(null)) {
			System.out.println("No hay nadie con ese a�o de nacimiento");
		}

	}

	}
	
}
