package Rectangulo;

public class Rectangulo {

		//ATRIBUTOS
	
	private double base ;
	private double altura ;
	private double area;
	private double perimetro;
	
		//CONSTRUCTOR
	public Rectangulo() {}
	
	public  Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
		//METODOS

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea(double base,double altura) {
		area=this.base*this.altura;
		return area;
	}

	public double getPerimetro(double base,double altura) {
		perimetro=2*(this.base+this.altura);
		return perimetro;
	}

		
	
}
