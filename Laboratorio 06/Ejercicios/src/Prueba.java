
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoAsalariado empAsalariado = new EmpleadoAsalariado();
		EmpleadoPorComision empPorComision = new EmpleadoPorComision();
		EmpleadoPorHoras empPorHoras = new EmpleadoPorHoras();
		EmpleadoBaseMasComision empBaseMasComision = new EmpleadoBaseMasComision();
		Empleado[] empleados = new Empleado[4];
		empleados[0] = empAsalariado;
		empleados[1] = empPorComision;
		empleados[2] = empPorHoras;
		empleados[3] = empBaseMasComision;
		for( Empleado empPolimorfico : empleados){
			empPolimorfico.ingreso();
			if (empPolimorfico instanceof EmpleadoBaseMasComision) {
				((EmpleadoBaseMasComision) empPolimorfico).especifico();
			}
		}
	}

}




