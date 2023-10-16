
public class Cuadrado extends FiguraBidimensional{
	private double lado;
	
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double obtenerArea() {
		double area = lado*lado;
		return area;
	}

	@Override
	public String toString() {
		return "Cuadrado \nLado = " + lado + "\nArea = " + obtenerArea();
	}
	
}
