package actividadespropuestasColecciones;

public class Alumno {
	
	public String nombre;
	public int nota;

		public Alumno(String nombre, int nota) {
			this.nombre=nombre;
			this.nota=nota;
		}
		
		protected String getNombre() {
			return nombre;
		}
		
		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		protected int getNota() {
			return nota;
		}
		
		protected void setNota(int nota) {
			this.nota = nota;
		}
		
		

}
