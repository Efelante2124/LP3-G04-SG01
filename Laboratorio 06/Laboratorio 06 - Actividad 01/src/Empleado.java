
public abstract class Empleado implements PorPagar{
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
		super();
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroSeguroSocial = numeroSeguroSocial;
	}

}
