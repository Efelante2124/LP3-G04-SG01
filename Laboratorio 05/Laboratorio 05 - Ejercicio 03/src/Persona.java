
public class Persona {
	private int id;
	private String nombre;
	private char tipoCliente;
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.tipoCliente='C';
	}
	public Persona(int id, String nombre,char tipoCliente) {
		this.id = id;
		this.nombre = nombre;
		this.tipoCliente=tipoCliente;
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
	public char getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(char tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", tipoCliente=" + tipoCliente + "]";
	}
	
}