
public class Principal {

	public static void main(String[] args) {
		Banco bcp = new Banco("BCP");
		Banco bbva = new Banco("BBVA",30);
		Persona p1 = new Persona(1,"Manuel");
		Persona p2 = new Persona(2,"Mario");
		bcp.agregarCliente(p1);
		bcp.agregarCliente(p2);
		System.out.println(bcp.buscarCliente(p2)); //true
		bcp.clientesTipo(); //clientes con p2
		bcp.darBajaCliente(p2);
		bcp.clientesTipo(); //clientes con p1
		System.out.println(bcp.buscarCliente(p2)); //false
	}

}
