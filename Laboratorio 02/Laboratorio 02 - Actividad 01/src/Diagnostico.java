
public class Diagnostico {
	public void aptoVacunaA(Perro p1) {
		double temp = p1.getTemp();
		double peso = p1.getPeso();
		int edad = p1.getEdad();
		if (temp>=37 && temp<=40 && peso>=5 && edad>=1)
			System.out.println("Perro Sano");
		else
			System.out.println("Perro Enfermo");
	}
	public void aptoVacunaB(int edad, double peso, double temp) {
		if (temp>=37 && temp<=40 && peso>=5 && edad>=1)
			System.out.println("Perro Sano");
		else
			System.out.println("Perro Enfermo");
	}
}