
public class Principal {

	public static void main(String[] args)throws Exception {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		String[] StringArray = {"uno","dos","tres","cuatro","cinco","seis"}; 
 		System.out.printf("Array integerArray contiene:%n");
		imprimirArray(intArray);
		System.out.printf("%nArray doubleArray contiene:%n");
		imprimirArray(doubleArray);
		System.out.printf("%nArray StringArray contiene: %n");
		imprimirArray(StringArray);
	}
	public static <T> void imprimirArray(T[] inputArray) {
		for(T elemento : inputArray)
			System.out.printf("%s ",elemento);
		System.out.println();
	}
	public static void imprimirArray(String[] inputArray) {
		int cont = 0;
		for(String i : inputArray) {
			System.out.printf("%s ",i);
			if (cont%3==0 && cont!=0) {
				System.out.printf("\n");
			}
			cont++;
		}
	} 
}
