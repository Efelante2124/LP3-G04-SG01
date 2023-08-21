
public class Perro {
	private String raza;
	private int edad;
	private String color;
	public double peso;
	private double temp;
		
	public Perro() {
		super();
	}

	public Perro(String raza, String color) {
		super();
		this.raza = raza;
		this.color = color;
	}

	public Perro(String raza, int edad, String color, double peso, double temp) {
		super();
		this.raza = raza;
		this.edad = edad;
		this.color = color;
		this.peso = peso;
		this.temp = temp;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public void ladrar() {
		System.out.println("Guau Guau");
	}
	
	public void dormir() {
		System.out.println("El perro esta dormido");
	}
	
	public void comer() {
		System.out.println("El perro esta comiendo");
	}
	
	public void increEdad(int anios) {
		this.edad = this.edad + anios;
		cambiarPeso(anios);
	}
	
	private void cambiarPeso(int anios) {
		this.peso = this.peso + (anios*1.5);
	}
}