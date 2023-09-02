
public class PerfilMedico {
	private String primerNombre;
	private String apellido;
	private String sexo;
	private int dia, mes, annio;
	private double altura;
	private double peso;

	private int edad;

	public PerfilMedico(String primerNombre, String apellido, String sexo, int dia, int mes, int annio, double altura, double peso){
		this.primerNombre = primerNombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.dia = dia;
		this.mes = mes;
		this.annio = annio;
		this.altura = altura;
		this.peso = peso;
		this.edad = 0; 
	}

	public String getPrimerNombre()
	{
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre)
	{
		this.primerNombre = primerNombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	public int getDia()
	{
		return dia;
	}
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	public int getMes()
	{
		return mes;
	}
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	public int getAnnio()
	{
		return annio;
	}
	public void setAnio(int annio)
	{
		this.annio = annio;
	}
	public double getAltura()
	{
		return altura;
	}
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
	public double getPeso()
	{
		return peso;
	}
	public void setPeso(double peso)
	{
		this.peso = peso;
	}
	public int calcularEdad()
	{
		this.edad = 2023 - this.annio;
		return edad;
	}
	public void calFMC()
	{
		int FMC;
		FMC = 208 - 1 * this.edad;
		System.out.println("Frecuencia Cardiaca Máxima es: "+FMC);
	}
	public void calIMC()
	{
		double IMC;
		IMC = this.peso / this.altura;
		System.out.println("IMC es: "+IMC);
	}
	public String toString() {
		return "PerfilMedico [Nombre=" + primerNombre + ", Apellido=" + apellido + ", sexo=" + sexo + "fecha de nacimiento: Dia=" + dia + ", Mes=" + mes + ", Annio=" + annio + ", Altura=" + altura + ", Peso=" + peso + "]";
	}

}