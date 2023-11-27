
public class Principal {

	public static void main(String[] args) {
        Dictionary diccionario = new Dictionary();

        diccionario.add("key1", "value1");
        diccionario.add("key1", "value1");
        diccionario.add("key2", "value2");
        diccionario.add("key3", "value3");
        diccionario.add(4,4);

        System.out.println("Dictionary: " + diccionario);

        boolean estado = diccionario.delete(4);
        System.out.println("Estado de elmininacion de objeto con 'key2':" + estado);
        System.out.println("Diccionario despues de delete : " + diccionario);
        
        try {
            System.out.println("valor para key1: " + diccionario.getValue("key1"));
            System.out.println("valor para key2: " + diccionario.getValue("key2"));
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }

}
