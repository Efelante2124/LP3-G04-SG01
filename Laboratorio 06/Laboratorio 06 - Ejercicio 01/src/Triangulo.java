
public class Triangulo extends FiguraBidimensional{
	private double l1,l2,l3;
	
	public Triangulo(double l1, double l2, double l3) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	public double obtenerArea() {
		double sp = (l1+l2+l3)/2;
		double area = Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));
		return area;
	}
	@Override
	public String toString() {
		return "Triangulo \nLado 1 = " + l1 + "\nLado 2 = " + l2 + "\nLado 3 = " + l3 + "\nArea = " + obtenerArea();
	}
}
