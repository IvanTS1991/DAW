package Unidad7;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public abstract class Persona {

	 protected String nombre;
	 protected String apellidos;
     protected GregorianCalendar fechaNacim;
	
	//CONSTRUCTOR EJEMPLO FINALIZE PARA SUBCLASE
	
	public Persona (String nombre, String apellidos, GregorianCalendar fechaNacim) {
		 this.nombre= nombre;
		 this.apellidos= apellidos;
		 this.fechaNacim = (GregorianCalendar) fechaNacim.clone();
		}
	

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public GregorianCalendar getFechaNacim() {
		return this.fechaNacim;
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
	
	// METODO ABSTRACTO 
	// MOSTRAR PARA LLAMARLO EN SUBCLASES CON " SUPER "
	
	protected abstract void mostrar (); // No se define: es abstracto. Ya lo harán sus subclases.

	
//	public void mostrar () {  SI NO FUERA ABSTRACT CLASS SERIA ASI
//		 SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
//		 
//		 String Stringfecha= formatoFecha.format(this.fechaNacim.getTime());
//		 
//		 System.out.printf ("Nombre: %s\n", this.nombre);
//		 System.out.printf ("Apellidos: %s\n", this.apellidos);
//		 System.out.printf ("Fecha de nacimiento: %s\n", Stringfecha);
		 
		}


