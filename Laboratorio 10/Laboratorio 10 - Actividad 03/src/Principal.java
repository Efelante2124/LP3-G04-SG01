
public class Principal {

	public static void main(String[] args) throws LimiteInvalidoException {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray = {'H', 'O', 'L', 'A'};
		Float[] floatArray = {1.0f,1.5f,3.9f};
		Boolean[] booleanArray = {true,false,true,true};
		Persona p1 = new Persona(72172845,"Hector","Martinez");
		Persona p2 = new Persona(72172845,"Sergio","Tejada");
		Persona[] PersonaArray = {p1,p2};
		System.out.printf("Array integerArray contiene:%n");
		imprimirArray(intArray,1,3);
		System.out.printf("%nArray doubleArray contiene:%n");
		imprimirArray(doubleArray,1,4);
		System.out.printf("%nArray charArray contiene:%n");
		imprimirArray(charArray,0,3);
		System.out.printf("%nArray floatArray contiene: %n");
		imprimirArray(floatArray,1,2);
		System.out.printf("%nArray booleanArray contiene: %n");
		imprimirArray(booleanArray,3,4);
		System.out.printf("%nArray PersonaArray contiene: %n");
		imprimirArray(PersonaArray,0,1);
	}
	public static <T> void imprimirArray(T[] inputArray, int limI, int limS) throws LimiteInvalidoException {
	    try{
	    	if (limI < 0 || limS >= inputArray.length || limI > limS) {
		        throw new LimiteInvalidoException("Limites incorrectos");
		    }

		    for (int i = limI; i <= limS; i++) {
		        System.out.printf("%s ", inputArray[i]);
		        System.out.println();
		    }
	    }
	    catch(LimiteInvalidoException e) {
	    	System.out.println(e.getMessage());
	    }
	}

}
