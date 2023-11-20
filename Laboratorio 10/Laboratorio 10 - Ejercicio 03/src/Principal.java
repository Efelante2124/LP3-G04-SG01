
public class Principal {
	
	public static void main(String[] args) {
        System.out.println(isEqualTo("Hola", "Hola"));             
        System.out.println(isEqualTo(10, 10));                       
        System.out.println(isEqualTo(3.14, 3.14));                    
        System.out.println(isEqualTo("Hola", 10));                    
        System.out.println(isEqualTo(3.14, "3.14")); 
        System.out.println(isEqualTo("Hola","HolA"));
        Persona p1 = new Persona(72172845,"Rodrigo","Cerro Colorado");
        Persona p2 = new Persona(72172848,"Sergio", "Cayma");
        Persona p3 = new Persona(72172845,"Rodrigo","Cerro Colorado");
        System.out.println(isEqualTo(p1,p2));
        System.out.println(isEqualTo(p1,p3));
    }
    
	public static <T> boolean isEqualTo(T obj1, T obj2) {
        return obj1.equals(obj2);
    }
	
}
