package actividadespropuestasColecciones;

public class Ejercicio14PruebaLinkedList {
	
	public static void main(String[] args) {
		
		ListaEnlazada list = new ListaEnlazada();
		
		list.insertarPrincipio("programacion");
		
		Persona p = new Persona("Tony", "Montana", 1970);
		
		list.insertarPrincipio(new Persona ("Al", "Paccino", 1940));
		
		list.insertaFinal(p);
		
		for(int i= 0; i<list.listenlace.size();i++) {
			
			System.out.println(list.listenlace.get(i));
		}
		
		list.buscar("programacion");
		
		list.buscar(new Persona ("Tony", "Montana", 1970));
		
		list.insertaFinal("Petito");
		
		list.eliminarNodo(2);
		
		list.mostrarLista();
		
		System.out.println(list);
	}

}
