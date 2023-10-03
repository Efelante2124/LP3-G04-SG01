import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opc=0;
		Banco bcp = new Banco("BCP");
		Scanner s1 = new Scanner(System.in);
		do {
			System.out.println("MENU");
			System.out.println("1) Agregar cliente");
			System.out.println("2) Quitar cliente");
			System.out.println("3) Buscar cliente");
			System.out.println("4) Mostrar clientes por tipo");
			System.out.println("5) Salir");
			System.out.println("Ingrese la opcion deseada: ");
			opc = s1.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Ingrese la id");
				int id = s1.nextInt();
				System.out.println("Ingrese el nombre");
				String nombre = s1.next();
				System.out.println("Desea colocar la categoria?");
				String c = s1.next();
				if (c.equals("Si")==true || c.equals("si")==true) {
					System.out.println("Ingrese la categoria");
					char cat = s1.next().charAt(0);
					bcp.agregarCliente(new Persona(id,nombre,cat));
				}
				else {
					bcp.agregarCliente(new Persona(id,nombre));
				}
				break;
			case 2:
				System.out.println("Ingrese la id de la persona a eliminar");
				int idE = s1.nextInt();
				Persona[] aux = bcp.getClientes();
				for (int i=0;i<aux.length;i++) {
					if (aux[i]!=null) {
						if(aux[i].getId()==idE) {
							System.out.println(aux[i].toString());
							bcp.darBajaCliente(aux[i]);
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println("Ingrese la id de la persona a buscar");
				int idB = s1.nextInt();
				Persona[] auxB = bcp.getClientes();
				for (int i=0;i<auxB.length;i++) {
					if (auxB[i]!=null) {
						if(auxB[i].getId()==idB) {
							System.out.println(auxB[i].toString());
							break;
						}
					}
				}
				break;
			case 4:
				bcp.clientesTipo();
			}
		}while(opc!=5);
	}

}
