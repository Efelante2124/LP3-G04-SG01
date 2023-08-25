import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Ingrese el nombre, apellido, sexo, fecha de nacimieto(dia, mes, annio), altura y peso");

		System.out.println("Escriba su nombre: ");
		String nombre = s1.next();

		System.out.println("Escriba su apellido: ");
		String apellido = s1.next();

		System.out.println("Escriba su sexo: ");
		String sexo = s1.next();

		System.out.println("Fecha de nacimiento ");
		System.out.println("dia:");
		int dia = s1.nextInt();
		System.out.println("mes: ");
		int mes = s1.nextInt();
		System.out.println("annio: ");
		int annio = s1.nextInt();

		System.out.println("Ingrese su altura: ");
		double altura = s1.nextDouble();
		System.out.println("Ingrese su peso: ");
		double peso = s1.nextDouble();

		PerfilMedico persona1 = new PerfilMedico(nombre, apellido, sexo, dia, mes, annio, altura, peso);

		System.out.println(persona1.toString());

		System.out.println(persona1.calcularEdad());

		persona1.calFMC();
		persona1.calIMC();
	}
}