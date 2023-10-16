
public class EmpleadoAsalariado extends Empleado {
	private double salarioSemanal;

	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			double salarioSemanal) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		this.salarioSemanal = salarioSemanal;
	}
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double obtenerMontoPago() {
		return getSalarioSemanal();
	}

	@Override
	public String toString() {
		return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + "]";
	}
	
}
