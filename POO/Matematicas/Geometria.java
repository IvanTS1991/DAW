package Matematicas;

public class Geometria {
			
		//ATRIBUTOS
	public static double volumen;
	public static double longitud;
	public double pi = 3.141592;
	public double radio;
	public double altura;
	public double cilindro;
	
	
		//CONSTRUCTORES
	public Geometria() {}
	
	
	
	public Geometria(double volumen, double longitud, double pi, double radio, double altura, double cilindro) {  //no haria falta en este ejercicio
		this.volumen = volumen;
		this.longitud = longitud;
		this.pi = pi;
		this.radio = radio;
		this.altura = altura;
		this.cilindro = cilindro;
	}

		//METODOS

	public void Cinlindro (double volumen, double longitud) {
		this.volumen = volumen;
		this.longitud = longitud;
	}
	
		
		
	public static double volumenCilindro(double pi, double radio, double altura) {
		return volumen = pi * (radio*radio) * altura;
		
		
	}
	
	public static double longitudCircunferencia(double pi, double radio) {
		return longitud = 2 * (pi *radio);
	}
		

}
