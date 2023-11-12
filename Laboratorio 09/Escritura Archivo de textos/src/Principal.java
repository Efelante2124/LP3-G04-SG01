import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintWriter salida = null;
		try {
			salida = new PrintWriter("C:\\Users\\rodri\\OneDrive\\Escritorio\\carpetaaux\\texto.txt");
			String cadena;
			System.out.println("Ingrese texto. Para acabar ingrese la cadena FIN");
			cadena = s.nextLine();
			while(!cadena.equalsIgnoreCase("FIN")){
				salida.println(cadena);
				cadena = s.nextLine();
			}
			salida.flush();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			salida.close();
		}

	}

}
