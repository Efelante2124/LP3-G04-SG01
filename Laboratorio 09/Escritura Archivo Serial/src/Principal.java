import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Persona p;
		try {
			fos = new FileOutputStream("C:\\\\Users\\\\rodri\\\\OneDrive\\\\Escritorio\\\\carpetaaux\\\\texto.txt");
			salida = new ObjectOutputStream(fos);
			p = new Persona("12345678A","Lucas Gonzales",30);
			salida.writeObject(p);
			p = new Persona("98765432B","Juan Algo",28);
			salida.writeObject(p);
			p = new Persona("74125896C","Maria ADS",35);
			salida.writeObject(p);
		}
		catch(FileNotFoundException e) {
			System.out.println("1"+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("2"+e.getMessage());
		}
		finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				if(salida!=null) {
					salida.close();
				}
			}
			catch(IOException e) {
				System.out.println("3"+e.getMessage());
			}
		}

	}

}
