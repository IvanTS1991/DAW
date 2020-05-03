package actividadespropuestasColecciones;

import java.util.*;

public class ListaEnlazada <L> {
	
	ArrayList<L> listenlace = new ArrayList<>();
	
	public void insertarPrincipio(L comienzo) {
		
		listenlace.add(0,comienzo);
			
	}
	
	public void insertaFinal(L comienzo) {
		
		listenlace.add(comienzo);
	}
	
	public void buscar(L objeto) {
		
		if(listenlace.contains(objeto)) {
			
			System.out.println("Existe");
			
		}else {
			
			System.out.println("No existe");
		}
	}
	
	public void mostrarLista() {
		
		listenlace.forEach((le)-> System.out.println(le));
	}
	
	public void eliminarNodo(int delete) {
		
		if(delete >= listenlace.size()) {
			
			System.out.println("Tamaño demasiado grande");
			
		}else {
			
		listenlace.remove(delete);
		
		}
	}

}
