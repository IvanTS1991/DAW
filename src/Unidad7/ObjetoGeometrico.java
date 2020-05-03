package Unidad7;

public abstract class ObjetoGeometrico {
	
		// LA CLASE ABSTRACTA LA USARAS CUANDO TENGAS UNA JERARQUIA
	
	private String nombre;
	
	//CONSTRUCTOR
	public ObjetoGeometrico(String nom) {
		nombre = nom;
	}
	
	
	//METODOS
	 abstract public double calcularArea(double radio);
	
	 abstract public double calcularPerimetro(double radio);
	
	public String toString() {
		return nombre;
	}
}
