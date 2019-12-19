package Circunferencia;

public class Circulo {

	
			//ATRIBUTOS
		public double radio = 2d;  //valor por defecto
		private double pi = 3.141592;
		private  double area;
		
		
			//CONSTRUCTOR
		public Circulo() {}
		
		public Circulo( double radio) {
			this.radio = radio;
		}
		
			//METODOS
		public  double calcularSuperficie(double radio) {
			area = this.pi * (radio*this.radio);
			return area;
		}
		
}
