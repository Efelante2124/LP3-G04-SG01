
public class Circulo extends FiguraBidimensional{
	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double obtenerArea() {
		double area = radio*radio*Math.PI;
		return area;
	}
	@Override
	public String toString() {
		return "Circulo \nRadio = " + radio + "\nArea = " + obtenerArea();
	}
}
