
public class Principal {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(1,1,1900);
		Fecha fecha2 = new Fecha(2,1,1900);
		fecha1.corta();
		fecha1.larga();
		fecha1.siguiente();
		fecha1.corta();
		fecha1.anterior();
		fecha1.corta();
		System.out.println(Fecha.igualQue(fecha1, fecha2));
		System.out.println(Fecha.menorQue(fecha1, fecha2));
		System.out.println(Fecha.mayorQue(fecha1, fecha2));
	}

}
