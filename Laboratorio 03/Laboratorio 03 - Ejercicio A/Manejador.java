public class Manejador {
	public static int area(Rectangulo a){
		int area;
		area = (a.getCords1X()-a.getCords2X())*(a.getCords1Y()-a.getCords2Y());
		return area;
	}
	public static int perimetro(Rectangulo a){
		int perimetro;
		perimetro = ((a.getCords1X()-a.getCords2X())+(a.getCords1Y()-a.getCords2Y()))*2;
		if (perimetro < 0) {
			perimetro = perimetro * -1;
		}
		return perimetro;
	}
	public static void moverX(Rectangulo a, int b){
		a.moverCordsX(b);
	}
	public static void moverY(Rectangulo a, int b){
		a.moverCordsY(b);
	} 
}