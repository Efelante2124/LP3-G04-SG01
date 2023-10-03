import java.util.ArrayList;

public class Tienda {
	private String nombre;
	private String owner;
	private int id;
	public ArrayList<Computadora> inventario=new ArrayList<Computadora>();
	public Tienda(String nombre, String owner, int id) {
		super();
		this.nombre = nombre;
		this.owner = owner;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Computadora> getInventario() {
		return inventario;
	}
	public void setInventario(ArrayList<Computadora> inventario) {
		this.inventario = inventario;
	}
}
