package Complejo;

public class Complejos {
		
		//atributos
	double real;
	double imag;
	
		//constructores
	public Complejos () {
		real = 0.0;
		imag = 0.0;
	}
	
	public Complejos (double real, double imag ) {
		this.real = real;
		this.imag = imag;
	}
	
		//metodos  get
	public double consulta_Real() {
		return real;
	}
	
	public double consulta_Imag() {
		return imag;
	}
		//set
	public void cambia_Real(double real) {
		this.real = real;
	}
	
	public void cambio_Imag(double imag) {
		this.imag = imag;
	}
	
	public String toString() {
		String str = real + " + " + imag + "i";
		return str;
	}
	
	public void sumar(Complejos b) {
		this.real +=  b.real;
		this.imag += b.imag;
	}
}
