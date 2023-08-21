import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Perro Fido = new Perro("Chihuahua","Marron");
		Perro Pelusa = new Perro("Pequines","Blanco");
		Diagnostico diag1 = new Diagnostico();
		Scanner s1 = new Scanner(System.in);
		Fido.increEdad(2);
		Pelusa.increEdad(5);
		
		System.out.println("Casos de prueba");
		
		System.out.println("Prueba 1: ");
		System.out.println("Ingrese el nuevo peso del perro: ");
		Fido.setPeso(s1.nextDouble());
		System.out.println("Ingrese la nueva edad del perro: ");
		Fido.setEdad(s1.nextInt());
		System.out.println("Ingrese la nueva temperatura del perro: ");
		Fido.setTemp(s1.nextDouble());
		diag1.aptoVacunaA(Fido);
		
		System.out.println("Prueba 2: ");
		System.out.println("Ingrese el nuevo peso del perro: ");
		Pelusa.setPeso(s1.nextDouble());
		System.out.println("Ingrese la nueva edad del perro: ");
		Pelusa.setEdad(s1.nextInt());
		System.out.println("Ingrese la nueva temperatura del perro: ");
		Pelusa.setTemp(s1.nextDouble());
		diag1.aptoVacunaB(Pelusa.getEdad(), Pelusa.getPeso(), Pelusa.getTemp());
	}

}