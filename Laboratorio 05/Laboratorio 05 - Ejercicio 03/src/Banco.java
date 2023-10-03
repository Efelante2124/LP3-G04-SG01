import java.util.Arrays;

public class Banco {
	private String nombre;
	private Persona clientes[];
	public Banco(String nombre) {
		this (nombre,20);
	}
	public Banco(String nombre, int numGli) {
		this.nombre = nombre;
		this.clientes = new Persona[numGli];
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona[] getClientes() {
		return clientes;
	}
	public void setClientes(Persona[] clientes) {
		this.clientes = clientes;
	}
	public void agregarCliente (Persona persona) {
		for (int i =0;i<clientes.length;i++) {
			if (clientes[i]==null) {
				clientes[i]=persona;
				break;
			}
			if (clientes[i].equals(persona)==true) {
				System.out.println("El cliente ya existe");
			}
		}
	}
	public void darBajaCliente(Persona persona) {
		for (int i=0; i<clientes.length;i++) {
			if (clientes[i]!= null) {
				if (clientes[i].equals(persona)==true) {
					clientes[i]=null;
				}
			}
		}
	}
	public boolean buscarCliente (Persona persona) {
		for (int i=0; i<clientes.length;i++) {
			if (clientes[i]!= null) {
				if (clientes[i].equals(persona)==true) {
					return true;
				}	
			}
		}
		return false;
	}
	public void clientesTipo () {
		System.out.println("Cliente");
		for (int i=0; i<clientes.length;i++) {
			if (clientes[i]!=null) {
				if (clientes[i].getTipoCliente()=='C') {
					System.out.println(clientes[i].toString());
				};
			}
		}
		System.out.println("Banca exclusiva");
		for (int i=0; i<clientes.length;i++) {
			if (clientes[i]!=null) {
				if (clientes[i].getTipoCliente()=='B') {
					System.out.println(clientes[i].toString());
				};
			}
		}
		System.out.println("Empresarial");
		for (int i=0; i<clientes.length;i++) {
			if (clientes[i]!=null) {
				if (clientes[i].getTipoCliente()=='E') {
					System.out.println(clientes[i].toString());
				};
			}
		}
	}
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", clientes=" + Arrays.toString(clientes) + "]";
	}
	
}
