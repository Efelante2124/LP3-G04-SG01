
public class Cubo extends FiguraTridimensional{
	private double lado;
	
	public Cubo(double lado) {
		super();
		this.lado = lado;
	}
	public double obtenerArea() {
		double area = 6*lado*lado;
		return area;
	}
	public double obtenerVolumen() {
		double volumen = lado*lado*lado;
		return volumen;
	}
	@Override
	public String toString() {
		return "Cubo \nLado = " + lado + "\nArea = " + obtenerArea() + "\nVolumen = " + obtenerVolumen();
	}
}
