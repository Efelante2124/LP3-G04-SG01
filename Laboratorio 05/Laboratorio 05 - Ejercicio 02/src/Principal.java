import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opc=0;
		Scanner s1= new Scanner(System.in);
		Automovil [] automoviles = new Automovil[10];
		Motor[] motores = new Motor[10];
		do {
			System.out.println("MENU");
			System.out.println("1) Agregar automovil");
			System.out.println("2) Agregar motor");
			System.out.println("3) Asignar motor a automovil");
			System.out.println("4) Mostrar automoviles");
			System.out.println("5) Mostrar motores");
			System.out.println("6) Salir");
			System.out.println("Ingrese la opcion deseada:");
			opc=s1.nextInt();
			switch(opc){
			case 1: 
				System.out.println("Ingrese la placa");
				String placa = s1.next();
				System.out.println("Ingrese el numero de puertas");
				int numP = s1.nextInt(); 
				System.out.println("Ingrese la marca");
				String marca = s1.next();
				System.out.println("Ingrese el modelo");
				String modelo = s1.next();
				for(int i=0; i<automoviles.length;i++) {
					if (automoviles[i]==null) {
						automoviles[i] = new Automovil(placa,numP,marca,modelo);
						break;
					}
				}
				break;
			case 2: 
				System.out.println("Ingrese el numero del motor");
				int numM = s1.nextInt();
				System.out.println("Ingrese el numero de revoluciones");
				int numR = s1.nextInt();
				for(int i=0; i<motores.length;i++) {
					if (motores[i]==null) {
						motores[i] = new Motor(numM,numR);
						break;
					}
				}
				break;
			case 3:
				System.out.println("Ingrese la placa del auto");
				String placaB = s1.next();
				System.out.println("Ingrese el numero del motor");
				int numMB = s1.nextInt();
				boolean exisA=false;
				boolean exisM=false;
				int indA=0,indM=0;
				for (int i=0;i<automoviles.length;i++) {
					if (automoviles[i]!= null) {
						if(automoviles[i].getPlaca().equals(placaB)==true) {
							exisA = true;
							indA=i;
						}
					}
				}
				for (int i=0;i<motores.length;i++) {
					if (motores[i]!=null) {
						if(motores[i].getNumMotor()==numMB) {
							exisM = true;
							indM=i;
						}
					}
				}
				if (exisA==true && exisM==true) {
					automoviles[indA].setMotor(motores[indM]);
				}
				else {
					System.out.println("El automovil o el motor no existe");
				}
				break;
			case 4:
				for(Automovil i : automoviles) {
					if (i!=null) {
						System.out.println(i.toString());
					}
				}
				break;
			case 5:
				for(Motor i : motores) {
					if (i!=null) {
						System.out.println(i.toString());
					}
				}
				break;
			}
			
		}while(opc!=6);

	}

}
