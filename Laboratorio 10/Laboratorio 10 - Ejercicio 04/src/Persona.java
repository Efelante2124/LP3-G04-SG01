
public class Persona {
	private int dni;
	private String nombre;
	private String direccion;
	public Persona(int dni, String nombre, String direccion) {
		super();
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
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true;
        if (obj == null ) 
        	return false;
        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre);
    }
}
