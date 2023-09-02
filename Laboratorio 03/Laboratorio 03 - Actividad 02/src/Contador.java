
public class Contador {
	static int acumulador = 0;
	static int ncontadores = 0;
	final static int VALOR_INICIAL=10;
	static int ultimoContador=0;
	private int valor;
	
	public void UltimoContador() {
		ultimoContador = Contador.VALOR_INICIAL;
	}
	public static int acumulador() {
		return acumulador;
	}
	public Contador(int valor) {
		this.valor = valor;
		acumulador += valor;
		ncontadores++;
		UltimoContador();
	}
	public Contador() {
		new Contador(Contador.VALOR_INICIAL);
		ncontadores++;
		UltimoContador();
	}
	public void inc() {
		valor++;
		acumulador++;
	}
	public int getValor() {
		return valor;
	}
}
