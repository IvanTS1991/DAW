package actividadespropuestasColecciones;

public class Ejercicio8PruebaListadoPersonas {

	public static void main(String[] args) {
		
		ListadoPersonas2 lista2 = new ListadoPersonas2();
		
		lista2.list.add(new Persona("Thor","Rey Trueno",1000));
		lista2.list.add(new Persona("Ironman","Tony Stark",1980));
		lista2.list.add(new Persona("Hulk"," Bruce Banner",1986));
		lista2.list.add(new Persona("ViudaNegra","Natasha Romanov",1987));
		lista2.list.add(new Persona("Spiderman","Peter Parker",1992));
		
		
		lista2.buscarPorNombre("Hulk");
		lista2.buscarApe("Tony");
		lista2.buscarApeCadena("Natasha Romanov");
		lista2.buscarNacimiento(1992);
	}

}
