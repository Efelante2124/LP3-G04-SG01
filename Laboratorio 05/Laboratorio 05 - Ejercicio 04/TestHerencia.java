public class TestHerencia{
	public static void main(String[] args){
		Asalariado obj1 = new Asalariado("Juan Perez", 28339187, 5, 3500.0);
		System.out.println(obj1);

		EmpleadoProduccion obj2 = new EmpleadoProduccion("Rocio Fernandez", 35289129, 10, "Tarde", 3500.0);
		System.out.println(obj2);

		EmpleadoDistribucion obj3 = new EmpleadoDistribucion("Deny Cruz", 22718935, 0, "Centro", 3500.0);
		System.out.println(obj3);


	}
}