
public class Principal {

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

		System.out.printf("Array integerArray contiene:%n");
		imprimirArray(intArray,0,4);
		System.out.printf("%nArray doubleArray contiene:%n");
		imprimirArray(doubleArray,0,4);
		
		System.out.println("\nCambio");
		cambiarPosicion(intArray,0,3);
		System.out.printf("Array integerArray cambiado contiene:%n");
		imprimirArray(intArray,0,4);
		
	}
	public static <T> void imprimirArray(T[] inputArray, int limI, int limS){
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
	public static <K> void cambiarPosicion(K[] inputArray, int elem1, int elem2){
		try {
			if (elem1 < 0 || elem2 >= inputArray.length || elem2 < 0 || elem1 >= inputArray.length) {
		        throw new LimiteInvalidoException("Indices incorrectos");
		    }
			K aux = inputArray[elem1];
			inputArray[elem1]=inputArray[elem2];
			inputArray[elem2]=aux;
		}
		catch(LimiteInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
