package actividadespropuestasColecciones;

import java.util.*;

public class Ejercicio13PruebaAlumno {

	public static void main(String[] args) {


		ArrayList<Alumno2> people = new ArrayList<>();
		
		people.add(new Alumno2("rafiki", 5, 12));
		people.add(new Alumno2("nina", 8 ,69));
		people.add(new Alumno2("kevin", 9, 10));
		people.add(new Alumno2("marvin", 3, 150));
		people.add(new Alumno2("kratos", 10 , 2000));
		people.add(new Alumno2("alpha5", 10, 1000));
		
		
		Collections.sort(people);
		
		for ( Alumno2 alum : people) {
			
			System.out.println("El alumno " + alum.getNombre() + " tiene una nota de " + alum.getNota()+ " y su id es " + alum.getId());
			
		}

	}

}
