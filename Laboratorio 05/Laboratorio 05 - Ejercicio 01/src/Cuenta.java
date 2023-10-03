
public class Cuenta {
	private int numero;
	private double saldo;
	
	public Cuenta (int numero, double saldo) {
		this.numero=numero;
		this.saldo=saldo;
	}
	public Cuenta(int numero) {
		this(numero,50);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void retirar(double cantidad) {
		if (cantidad>saldo) {
			System.out.println("Solo hay: "+cantidad);
		}
		else {
			this.saldo=this.saldo-cantidad;
		}
	}
	public void depositar(double cantidad) {
		if(cantidad<0) {
			System.out.println("No se pueden depositar cantidades negativas");
		}
		else {
			this.saldo=this.saldo+cantidad;
		}
	}
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
}
