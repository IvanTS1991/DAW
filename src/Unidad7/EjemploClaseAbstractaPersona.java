package Unidad7;

import java.util.GregorianCalendar;

public class EjemploClaseAbstractaPersona {

	public static void main(String[] args) {
		
		/**Ejemplo de uso de clases abstractas y métodos abstractos
		
		 Declaración de objetos de las clases Persona, Profesor y Alumno*/
		 
		 Persona pers1, pers2;
		 Alumno al1, al2;
		 Profesor prof1, prof2;
		 
		 //pers1= new Persona (); --> Error: una clase abstracta no puede ser instanciada
		 
		 al1= new Alumno ("Ivan", "Tapetado", new GregorianCalendar (1991, 7, 29), "1DAW", 5);
		 prof1= new Profesor ("Ivan", "Jimenez", new GregorianCalendar (1970, 8, 15), "Programacion", 1000);
		
		 /** Llamada a métodos abstractos en la clase Persona
		  Pero heredados y definidos en las clases Profesor y en Alummno */
		 
		 al1.mostrar();
		 System.out.println();
		 prof1.mostrar();
		 
		 

	}

}
