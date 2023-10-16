
public class Prestamo implements PorPagar {
	private int nroCuotas;
	private double montoCuotas;
	public Prestamo(int nroCuotas, double montoCuotas) {
		super();
		this.nroCuotas = nroCuotas;
		this.montoCuotas = montoCuotas;
	}
	public int getNroCuotas() {
		return nroCuotas;
	}
	public void setNroCuotas(int nroCuotas) {
		this.nroCuotas = nroCuotas;
	}
	public double getMontoCuotas() {
		return montoCuotas;
	}
	public void setMontoCuotas(double montoCuotas) {
		this.montoCuotas = montoCuotas;
	}
	@Override
	public double obtenerMontoPago() {
		return getNroCuotas()*getMontoCuotas();
	}
	@Override
	public String toString() {
		return "Prestamo [nroCuotas=" + nroCuotas + ", montoCuotas=" + montoCuotas + "]";
	};
	
}
