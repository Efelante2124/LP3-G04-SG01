
public class Principal {

	public static void main(String[] args) {
        Producto[] productos = {
                new Producto(1, "Laptop", 1200.0),
                new Producto(2, "Teléfono", 500.0),
                new Producto(3, "Tablet", 300.0)};
        Persona[] personas = {
                new Persona(12345678, "Juan", "Cerro Colorado"),
                new Persona(87654321, "María", "Cayma")};

        Estudiante[] estudiantes = {
                new Estudiante(98765432, "Ana", "Selva Alegre", "Ingenieria de sistemas"),
                new Estudiante(56789012, "Carlos", "Cerro Colorado", "Medicina")};

        System.out.println("Indice: " + buscarElemento(productos, new Producto(1, "Laptop", 1200.0)));
        System.out.println("Indice: " + buscarElemento(productos, new Producto(4, "PC", 3200.0)));
        System.out.println("Indice: " + buscarElemento(productos, new Producto(2, "PC", 3200.0)));
        System.out.println("Indice: " + buscarElemento(personas, new Persona(12345678, "Juan", "Cayma")));
        System.out.println("Indice: " + buscarElemento(personas, new Persona(72172845, "Rodrigo", "Cerro Colorado")));
        System.out.println("Indice: " + buscarElemento(personas, new Persona(72172845, "Juan", "Selva Alegre")));
        System.out.println("Indice: " + buscarElemento(estudiantes, new Estudiante(98765432, "Ana", "Selva Alegre", "Ingenieria de sistemas")));
        System.out.println("Indice: " + buscarElemento(estudiantes, new Estudiante(72172845, "Ana", "Cerro Colorado", "Ingenieria de sistemas")));
        System.out.println("Indice: " + buscarElemento(estudiantes, new Estudiante(72172845, "Rodrigo", "Cerro Colorado", "Ingenieria de sistemas")));
        
	}
	public static <T> int buscarElemento(T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elemento)) {
                return i; 
            }
        }
        return -1; 
    }

}
