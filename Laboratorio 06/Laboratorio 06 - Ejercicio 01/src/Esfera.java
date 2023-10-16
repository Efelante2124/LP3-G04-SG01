
public class Esfera extends FiguraTridimensional{
	private double radio;
	
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	public double obtenerArea() {
		double area = Math.PI*4*radio*radio;
		return area;
	}
	public double obtenerVolumen() {
		double volumen = Math.PI*4*radio*radio*radio/3;
		return volumen;
	}
	@Override
	public String toString() {
		return "Esfera \nRadio = " + radio + "\nArea = " + obtenerArea() + "\nVolumen = " + obtenerVolumen();

	}
}