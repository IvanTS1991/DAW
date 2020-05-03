package Unidad7;

public class EmpleadoFijo extends Empleado {
	

	@Override
	public void calcularNomina() {
		this.salario = this.salario + 100;
	}
	
	public static void main(String[] args) {
		
		EmpleadoFijo ef1 = new EmpleadoFijo();
		
		ef1.calcularNomina();
		
		System.out.println("El salario de un empleado fijo sera: " + ef1.salario + " €");
		
	}
}
