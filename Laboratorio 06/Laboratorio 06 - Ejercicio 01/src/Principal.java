
public class Principal {

	public static void main(String[] args) {
		Figura [] figuras = new Figura[6];
		figuras[0]= new Circulo(5);
		figuras[1]= new Cuadrado(5);
		figuras[2]= new Triangulo(3,4,5);
		figuras[3]= new Esfera(5);
		figuras[4]= new Cubo(5);
		figuras[5]= new Tetraedro(5);
		for (Figura f : figuras) {
			if (f instanceof FiguraBidimensional) {
				System.out.println("Tipo: Bidimensional");
			}
			if (f instanceof FiguraTridimensional) {
				System.out.println("Tipo: Tridimensional");
			}
			System.out.println(f.toString());
			System.out.println("==================");
		}
	}

}
