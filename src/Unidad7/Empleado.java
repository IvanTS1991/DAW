package Unidad7;

public abstract class Empleado {
	
	protected double salario;
	
	public Empleado () {
		this.salario = 1000;
	}
	
	abstract public void calcularNomina();
}
