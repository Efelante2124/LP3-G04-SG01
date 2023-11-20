
public class Principal  {

	public static void main(String[] args) {
		System.out.printf("Maximo de %d, %d y %d es %d%n%n",
				3, 4, 5, maximo(3,4,5));
		System.out.printf("Maximo de %.1f, %.1f y %.1f es %.1f%n%n",
				6.6, 7.7, 8.8, maximo(6.6,7.7,8.8));
		System.out.printf("Maximo de %s, %s and %s es %s%n%n",
				"pera", "zanahoria", "uva", maximo("pera","zanahoria","uva"));
		Persona p1 = new Persona(72172845,"Angel","Huaranca");
		Persona p2 = new Persona(72172845,"Bob","Tejada");
		Persona p3 = new Persona(72172845,"Checho","Guaman");
		System.out.printf("Maximo de %s, %s and %s es %s%n%n",
				p1.getNombre(), p2.getNombre(), p3.getNombre(), maximo(p1,p2,p3));
		System.out.printf("Minimo de %d, %d y %d es %d%n%n",
				3, 4, 5, minimo(3,4,5));
		System.out.printf("Minimo de %.1f, %.1f y %.1f es %.1f%n%n",
				6.6, 7.7, 8.8, minimo(6.6,7.7,8.8));
		System.out.printf("Minimo de %s, %s and %s es %s%n%n",
				"pera", "zanahoria", "uva", minimo("pera","zanahoria","uva"));
		System.out.printf("Minimo de %s, %s and %s es %s%n%n",
				p1.getNombre(), p2.getNombre(), p3.getNombre(), minimo(p2,p3,p1));
	}
	public static <T extends Comparable<T>> T maximo (T x, T y, T z){
		T max = z;
		if(max.compareTo(x) < 0)
			max = x;
		if(max.compareTo(y) < 0)
			max = y;

		return max;
	}
	public static <T extends Comparable<T>> T minimo (T x, T y, T z){
		T min = z;
		if(min.compareTo(x) > 0)
			min = x;
		if(min.compareTo(y) > 0)
			min = y;

		return min;
	}
	
}
