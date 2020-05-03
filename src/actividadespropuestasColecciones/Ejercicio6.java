package actividadespropuestasColecciones;
import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(3);
		num.add(75);
		num.add(9);
		num.add(15);
		num.add(17);
		num.add(5);
		num.add(45);
		num.add(52);
		num.add(6);
		num.add(1);
		
		System.out.println("En orden de insertacion: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		Collections.sort(num);
		
		System.out.println("\nLista ordenada: ");
		num.forEach((a)-> System.out.print(a + " "));
		
		System.out.println();
		
		System.out.println("\nLista invertida: ");
		
		Collections.reverse(num);
		
		for(int list : num) {
			System.out.print(list + " ");
		}
		
	}

}
