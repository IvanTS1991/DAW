package actividadespropuestasColecciones;
import java.util.*;
public class PersonaCompareToSetEj9 implements Comparable {

	private int id;
	private int altura;
	private String nombre;

	public PersonaCompareToSetEj9(String nombre, int id, int altura) {
		this.nombre = nombre;
		this.id = id;
		this.altura = altura;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected int getAltura() {
		return altura;
	}

	protected void setAltura(int altura) {
		this.altura = altura;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return this.nombre + " " + this.id + " " + this.altura;
	}

	// METODOS COMPARE TO

	// ORDEN ALFABETICO
	@Override
	public int compareTo(Object o) {
		
		PersonaCompareToSetEj9 nuevaPersona = (PersonaCompareToSetEj9) o;
		
		return this.nombre.compareTo(nuevaPersona.nombre);
	}

	// ORDEN DE ALTURA
	/*public int compareTo(Object o) {	
		
		PersonaCompareToSetEj9 p = (PersonaCompareToSetEj9)o;
		
		return p.altura-this.altura;
	}*/
	
		
	// ORDEN ALFABETICO INVERSO
	/*@Override  	
	public int compareTo(Object o) {
		
		PersonaCompareToSet p = (PersonaCompareToSet)o;
	
		return p.nombre.compareTo(this.nombre);
	}*/
	
	
	public static void main (String [] args) {
		
		Set <PersonaCompareToSetEj9> st =new HashSet<>();
		
		SortedSet <PersonaCompareToSetEj9> srtd= new TreeSet<>();
		
		PersonaCompareToSetEj9 pcts = new PersonaCompareToSetEj9("Ivan", 29, 181);
		
		srtd.add(pcts);
		srtd.add(new PersonaCompareToSetEj9("Goliath", 1250, 225));
		srtd.add(new PersonaCompareToSetEj9("Lexintong", 950, 210));
		srtd.add(new PersonaCompareToSetEj9("Brooklyn",1100, 210));
		srtd.add(new PersonaCompareToSetEj9("Demona", 1300, 200));
		
		for(PersonaCompareToSetEj9 p : srtd)
		System.out.println(p);
	}

}
