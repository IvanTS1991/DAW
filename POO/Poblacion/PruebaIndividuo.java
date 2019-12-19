package Poblacion;

public class PruebaIndividuo {

	public static void main(String[] args) {
		
		System.out.println(Individuo.getPoblacion());
		
		Individuo i1 = new Individuo("111f", "Ivan", 30);
		System.out.println(Individuo.getPoblacion());
		
		Individuo i2 = new Individuo("222a", "Tamara", 30);
		System.out.println(Individuo.getPoblacion());
		
		
		
	}

} 