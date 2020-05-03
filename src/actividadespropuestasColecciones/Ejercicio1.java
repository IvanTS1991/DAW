package actividadespropuestasColecciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ClaseGenerica <Integer> cg1 = new ClaseGenerica<>(8);
		cg1.tipoDeClase();
		
		ClaseGenerica <String> cg2 = new ClaseGenerica<>("salvacion");
		cg2.tipoDeClase();
		
		ClaseGenerica<Character> cg3 = new ClaseGenerica('w');
		cg3.tipoDeClase();
	}

}

class ClaseGenerica <C> {
	
	C objeto;
	
public	ClaseGenerica(C generico) {
		objeto = generico;
		
	}
	
public void tipoDeClase() {
		System.out.println(objeto.getClass().getName());
	}
}

