public class Coordenada {
	private int x;
	private int y;

	public Coordenada(){
		this.x = 0;
		this.y = 0;
	}
	public Coordenada(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Coordenada(Coordenada c){
		this.x = c.getX();
		this.y = c.getY();
	}

	public int getX(){
		return this.x;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getY(){
		return this.y;
	}
	public void setY(int y){
		this.y = y;
	}

	public double distancia (Coordenada c){
		double a;

		a = Math.sqrt((((this.x - c.getX())*(this.x - c.getX())) + ((this.y - c.getY())*(this.y - c.getY()))));

		return a;
	}

	public static double distancia(Coordenada c1, Coordenada c2){
		double a;

		a =Math.sqrt(((c1.getX() - c2.getX())*(c1.getX() - c2.getX())) + ((c1.getY() - c2.getY())*(c1.getY() - c2.getY())));

		return a;
	}

	public String toString(){
		return "Coordenada = X: " + this.x + ", Y: " + this.y;
	}


	public void moverX(int a){
		this.x = this.x + a;
	}
	public void moverY(int a){
		this.y = this.y + a;
	}
}