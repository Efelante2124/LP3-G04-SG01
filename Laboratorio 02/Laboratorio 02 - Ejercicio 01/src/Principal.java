import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Ingrese el nombre del titular: ");
		String titular = s1.next();
		System.out.println("Quiere colocar una cantidad inicial?(Si/No)");
		String opc = s1.next();
		double cantidad = 0;
		if (opc.equalsIgnoreCase("Si") && opc.equalsIgnoreCase("SI")) {
			System.out.println("Ingrese la cantidad inicial: ");
			cantidad = s1.nextDouble();}
		CuentaBanco cuenta1 = new CuentaBanco(titular,cantidad);
		
		System.out.println(cuenta1.toString());
		
		while(true) {
			System.out.println("1) Ingresar");
			System.out.println("2) Retirar");
			System.out.println("3) Mostrar estado de cuenta");
			System.out.println("4) Salir");
			System.out.println("Ingrese la opcion deseada: ");
			int opc1 = s1.nextInt();
			if (opc1==1) {
				System.out.println("Ingrese la cantidad a ingresar: ");
				int cantv = s1.nextInt();
				cuenta1.ingresar(cantv);}
			else if (opc1==2) {
				System.out.println("Ingrese la cantidad a retirar: ");
				int cantv = s1.nextInt();
				cuenta1.retirar(cantv);}
			else if (opc1==3) {
				System.out.println(cuenta1.toString());}
			else
				break;
		}
	}
}
