import java.util.Scanner;

public class Persona {
	Scanner s1= new Scanner(System.in);
	private int id;
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	public Persona(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("Ingrese el numero de la cuenta: ");
		int numero=s1.nextInt();
		this.cuenta = new Cuenta(numero);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cuenta=" + cuenta + "]";
	}
	
	
}
