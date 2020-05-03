package Unidad7;

import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;

public class Profesor extends Persona {

	protected String especialidad;
	protected double salario;

	public String getEspecialidad() {
		return "Su especialidad es: " + especialidad;
	}

	//CONSTRUCTOR EXTENDS DE CLASE PADRE
	
	public Profesor (String nombre, String apellidos, GregorianCalendar fechaNacim, String especialidad, double salario) {
			 super (nombre, apellidos, fechaNacim);
			 this.especialidad= especialidad;
			 this.salario= salario;
		}
	
	public double getSalario() {
		return salario;
	}
	
	@Override
	public String getNombre() {
		return "Nombre del profesor: " + nombre;
	}
	
	@Override
	public String getApellidos() {
		return "Apellidos del profesor: " + apellidos;
	}
	
	@Override
	public GregorianCalendar getFechaNacim() {
		return this.fechaNacim;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public void setESpecialidad(String especialidad) {
		this.especialidad = especialidad;
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
	
	// Redefinición de métodos abstractos heredados
	 @Override
	public void mostrar () {
		 
	 SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	 String Stringfecha= formatoFecha.format(this.fechaNacim.getTime());
	 
	 System.out.printf ("Nombre: %s\n", this.nombre);
	 System.out.printf ("Apellidos: %s\n", this.apellidos);
	 System.out.printf ("Fecha de nacimiento: %s\n", Stringfecha);
	 System.out.printf ("Especialidad: %s\n", this.especialidad);
	 System.out.printf ("Salario: %7.2f euros\n", this.salario);
	 
	 }
	
}
	
//	public void mostrar () {
//		super.mostrar (); // Llamada al método “mostrar” de la clase padre
//		
//		// A continuación mostramos la información “especializada” de esta subclase
//		 System.out.printf ("Especialidad: %s\n", this.especialidad);
//		 System.out.printf ("Salario: %7.2f euros\n", this.salario);
//		}
//}
