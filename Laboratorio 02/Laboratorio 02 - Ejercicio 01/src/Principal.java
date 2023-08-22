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
	}

}
