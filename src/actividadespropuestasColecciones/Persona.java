package actividadespropuestasColecciones;

public class Persona {

	//atributos
	
	String nombre, apellidos;
	int aņoNacimiento;
	
	//constructor
	
	public Persona(String nombre, String apellidos, int aņoNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.aņoNacimiento = aņoNacimiento;
	}

	//metodos
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getAņoNacimiento() {
		return aņoNacimiento;
	}

	protected void setAņoNacimiento(int aņoNacimiento) {
		this.aņoNacimiento = aņoNacimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + aņoNacimiento;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (aņoNacimiento != other.aņoNacimiento)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



}
