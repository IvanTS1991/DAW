package Unidad7;

public class Circunferencia implements Geometria{

	private double radio;
		
		//CONSTRUCTOR	
	public Circunferencia(double radio) {
			this.radio = radio;
		}

		@Override
		public double calcularArea() {
			return Math.PI * radio * radio;
		}

		@Override
		public double calcularPerimetro() {
			return 2 * Math.PI * radio;
		}
}
