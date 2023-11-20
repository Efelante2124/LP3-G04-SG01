public class Persona{
	protected String nombre;
	protected String telefono;
	protected String direccion;

	public Persona(String nombre, String telefono, String direccion){
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String toString(){
		return this.nombre + "\t" + this.telefono + "\t" + this.direccion + "\n";
	}
}