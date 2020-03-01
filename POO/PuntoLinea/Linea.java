package PuntoLinea;

public class Linea {
	
	
		//ATRIBUTOS
	private Punto uno;
	private Punto dos;

		//CONSTRUCTORES
	  public Linea(Punto uno, Punto dos) {
	    this.uno = uno;
	    this.dos = dos;
	  }

	  	//METODOS
	  public String toString() {
	    return "Línea formada por los puntos " + uno + " y " + dos;
	  }
}
