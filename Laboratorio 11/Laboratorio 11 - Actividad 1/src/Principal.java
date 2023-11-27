
public class Principal {

	public static void main(String[] args) {
		Persona[] personas = new Persona[5];
		Goodies[] goodies = new Goodies[5];
		Estudiante[] estudiantes = new Estudiante[5];
		personas[0] = new Persona("Juan", "Cerro Colorado", "123456789");
        personas[1] = new Persona("Maria", "Cayma", "987654321");

        goodies[0] = new Goodies(1, "Chocolate", 15.0f);
        goodies[1] = new Goodies(2, "Caramelo", 8.0f);

        estudiantes[0] = new Estudiante("Carlos", "Cayma", "456123789", "Sistemas", new Procedencia("Departamento1", "Provincia1"));
        estudiantes[1] = new Estudiante("Ana", "Cerro Colorado", "654321987", "Mecanica", new Procedencia("Departamento2", "Provincia2"));
        
        System.out.println("resultado: " + contieneObjeto(personas, new Persona("Juana", "", "")));
        System.out.println("resultado: " + contieneObjeto(goodies, new Goodies(2, "", 0.0f)));
        System.out.println("resultado: " + contieneObjeto(estudiantes, new Estudiante("Carlos", "", "", "Informática", new Procedencia("Departamento1", "Provincia1"))));
   
	}
	public static <T extends Contenedera> boolean contieneObjeto(T[] arreglo, T objeto) {
        for (T elemento : arreglo) {
            if (elemento != null && elemento.contiene(objeto)) {
                return true;
            }
        }
        return false;
    }

}
