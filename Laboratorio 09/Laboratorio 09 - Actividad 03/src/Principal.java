import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        double[][] matriz;
        int filas, columnas, i, j;
        do {
            System.out.print("Número de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);

        do {
            System.out.print("Número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas <= 0);

        matriz = new double[filas][columnas];

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
            	System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        try {
            fos = new FileOutputStream("C:\\Users\\rodri\\OneDrive\\Escritorio\\carpetaaux\\matriz.dat");
            salida = new DataOutputStream(fos);

            salida.writeInt(filas);
            salida.writeInt(columnas);

            salida.writeInt(filas);
            salida.writeInt(columnas);

            for (i = 0; i < filas; i++) {
                for(j=0;j<columnas;j++) {
                	salida.writeDouble(matriz[i][j]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
