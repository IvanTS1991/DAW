package Unidad7;

public class EmpleadoComercial extends Empleado {

	@Override
	public void calcularNomina() {
		this.salario = this.salario + 75;
	}
	
	public static void main(String[] args) {
		
		EmpleadoComercial ec1 = new EmpleadoComercial();
		
		ec1.calcularNomina();
		
		System.out.println("El sueldo de un empleado comercial sera: " + ec1.salario + " €");
		
	}
}
