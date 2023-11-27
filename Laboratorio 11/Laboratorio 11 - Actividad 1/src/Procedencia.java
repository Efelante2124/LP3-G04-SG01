import java.util.Objects;

public class Procedencia {
	private String departamento;
	private String provincia;
	public Procedencia(String departamento, String provincia) {
		super();
		this.departamento = departamento;
		this.provincia = provincia;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Procedencia other = (Procedencia) obj;
		return Objects.equals(departamento, other.departamento) && Objects.equals(provincia, other.provincia);
	}
	
}
