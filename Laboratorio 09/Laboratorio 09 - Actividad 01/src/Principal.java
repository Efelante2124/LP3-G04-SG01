import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el nombre del archivo o directorio: ");
        Path ruta = Paths.get(sc.nextLine());

        if (Files.exists(ruta)) {
            System.out.printf("%n%s existe%n", ruta.getFileName());
            System.out.printf("%s un directorio%n", Files.isDirectory(ruta) ? "Es" : "No es");
            System.out.printf("%s una ruta absoluta%n", ruta.isAbsolute() ? "Es" : "No es");
            System.out.printf("Fecha de última modificación: %s%n", Files.getLastModifiedTime(ruta));
            System.out.printf("Tamaño: %s%n", Files.size(ruta));
            System.out.printf("Ruta: %s%n", ruta);
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath());

            if (Files.isDirectory(ruta)) {
                System.out.printf("%nContenido del directorio:%n");
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);
                for (Path p : flujoDirectorio) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.printf("%s no existe%n", ruta);
        }
    }
}