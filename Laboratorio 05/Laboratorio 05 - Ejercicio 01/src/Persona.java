import java.util.Scanner;

public class Persona {
	Scanner s1= new Scanner(System.in);
	static int auxC=0;
	static int auxB=0;
	static int auxE=0;
	private int id;
	private char tipoCliente;
	private String codigo;
	private String nombre;
	private Cuenta cuenta;
	public Persona(int id,char tipoCliente, String nombre) {
		super();
		this.id = id;
		this.tipoCliente=tipoCliente;
		this.nombre = nombre;
		System.out.println("Ingrese el numero de la cuenta: ");
		int numero=s1.nextInt(); 
		this.cuenta = new Cuenta(numero);
		this.codigo = setCodigo(tipoCliente);
	}
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.tipoCliente='C';
		this.nombre = nombre;
		System.out.println("Ingrese el numero de la cuenta: ");
		int numero=s1.nextInt();
		this.cuenta = new Cuenta(numero);
		this.codigo = setCodigo(tipoCliente);
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
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public String setCodigo(char tipoCuenta) {
		if (tipoCuenta=='C') {
			int ncodC = 1000+auxC;
			auxC=auxC+1;
			System.out.println(ncodC);
			return tipoCuenta+Integer.toString(ncodC);
		}
		if (tipoCuenta=='B') {
			int ncodB = 5000+auxB;
			auxB=auxB+1;
			System.out.println(ncodB);
			return tipoCuenta+Integer.toString(ncodB);
		}
		if (tipoCuenta=='E') {
			int ncodE = 8000+auxE;
			auxE=auxE+1;
			System.out.println(ncodE);
			return tipoCuenta+Integer.toString(ncodE);
		}
		return "";
	}
	public String getCodigo() {
		return this.codigo;
	}
	public char getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(char tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", tipoCliente=" + tipoCliente + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", cuenta=" + cuenta + "]";
	}
	
	
	
}