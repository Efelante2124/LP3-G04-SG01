
public class Estudiante extends Persona{
	private String carrera;

	public Estudiante(int dni, String nombre, String direccion, String carrera) {
		super(dni, nombre, direccion);
		this.carrera = carrera;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	@Override
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true;
        if (obj == null) 
        	return false;
        if (!super.equals(obj)) 
        	return false;
        Estudiante estudiante = (Estudiante) obj;
        return carrera.equals(estudiante.carrera);
    }
}
