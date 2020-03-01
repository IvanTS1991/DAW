package EjercicioCoche;

public class Coche {

	//atributos de la clase
		
	String marca;
	String modelo;
	int kilometrajeTotal = 0;
	
	//constructor vacio
	
	public Coche() {
		
	}
	
	//metodos de la clase
	
	public Coche(String ma, String mo) {
		marca = ma;
		modelo = mo;
		
	}
	
	public void recorre(int km) {
		kilometrajeTotal += km;
	}
	
	public int devuelveKM() {
		return kilometrajeTotal;
	}
}
