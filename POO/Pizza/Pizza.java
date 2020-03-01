package Pizza;

public class Pizza {

		//ATRIBUTOS
	private String tama�o;
	private String tipo;
	private String estado;
	public static int totalPedidos = 0;
	public static int totalServidos = 0;
	
		//CONSTRUCTORES
	public Pizza() {}
	
	public Pizza(String tama�o, String tipo) {
		this.tama�o = tama�o;
		this.tipo = tipo;
		this.estado = "pedida";
		totalPedidos++;
		
	}
	
	
	//METODOS

		public String toString() {
			return "Pizza " + this.tipo + " " + this.tama�o +  " " + this.estado;
		}

		public static int gettotalPedidos() {
			return Pizza.totalPedidos;
		}
		
		public static int gettotalServidos() {
			return Pizza.totalServidos;
		}
		
		public void servir() {
			if (this.estado == "pedida") {
				this.estado = "servida";
				Pizza.totalServidos++;
			} else {
				System.out.println(" esa pizza ya ha sido servida");
			}
		}
}