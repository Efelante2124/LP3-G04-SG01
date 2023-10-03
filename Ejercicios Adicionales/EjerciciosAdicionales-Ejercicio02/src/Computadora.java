
public class Computadora {
	private String marca;
	private int memoria;
	private String procesador;
	private String sistO;
	private double precio;
	public Computadora(String marca, int memoria, String procesador, String sistO, double precio) {
		super();
		this.marca = marca;
		this.memoria = memoria;
		this.procesador = procesador;
		this.sistO = sistO;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getSistO() {
		return sistO;
	}
	public void setSistO(String sistO) {
		this.sistO = sistO;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", memoria=" + memoria + ", procesador=" + procesador + ", sistO="
				+ sistO + ", precio=" + precio + "]";
	}
	
}
