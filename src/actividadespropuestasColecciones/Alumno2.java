package actividadespropuestasColecciones;

import java.util.Comparator;

public class Alumno2 extends Alumno implements Comparable, Comparator<Alumno2> {
	
	private int id;

	public Alumno2(String nombre, int nota, int id) {
		super(nombre, nota);
		this.id = id;
		
	}
	
	
	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	@Override
	public int compare(Alumno2 o1, Alumno2 o2) {
		
		return 0;
	}


	// ************* COMPARETO POR NOMBRE CRECIENTE *************
	@Override
	public int compareTo(Object o) {
		
		Alumno2 al = (Alumno2) o;
		
		return this.getNombre().compareTo(al.getNombre());
	}
	
	
	// ************* COMPARETO POR ORDEN NOMBRE DECRECIENTE *************
	/*@Override
	public int compareTo(Object o) {
		
		Alumno2 al = (Alumno2) o;
		
		return al.getNombre().compareTo(this.getNombre());
		
	}*/
	
	// ************* COMPARETO POR NOTA CRECIENTE *************
	/*@Override
	public int compareTo(Object o) {
		
		Alumno2 al = (Alumno2) o;
		
		return this.getNota()-al.getNota();
	}*/
	
	// ************* COMPARETO POR NOTA DECRECIENTE *************
	/*	@Override
		public int compareTo(Object o) {
			
			Alumno2 al = (Alumno2) o;
			
			return al.getNota() - this.getNota();
		}*/
}
