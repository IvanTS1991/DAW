package Unidad7;

import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;

public class Alumno extends Persona {

	protected String grupo;
	protected double notaMedia;

	// CONSTRUCTOR EXTENDS DE CLASE PADRE

	public Alumno(String nombre, String apellidos, GregorianCalendar fechaNacim, String grupo, double notaMedia) {
		super(nombre, apellidos, fechaNacim);
		this.grupo = grupo;
		this.notaMedia = notaMedia;
	}

	@Override
	public String getNombre() {
		return "Nombre del alumno: " + nombre;
	}

	public String getApellidos() {
		return "Apellidos del alumno: " + apellidos;
	}

	public GregorianCalendar getFechaNacim() {
		return this.fechaNacim;
	}

	public String getGrupo() {
		return "Grupo: " + grupo;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setFechaNacim(GregorianCalendar fechaNacim) {
		this.fechaNacim = fechaNacim;

	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	// Redefinición de métodos abstractos heredados
	@Override
	 public void mostrar () {
	 
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		String Stringfecha= formatoFecha.format(this.fechaNacim.getTime());
	 
		System.out.printf ("Nombre: %s\n", this.nombre);
		System.out.printf ("Apellidos: %s\n", this.apellidos);
		System.out.printf ("Fecha de nacimiento: %s\n", Stringfecha);
		System.out.printf ("Grupo: %s\n", this.grupo);
		System.out.printf ("Nota media: %5.2f\n", this.notaMedia);
	}
}
//	public void mostrar () { 
//		super.mostrar ();    // Llamada al método “mostrar” de la clase padre
//		
//		// A continuación mostramos la información “especializada” de esta subclase
//		System.out.printf ("Grupo: %s\n", this.grupo);
//		 System.out.printf ("Nota media: %5.2f\n", this.notaMedia);
//		}

