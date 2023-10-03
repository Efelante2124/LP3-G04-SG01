public class Asalariado{
	private String nombre;
	private long dni;
	private int diasVacaciones;
	private double salarioBase;

	public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase){
		this.nombre = nombre;
		this.dni = dni;
		this.diasVacaciones = diasVacaciones;
		this.salarioBase = salarioBase;
	}

	public Asalariado(String nombre, long dni, int diasVacaciones){
		this.nombre = nombre;
		this.dni = dni;
		this.diasVacaciones = diasVacaciones;
	}

	public String getNombre (){
		return this.nombre;
	}

	public long getDni (){
		return this.dni;
	}

	public int getDiasVacaciones (){
		return this.diasVacaciones;
	}

	public void setNombre (String nombre){
		this.nombre = nombre;
	}

	public void setDni (long dni){
		this.dni = dni;
	}

	public void setDiasVacaciones (int diasVacaciones){
		this.diasVacaciones = diasVacaciones;
	}

	public double getSalarioBase (){
		return this.salarioBase;
	}
	public String toString (){
		return "\nEmpleado Asalariado: \nDNI: " + this.dni + "\nNombre: " + this.nombre + "\nVacaciones: " + this.diasVacaciones + "\nSalario: " + this.salarioBase; 
	}
}