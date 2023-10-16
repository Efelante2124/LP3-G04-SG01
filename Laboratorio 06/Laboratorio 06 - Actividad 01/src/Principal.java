
public class Principal {

	public static void main(String[] args) {
		PorPagar[] objetosPorPagar = new PorPagar[5];
		objetosPorPagar[0] = new Factura("0123","asiento",2,275.00);
		objetosPorPagar[1] = new Factura("5647","llanta",4,79.95);
		objetosPorPagar[2] = new EmpleadoAsalariado("john","Smith","123456789",800);
		objetosPorPagar[3] = new EmpleadoAsalariado("Lisa","Barnes","987654321",1200.00);
		objetosPorPagar[4] = new Prestamo(2,50);
		System.out.println("Facturas y empleados procesados en forma polimorfica:\n");
		
		for(PorPagar porPagarActual : objetosPorPagar) {
			System.out.printf("%s \n%s: $%,.2f\n\n",porPagarActual.toString(),"pago vencido",porPagarActual.obtenerMontoPago());
		}
	}

}
