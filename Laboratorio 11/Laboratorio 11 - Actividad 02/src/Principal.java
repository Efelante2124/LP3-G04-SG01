
public class Principal {

	public static void main(String[] args) {
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 10);
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(2, "Hello");
       
        Persona persona = new Persona("John", "Street 123", "123456789");
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("Person", persona);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }

}
