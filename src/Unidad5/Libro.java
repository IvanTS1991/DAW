package Unidad5;

public class Libro {
	
		//ATRIBUTOS
	private String titulo;
	private String autor;
	private int codigo;
	private boolean prestado;
	
		//CONSTRUCTORES
	public Libro() {}
	
	public Libro(String titulo, String autor, int codigo, boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = codigo;
		this.prestado = prestado;
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

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void prestar() {
		this.prestado = true;
	}
	
	public void devolver() {
		this.prestado = false;
	}
}
