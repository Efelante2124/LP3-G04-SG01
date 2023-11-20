
public class Persona implements Comparable<Persona>{
	private int dni;
	private String nombre;
	private String direccion;
	public Persona(int dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	@Override
	public int compareTo(Persona p) {
	    if(nombre.compareTo(p.getNombre())>0){
	        return 1;
	    }
	    else {
	    	return -1;
	    }
	}
}
