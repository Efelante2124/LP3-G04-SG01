
public class Principal {

	public static void main(String[] args) {
		Bicycle a,b;
		a = new Bicycle("Adam Smith",1);
		b = new Bicycle("Ben Jones",1);
		a.distanceTraveled(240);
		System.out.println(b.getOwnerName());
		b.distanceTraveled(1100);
		Bicycle mostOld = Bicycle.mostUsed(a,b);
		System.out.println(mostOld);
	}

}

/* 
variables de clase: count
variable de instancia: ownerName, distance, idBicy
metodo de clase: Bicycle, getOwnerName, getDistance, distanceTraveled, toString
metodo de instancia: counter, mostUsed

*/