package Unidad7;

public class Libro extends Biblioteca implements Prestable{
	 
		private boolean prestado=false;
		public void presta() {
		prestado=true;
		}
		public void devuelve() {
		prestado=false;
		}

		public boolean estaPrestado() {
			return prestado;
		}
		
}

