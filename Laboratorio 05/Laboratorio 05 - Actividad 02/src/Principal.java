
public class Principal {

	public static void main(String[] args) {
		Automovil a1 = new Automovil("123456",4,"Toyota","Modelo1");
		Motor m1 = new Motor(123,150);
		System.out.println(m1.toString());
		System.out.println(a1.toString());
		a1.agregarMotor(m1);
		System.out.println(a1.toString());
	}

}
