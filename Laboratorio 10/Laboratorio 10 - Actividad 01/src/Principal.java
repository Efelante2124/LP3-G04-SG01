
public class Principal {

	public static void main(String[] args)throws Exception {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray = {'H', 'O', 'L', 'A'};
		Float[] floatArray = {1.0f,1.5f,3.9f};
		Boolean[] booleanArray = {true,false,true,true};
		Persona p1 = new Persona(72172845,"Hector","Martinez");
		Persona p2 = new Persona(72172845,"Sergio","Tejada");
		Persona[] PersonaArray = {p1,p2};
		System.out.printf("Array integerArray contiene:%n");
		imprimirArray(intArray);
		System.out.printf("%nArray doubleArray contiene:%n");
		imprimirArray(doubleArray);
		System.out.printf("%nArray charArray contiene:%n");
		imprimirArray(charArray);
		System.out.printf("%nArray floatArray contiene: %n");
		imprimirArray(floatArray);
		System.out.printf("%nArray charArray contiene: %n");
		imprimirArray(booleanArray);
		System.out.printf("%nArray charArray contiene: %n");
		imprimirArray(PersonaArray);
	}
	public static <T> void imprimirArray(T[] inputArray) {
		for(T elemento : inputArray)
			System.out.printf("%s ",elemento);
		System.out.println();
	}
}
