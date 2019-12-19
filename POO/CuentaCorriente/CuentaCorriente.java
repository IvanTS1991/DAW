package CuentaCorriente;

public class CuentaCorriente {
	
			//ATRIBUTOS
	public double saldo;
	public String cuenta = "";
	
	
			//CONSTRUCTORES
	
	public CuentaCorriente() { 
		this.generaCuenta();
	}
	
	
	public CuentaCorriente(double saldo) {
		generaCuenta();
		this.saldo = saldo;
	}
	
	
	private void generaCuenta() {
		for (int i = 0; i < 10; i++) {
			cuenta += (int)(Math.random()*10);
		}
	}
	
	
	
			//METODOS
	
	public String toString() {
	    return "Número de cta: " + cuenta + " Saldo: " + String.format("%.2f", saldo) + " €";
	  }
	
	void ingreso(int dinero) {
	    saldo += dinero;
	  }
	  
	  void cargo(int dinero) {
	    saldo -= dinero;
	  }

	  void transferencia(CuentaCorriente cuentaDestino, int dinero) {
	    saldo -= dinero;
	    cuentaDestino.saldo += dinero;
	  }
	}
