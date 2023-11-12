import java.io.File;

public class Principal {

	public static void main(String[] args) {
		if(args.length>0) {
			for(int i=0;i<args.length;i++) {
				File f = new File(args[i]);
				System.out.println("Nombre: "+f.getName());
				System.out.println("Ruta: "+f.getPath());
				if (f.exists()) {
					System.out.println("Archivo existe");
					System.out.print((f.canRead() ? " y se puede leer" : ""));
					System.out.print((f.canWrite() ? " y se puede escribir" : ""));
					System.out.println(".");
					System.out.println("La longitud del archivo es "+f.length()+" bytes");
				}
				else {
					System.out.println("El archivo no existe");
				}
			}
		}
		else {
			System.out.println("Debe haber un archivo");
		}
	}

}
