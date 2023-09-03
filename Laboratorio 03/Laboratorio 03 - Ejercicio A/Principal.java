public class Principal{
	public static void main(String[] args){
		Coordenada c = new Coordenada(2,4);
		Coordenada a = new Coordenada(10,20);
		System.out.println(c.toString());
		System.out.println(c.distancia(a));
		System.out.println(Coordenada.distancia(c,a));

		Rectangulo r = new Rectangulo(c,a);
		System.out.println(r.toString());

		//Rectangulo h = new Rectangulo(a);
		//System.out.println(h.toString());
		//System.out.println(r.getEsquina1());

		System.out.println(Manejador.area(r));
		System.out.println(Manejador.perimetro(r));
		Manejador.moverX(r,10);
		Manejador.moverY(r,40);
		System.out.println(r.toString());

		Rectangulo x = new Rectangulo(c);
		System.out.println(x.toString());
		Rectangulo y = new Rectangulo(a);
		System.out.println(y.toString());
		Rectangulo z = new Rectangulo(c);
		System.out.println(z.toString());

		Rectangulo l = new Rectangulo(a);
		System.out.println(l.toString());

	}
} 