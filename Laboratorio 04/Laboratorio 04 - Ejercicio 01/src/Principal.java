
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Contacto> contactos = new ArrayList<Contacto>();
		Scanner s1 = new Scanner(System.in);
		int opc=0;
		do {
			System.out.println("1) Añadir contacto");
			System.out.println("2) Buscar contacto");
			System.out.println("3) Modificar contacto");
			System.out.println("4) Borrar contactos");
			System.out.println("5) Eliminar contacto");
			System.out.println("6) Mostrar contactos");
			System.out.println("7) Salir");
			System.out.println("Elije una opcion");
			opc = s1.nextInt();
			switch(opc) {
				case 1:
					System.out.printf("Ingrese el nombre: ");
					s1.nextLine();
					String nombre = s1.nextLine();
					
					System.out.printf("Ingrese el telefono: ");
					String telefono = s1.nextLine();
					System.out.printf("Ingrese el direccion: ");
					String direccion = s1.nextLine();
					
					contactos.add(new Contacto(nombre,telefono,direccion));
					break;
				case 2:
					System.out.println("Ingrese los datos de la persona que busca: ");
					System.out.println("Nombre: ");
					s1.nextLine();
					nombre = s1.nextLine();
					System.out.println("Telefono: ");
					telefono = s1.next();
					System.out.println("Direccion: ");
					s1.nextLine();
					direccion = s1.nextLine();
					for (Contacto j : contactos) {
						if((j.getNombre()).equals(nombre)==true && (j.getTelefono()).equals(telefono)==true && (j.getDireccion()).equals(direccion)==true) {
							System.out.println("El contacto esta en el indice "+contactos.indexOf(j));;
						}
					}
					break;
				case 3:
					System.out.println("Ingrese los datos de la persona que busca: ");
					System.out.println("Nombre: ");
					nombre = s1.nextLine();
					s1.nextLine();
					System.out.println("Telefono: ");
					telefono = s1.next();
					System.out.println("Direccion: ");
					direccion = s1.nextLine();
					s1.nextLine();
					for (Contacto j : contactos) {
						if((j.getNombre()).equals(nombre)==true && (j.getTelefono()).equals(telefono)==true && (j.getDireccion()).equals(direccion)==true) {
							int opc2=0;
								System.out.println("Que valor quieres modificar: ");
								System.out.println("1) Nombre");
								System.out.println("2) Telefono");
								System.out.println("3) Direccion");
								opc2 = s1.nextInt();
								switch(opc2){
									case 1:
										System.out.println("Ingrese el nuevo nombre: ");
										s1.nextLine();
										nombre=s1.nextLine();
										j.setNombre(nombre);
										break;
									case 2:
										System.out.println("Ingrese el nuevo telefono: ");
										telefono=s1.next();
										j.setTelefono(telefono);
										break;
									case 3:
										System.out.println("Ingrese el nuevo direccion: ");
										direccion=s1.nextLine();
										s1.nextLine();
										j.setDireccion(direccion);
										break;
								}
						}
					}
					break;
				case 4:
					contactos.clear();
					break;
				case 5:
					System.out.println("Ingrese los datos de la persona que quiere eliminar: ");
					System.out.println("Nombre: ");
					nombre = s1.nextLine();
					s1.nextLine();
					System.out.println("Telefono: ");
					telefono = s1.next();
					System.out.println("Direccion: ");
					direccion = s1.nextLine();
					s1.nextLine();
					for (Contacto j : contactos) {
						if((j.getNombre()).equals(nombre)==true && (j.getTelefono()).equals(telefono)==true && (j.getDireccion()).equals(direccion)==true) {
							contactos.remove(j);
							break;
						}
					}
					break;
				case 6:
					for (Contacto i : contactos) {
						System.out.println("Nombre: "+i.getNombre());
						System.out.println("Telefono: "+i.getTelefono());
						System.out.println("Direccion: "+i.getDireccion());
					}
					break;
			}
		}while(opc!=7);
	}

}
