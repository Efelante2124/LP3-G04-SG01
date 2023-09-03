public class Rectangulo {
	private Coordenada esquina1;
	private Coordenada esquina2;
	private String color;
	static int contador = 0;

	public Rectangulo(Coordenada c1, Coordenada c2){
		this.esquina1 = c1;
		this.esquina2 = c2;
		if (contador < 3) {
			if (contador == 0) {
				this.color = "verde";
			}else if (contador == 1) {
				this.color = "amarillo";
			}else if (contador == 2) {
				this.color = "rojo";	
			}
		}else{
			contador = 0;
			this.color = "verde";
		}
		contador++;
	}
	public Rectangulo(Coordenada c){
		Coordenada a = new Coordenada();
		this.esquina1 = a;
		this.esquina2 = c;
		if (contador < 3) {
			if (contador == 0) {
				this.color = "verde";
			}else if (contador == 1) {
				this.color = "amarillo";
			}else if (contador == 2) {
				this.color = "rojo";	
			}
		}else{
			contador = 0;
			this.color = "verde";
		}
		contador++;
	}

	public Coordenada getEsquina1(){
		return this.esquina1;
	}
	public void setEsquina(Coordenada c){
		this.esquina1 = c;
	}
	public Coordenada getEsquina2(){
		return this.esquina2;
	}
	public void setEsquina2(Coordenada c){
		this.esquina2 = c;
	}

	public String toString(){
		return "Cuadrado = Esquina 1: " + esquina1 + " Esquina 2: " + esquina2 + " Color: " + color;
	}


	public int getCords1X(){
		return esquina1.getX();
	}
	public int getCords1Y(){
		return esquina1.getY();
	}
	public int getCords2X(){
		return esquina2.getX();
	}
	public int getCords2Y(){
		return esquina2.getY();
	}

	public void moverCordsX(int a){
		esquina1.moverX(a);
		esquina2.moverX(a);
	}
	public void moverCordsY(int a){
		esquina1.moverY(a);
		esquina2.moverY(a);
	}
}