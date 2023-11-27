
public class Principal {
	public static void main(String[] args) {
        try {
            Bag<Integer> integerBag = new Bag<>(5);
            integerBag.add(1);
            integerBag.add(2);
            integerBag.add(3);
            System.out.println("Bolsa de enteros:");
            System.out.println(integerBag);
            integerBag.remove(2);
            System.out.println("Bolsa de enteros con remove:");
            System.out.println(integerBag);
            integerBag.getObjects();

            Bag<String> stringBag = new Bag<>(3);
            stringBag.add("Hola");
            stringBag.add("Mundo");
            System.out.println("Bolsa de cadenas:");
            System.out.println(stringBag);

            Bag<Persona> personaBag = new Bag<>(2);
            personaBag.add(new Persona("Juan", 25));
            System.out.println("Bolsa de personas:");
            System.out.println(personaBag);

            integerBag.remove(2);
            System.out.println("Bolsa de enteros después de eliminar el 2:");
            System.out.println(integerBag);

        } catch (IsFull | IsEmpty |ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }
}
