
public class Tetraedro extends FiguraTridimensional{
	public double lado;
	
	public Tetraedro(double lado) {
		super();
		this.lado = lado;
	}
	public double obtenerArea() {
		double area = lado*lado*Math.sqrt(3);
		return area;
	}
	public double obtenerVolumen() {
		double volumen = lado*lado*lado*Math.sqrt(2)/12;
		return volumen;
	}
	@Override
	public String toString() {
		return "Tetraedro \nLado = " + lado + "\nArea = " + obtenerArea() + "\nVolumen = " + obtenerVolumen();
	}
}
