public class EmpleadoDistribucion extends Asalariado{
	private String region;
	private double salarioBase;
	public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region, double salarioBase){
		super(nombre,dni,diasVacaciones);
		this.salarioBase = salarioBase + salarioBase*(10.0/100.0);
		this.region = region;
	}

	public String getRegion (){
		return this.region;
	}

	public void setRegion (String region){
		this.region = region;
	}

	public String toString (){
		return "\nEmpleadoDistribucion: \nDNI: " + this.getDni() + "\nNombre: " + this.getNombre() + "\nVacaciones: " + this.getDiasVacaciones() + "\tRegion: " + this.region + "\nSalario: " + this.salarioBase;
	}
}