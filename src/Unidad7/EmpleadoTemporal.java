package Unidad7;

public class EmpleadoTemporal extends Empleado {
	
	@Override
	public void calcularNomina() {
		this.salario = this.salario + 50;
	}
	
	public static void main(String[] args) {
		
		EmpleadoTemporal et1 = new EmpleadoTemporal();
		
		et1.calcularNomina();
		
		System.out.println("El sueldo de un empleado temporal sera: " + et1.salario + " €");
	}
}
