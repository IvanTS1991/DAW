package actividadespropuestasColecciones;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		ListadoPersonas lp = new ListadoPersonas();
		ListadoPersonas.list.add(new Persona("Ivan", "Tapetado Silva" , 1991));
		ListadoPersonas.list.add(new Persona("Daniel","Arroyo Torvisco", 1988));
		ListadoPersonas.list.add(new Persona("Juanma","Moyano Ceballos", 1986));
		ListadoPersonas.list.add(new Persona("Javier","Barbero Siesto", 1991));
		ListadoPersonas.list.add(new Persona("Roberto","Mendoza Ballesteros", 1991));
		
		
		ListadoPersonas.buscarPorNombre("");
		ListadoPersonas.buscarApe("Moyano");
		ListadoPersonas.buscarApeCadena("Mendoza Ballesteros");
		ListadoPersonas.buscarNacimiento(1988);
	
		

	}

}
