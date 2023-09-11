
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		boolean rellenada = false;
		int fila=0;
		int columna=0;
		int opc=0;
		do {
			System.out.println("Menu");
			System.out.println("1. Rellenar Matriz");
			System.out.println("2. Sumar fila");
			System.out.println("3. Sumar columna");
			System.out.println("4. Sumar diagonal principal");
			System.out.println("5. Sumar diagonal inversa");
			System.out.println("6. Media de los valores de la matriz");
			System.out.println("7. Salir");
			System.out.println("Elije una opcion");
			opc = s1.nextInt();
			switch (opc){
				case 1:
					for (int i = 0; i < matriz.length; i++) {
						 for (int j = 0; j < matriz[0].length; j++) {
						 System.out.println("Escribe un numero en la posicion " + i + " " + j);
						 matriz[i][j] = s1.nextInt();
						 }
					}
					rellenada=true;
					break;
				case 2:
					if (rellenada==true) {
						System.out.println("Ingrese la fila deseada: ");
						do {
							fila = s1.nextInt();
							if (fila<0 || fila>=matriz.length) {
								System.out.println("Ingrese un valor dentro del rango: ");
							}
							else {
								break;
							}
						}while(true);
						int suma = 0;
						for (int i=0;i<matriz.length;i++) {
							suma=suma+matriz[fila][i];
						}
						System.out.println("La suma de la fila "+fila+" es: "+suma);
					}
					else {
						System.out.println("Primero tienes que rellenar la matriz");
					}
					break;
				case 3:
					if (rellenada==true) {
						System.out.println("Ingrese la columna deseada: ");
						do {
							columna = s1.nextInt();
							if (columna<0 || columna>=matriz.length) {
								System.out.println("Ingrese un valor dentro del rango: ");
							}
							else {
								break;
							}
						}while(true);
						int suma = 0;
						for (int j=0;j<matriz.length;j++) {
							suma=suma+matriz[j][columna];
						}
						System.out.println("La suma de la columna "+columna+" es: "+suma);
					}
					else {
						System.out.println("Primero tienes que rellenar la matriz");
					}
					break;
				case 4:
					if (rellenada==true) {
						int suma = 0;
						for (int k=0;k<matriz.length;k++) {
							suma=suma+matriz[k][k];
						}
						System.out.println("La suma de la diagonal principal es: "+suma);
					}
					else {
						System.out.println("Primero tienes que rellenar la matriz");
					}
					break;
				case 5:
					if (rellenada==true) {
						int suma = 0;
						for (int l = 0; l < matriz.length; l++) {
							 for (int m = 0; m < matriz[0].length; m++) {
								 if ((m+l)==(matriz.length-1)) {
									 suma=suma+matriz[l][m];
								 }
							 }
						}
						System.out.println("La suma de la diagonal inversa es: "+suma);
					}
					else {
						System.out.println("Primero tienes que rellenar la matriz");
					}
					break;
				case 6:
					if (rellenada==true) {
						int suma = 0;
						int cant = matriz.length*matriz[0].length;
						for (int l = 0; l < matriz.length; l++) {
							 for (int m = 0; m < matriz[0].length; m++) {
								 suma=suma+matriz[m][l];
							 }
						}
						double media = (double) suma / cant;
						System.out.println("La media de los valores de la matriz es: "+media);
					}
					else {
						System.out.println("Primero tienes que rellenar la matriz");
					}
					break;
			}
		}while(opc!=7); 
	}

}
