package Pizza;

public class PruebaPizza {

	public static void main(String[] args) {
		
		Pizza pedido1 = new Pizza("cuatro quesos", "Familiar");
		System.out.println("El pedido " + pedido1.gettotalPedidos() + " ha sido registrado." + pedido1.toString() ); 
		
		Pizza pedido2 = new Pizza("Fungui", "Mediana");
		System.out.println("El pedido " + Pizza.totalPedidos + " ha sido registrado." + pedido2.toString());
		pedido2.servir();
		
		Pizza pedido3 = new Pizza("Fungui", "Mediana");
		System.out.println("El pedido " + Pizza.totalPedidos + " ha sido registrado." + pedido3.toString());
		pedido2.servir();
		
		Pizza pedido4 = new Pizza("Margarita", "Familiar");
		System.out.println("El pedido " + Pizza.totalPedidos + " ha sido registrado." + pedido4.toString());
		pedido1.servir();
		
		
		Pizza pedido5 = new Pizza("Margarita", "Familiar");
		System.out.println("El pedido " + Pizza.totalPedidos + " ha sido registrado." + pedido5.toString());
		pedido2.servir();
		
		
		System.out.println("El total de pedidos ha sido de : " + Pizza.totalPedidos);
		System.out.println("Las pizzas servidas han sido : " + Pizza.totalServidos);
		
	}

}
