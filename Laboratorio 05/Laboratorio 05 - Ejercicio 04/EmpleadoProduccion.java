public class EmpleadoProduccion extends Asalariado{
	private String turno;
	private double salarioBase;

	public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno, double salarioBase){
		super(nombre, dni, diasVacaciones);
		this.salarioBase = salarioBase + salarioBase*(15.0/100.0);
		this.turno = turno;
	}

	public String getTurno (){
		return this.turno;
	}

	public void setTurno (String turno){
		this.turno = turno;
	}

	
	public String toString (){
		return "\nEmpleadoProduccion: \nDNI: " + this.getDni() + "\nNombre: " + this.getNombre() + "\nVacaciones: " + this.getDiasVacaciones() + "\tTurno: " + this.turno + "\nSalario: " + this.salarioBase;
	}
}