package Unidad5;

public class Libro2 {

	//ATRIBUTOS
		public String titulo;
		public String autor;
		public int codigo;
		public int numeroEjemplares;
		public int numeroEjemplaresPrestados;
	
	//CONSTRUCTORES
		public Libro2() {}
		
		public Libro2(String titulo, String autor, int codigo, int numeroEjemplares) {
			this.titulo = titulo;
			this.autor = autor;
			this.codigo = codigo;
			this.numeroEjemplares = numeroEjemplares;
			numeroEjemplaresPrestados++;
		}

		
		
		
	//METODOS
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public int getNumeroEjemplares() {
			return numeroEjemplares;
		}

		public void setNumeroEjemplares(int numeroEjemplares) {
			this.numeroEjemplares = numeroEjemplares;
		}

		public int getNumeroEjemplaresPrestados() {
			return numeroEjemplaresPrestados;
		}

		public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
			this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
		}
		
		public boolean prestar() {
			boolean prestamo = true;
			if(numeroEjemplaresPrestados < numeroEjemplares ) {
				numeroEjemplaresPrestados++;
			} else {
				prestamo = false;
			}
			return prestamo;
		}
		
		public boolean devolver() {
			boolean devolucion = true;
			if(numeroEjemplaresPrestados == 0) {
				devolucion = false;
			} else {
				numeroEjemplaresPrestados--;
			}
			return devolucion;
		}
}
