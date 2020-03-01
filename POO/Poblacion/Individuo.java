package Poblacion;

public class Individuo {
	
		//ATRIBUTOS
	
	private String dni;
	private String nombre;
	private int fechaNacimiento;
	public static int poblacion = 0;
	
	
		//CONSTRUCTOR (NUNCA REPETIR CONSTRUCTORES)
	
	public Individuo() {}
	
	public Individuo(String dni, String nombre, int fechaNacimiento ) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		poblacion++;
		
	}
		//METODOS GET Y SET
	public static int getPoblacion() {
		return poblacion;
	}	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
