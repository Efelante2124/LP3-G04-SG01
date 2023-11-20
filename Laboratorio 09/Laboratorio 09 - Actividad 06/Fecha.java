import java.io.Serializable;

public class Fecha implements Serializable{
	private int dia;
	private int mes;
	private int annio;

	public Fecha(int dia, int mes, int annio){
		this.dia = dia;
		this.mes = mes;
		this.annio = annio;
	}

	public Fecha(){
	}

	public int getAnnio(){
		return this.annio;
	}
	public int getMes(){
		return this.mes;
	}
	public int getDia(){
		return this.dia;
	}

	public void setDia(int dia){
		this.dia = dia;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public void setAnnio(int annio){
		this.annio = annio;
	}
}