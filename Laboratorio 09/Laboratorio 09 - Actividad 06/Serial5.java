import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial5{
	public static void main(String[] args){
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Alumno a;
		Fecha f;

		try{
			fos = new FileOutputStream("lista.txt");
			salida = new ObjectOutputStream(fos);
			f = new Fecha(5,9,2011);
			a = new Alumno("12345678A", "Lucas Gonzales", 20, f);
			salida.writeObject(a);
			salida = new ObjectOutputStream(fos);
			f = new Fecha(7,9,2011);
			a = new Alumno("98765432B", "Anacleto Jimenez", 19, f);
			salida.writeObject(a);
			salida = new ObjectOutputStream(fos);
			f = new Fecha(8,9,2011);
			a = new Alumno("78234212z", "Maria Zapata", 21, f);
			salida.writeObject(a);
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally{
			try{
				if(fos == null)
					fos.close();
				if(salida != null)
					salida.close();
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
