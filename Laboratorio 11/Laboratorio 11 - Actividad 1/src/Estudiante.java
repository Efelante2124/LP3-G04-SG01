import java.util.Objects;

public class Estudiante extends Persona implements Contenedera{
	private String especialidad;
	private Procedencia procedencia;
	public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
		super(nombre, direccion, telefono);
		this.especialidad = especialidad;
		this.procedencia = procedencia;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public Procedencia getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(Procedencia procedencia) {
		this.procedencia = procedencia;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(especialidad, other.especialidad) && Objects.equals(procedencia, other.procedencia);
	}
	@Override
    public boolean contiene(Object obj) {
        if (obj instanceof Estudiante) {
            Estudiante otroEstudiante = (Estudiante) obj;
            return super.contiene(obj) && this.getProcedencia().equals(otroEstudiante.getProcedencia());
        }
        return false;
    }
}
