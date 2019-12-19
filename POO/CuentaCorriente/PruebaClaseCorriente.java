package CuentaCorriente;

public class PruebaClaseCorriente {

	public static void main(String[] args) {

		CuentaCorriente cuenta1 = new CuentaCorriente();
			System.out.println("El numero de cuenta corriente es  " + cuenta1.cuenta); //inicializar el atributo cuenta = " " para que no me de null el primer valor de la cuenta
		
		CuentaCorriente cuenta2 = new CuentaCorriente(1500);
		System.out.println("El numero de cuenta corriente es  " + cuenta2.cuenta);
		
		CuentaCorriente cuenta3 = new CuentaCorriente(6000);
		System.out.println("El numero de cuenta corriente es  " + cuenta3.cuenta);
		
		
		cuenta1.ingreso(2000);
		cuenta1.cargo(55);
		
		cuenta2.cargo(600);
		cuenta2.ingreso(100);
		
		cuenta3.ingreso(75);

		System.out.println(cuenta1.toString()); //atributo saldo en publico para que pueda acceder desde aqui
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());
		cuenta3.transferencia(cuenta1, 1);
		
		
		
		
		System.out.println(cuenta1.toString()); //atributo saldo en publico para que pueda acceder desde aqui
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());
		
		
	}

}
