
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
	 // Implementación de método abstracto de SuperClase
	 public void ingreso(){
	 System.out.println("EmpleadoBaseMasComision: Monto Fijo + Comision");
	 }
	 public void especifico(){
	 System.out.println("Proceso específico de EmpleadoBaseMasComision");
	 }
}