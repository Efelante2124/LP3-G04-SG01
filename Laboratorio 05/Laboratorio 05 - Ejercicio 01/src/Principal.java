import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Persona[] personas=new Persona[10];
		int opc=0;
		do {
			System.out.println("Menu");
			System.out.println("1) Agregar persona");
			System.out.println("2) Depositar");
			System.out.println("3) Retirar");
			System.out.println("4) Mostrar personas");
			System.out.println("5) Salir");
			opc= s1.nextInt();
			if (opc==1) {
				System.out.println("Quiere escoger el tipo de cliente?: ");
				String cl = s1.next();
				if (cl.equals("si")==true){
					System.out.println("Ingrese la id");
					int id = s1.nextInt();
					System.out.println("Ingrese el tipo de Cliente");
					char tipo = s1.next().charAt(0);
					System.out.println("Ingrese el nombre");
					s1.nextLine();
					String nombre = s1.nextLine();
					for (int i=0; i<personas.length;i++) {
						if (personas[i]==null) {
							personas[i]=new Persona(id,tipo,nombre);
							break;
						}
					}
				}
				else {
					System.out.println("Ingrese la id");
					int id = s1.nextInt();
					System.out.println("Ingrese el nombre");
					s1.nextLine();
					String nombre = s1.nextLine();
					for (int j=0; j<personas.length;j++) {
						if (personas[j]==null) {
							personas[j]=new Persona(id,nombre);
							break;
						}
					}
				}
			}
			if (opc==2) {
				System.out.println("ingrese la id de la persona");
				int idb = s1.nextInt();
				for (int i=0; i<personas.length;i++) {
					if (personas[i].getId()==idb) {
						System.out.println("Ingrese cuanto se va a depositar");
						double dep = s1.nextDouble();
						personas[i].getCuenta().depositar(dep);
						break;
					}
					else {
						System.out.println("No existe la persona");
					}
				}	
			}
			if (opc==3) {
				System.out.println("ingrese la id de la persona");
				int idb = s1.nextInt();
				for (int i=0; i<personas.length;i++) {
					if (personas[i].getId()==idb) {
						System.out.println("Ingrese cuanto se va a retirar");
						double dep = s1.nextDouble();
						personas[i].getCuenta().depositar(dep);
					}
					else {
						System.out.println("No existe la persona");
					}
				}
			}
			if (opc==4) {
				for (Persona i:personas) {
					if (i!=null) {
						System.out.println(i.toString());
					}
					
				}
			}
		}while(opc!=5);
	
	}
}
