import java.util.Objects;

public class Goodies{
	private int id;
	private String descripcion;
	private float precio;
	public Goodies(int id, String descripcion, float precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goodies other = (Goodies) obj;
		return Objects.equals(descripcion, other.descripcion) && id == other.id
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio);
	}
}
