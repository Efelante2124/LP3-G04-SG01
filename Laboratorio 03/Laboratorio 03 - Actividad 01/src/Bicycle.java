
public class Bicycle {
	static int count;
	private String ownerName;
	private float distance;
	private String idBicy;
	public Bicycle(String ownerName, float distance) {
		this.ownerName = ownerName;
		this.distance = distance;
		counter();
		String tempId = String.valueOf(1000*count);
		this.idBicy = ownerName.substring(0,2)+tempId.substring(1);
	}
	public String getOwnerName() {
		return ownerName;
	}
	public float getDistance() {
		return distance;
	}
	public void distanceTraveled (int meters) {
		this.distance += meters;
	}
	public static void counter() {
		count++;
	}
	public static Bicycle mostUsed(Bicycle x, Bicycle y) {
		if (x.distance>y.distance)
			return x;
		return y;
	}
	@Override
	public String toString() {
		return "Bicycle [ownerName=" + ownerName + ", distance=" + distance + ", idBicy=" + idBicy + "]";
	}
	
	
}
