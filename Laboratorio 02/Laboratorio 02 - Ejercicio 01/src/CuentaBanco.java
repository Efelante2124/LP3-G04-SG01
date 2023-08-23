
public class CuentaBanco {
	private String titular;
	private double cantidad;
	
	public CuentaBanco(String titular) {
		super();
		this.titular = titular;
	}

	public CuentaBanco(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public String toString() {
		return "CuentaBanco [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public void ingresar(double cantidad) {
		double cantaux = this.cantidad;
		this.cantidad = this.cantidad + cantidad;
		if (this.cantidad<0) {
			this.cantidad=0;}
	}
	
	public void retirar(double cantidad) {
		double cantaux = this.cantidad;
		this.cantidad = this.cantidad-cantidad;
		if (this.cantidad<0) {
			System.out.println("Solo se puede retirar: "+cantaux);
			this.cantidad=0;}
	}
}
