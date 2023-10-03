import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Tienda tienda1 = new Tienda("Makro","Juan",123456);
		Scanner s1 = new Scanner(System.in);
		int opc=0;
		do {
			System.out.println("1) Agregar computadora");
			System.out.println("2) Eliminar computadora por marca");
			System.out.println("3) Buscar computadora por marca");
			System.out.println("4) Mostrar inventario");
			System.out.println("5) Salir");
			System.out.println("Elije una opcion");
			opc = s1.nextInt();
			switch(opc) {
				case 1:
					System.out.printf("Ingrese la marca: ");
					String marca = s1.next();
					System.out.printf("Ingrese el cantidad de memoria: ");
					int memoria = s1.nextInt();
					System.out.printf("Ingrese el procesador: ");
					String procesador = s1.next();
					System.out.printf("Ingrese el Sistema operativo: ");
					String sistO = s1.next();
					System.out.printf("Ingrese el precio: ");
					double precio = s1.nextDouble();
					tienda1.inventario.add(new Computadora(marca,memoria,procesador,sistO,precio));
					break;
				case 2:
					System.out.println("Ingrese la marca: ");
					marca = s1.next();
					System.out.println("Se elimino: ");
					for (Computadora j : tienda1.inventario) {
						if((j.getMarca()).equals(marca)==true) {
							tienda1.inventario.remove(j);
							System.out.println(j.toString());
							if (tienda1.inventario.size() == 0) {
								break;
							}
							else {
								break;
							}
						}
					}
					break;
				case 3:
					System.out.println("Ingrese la marca: ");
					marca = s1.next();
					System.out.println("Se encontraron: ");
					for (Computadora k : tienda1.inventario) {
						if((k.getMarca()).equals(marca)==true) {
							System.out.println(k.toString());
						}
					}
					break;
				case 4:
					for (Computadora l : tienda1.inventario) {
						System.out.println(l.toString());
					}
					break;
			}
		}while(opc!=5);
	}

}