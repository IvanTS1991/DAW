package Unidad7;

public class Circulo extends ObjetoGeometrico{
	
	private double radio;
	
	public Circulo(String nom, double r) {
		super(nom); // super llama al constructor de la clase padre
		radio = r;
	}
	
	public Circulo() {
		this("circulo estandar", 1.0);  //this llama al constructor de arriba
		
	}
	

	@Override
	public double calcularArea(double radio) {
		return radio * radio * Math.PI;
	}

	@Override
	public double calcularPerimetro(double radio) {
		return 2 * Math.PI * radio;
		
	}
	
	
	public String toString() {
		return "Nombre = " + super.toString() + " radio(constructor) = " + radio; // super llama a los metodos de la clase padre
	}


}
