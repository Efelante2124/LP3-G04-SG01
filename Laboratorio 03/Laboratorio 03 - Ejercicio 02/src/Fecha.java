import java.util.Scanner;

public class Fecha {
	private int day;
	private int month;
	private int year;
	Scanner s1 = new Scanner(System.in);
	public Fecha() {
		this.day=1;
		this.month=1;
		this.year=1900;
	}
	public Fecha(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		valida();
	}
	public void leer() {
        System.out.print("Ingrese el día (1 a 31): ");
        day = s1.nextInt();
        System.out.print("Ingrese el mes (1 a 12): ");
        month = s1.nextInt();
        System.out.print("Ingrese el año (1900 a 2050): ");
        year = s1.nextInt();
        valida();
	}
	public void bisiesto() {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto.");}
		else {
            System.out.println(year + " no es un año bisiesto.");}
	}
	public boolean bisiestoaux(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;}
		else {
            return false;}
	}
	public void diasMes(int nroMes) {
		int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (bisiestoaux(this.year)==true && nroMes==2) {
			System.out.println("El mes tiene 29 dias");
		}
		else {
			System.out.println("El mes tiene "+diasPorMes[nroMes]+" dias");
		}
	}
	private void valida() {
		if (year < 1900 || year > 2050) {
			year = 1900; 
        }
        if (month < 1 || month > 12) {
        	month = 1; 
        }
        if (day < 1 || day > 31) {
        	day = 1;
        }
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void corta() {
		System.out.println(day+"-"+month+"-"+year);
	}
	public int diasTranscurridos() {
		int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int diasTranscurridos = 0;
		for (int i = 1900; i < this.year; i++) {
	        if (bisiestoaux(i)) {
	            diasTranscurridos += 366;} 
	        else {
	            diasTranscurridos += 365;}
	    }
		for (int i = 1; i < this.month; i++) {
            if (i == 2 && bisiestoaux(this.year)) {
                diasTranscurridos += 29;} 
            else {
                diasTranscurridos += diasPorMes[i];}
        }
		diasTranscurridos += this.day;
		System.out.println("Han transcurrido "+diasTranscurridos+" dias");
		return diasTranscurridos;
	}
	public void diaSemana() {
		int m = this.month;
        int d = this.day;
        int y = this.year;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int diaSemana = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
        if (diaSemana < 0) {
            diaSemana += 7;
        }
        diaSemana=diaSemana-2;
        String[] dias= {"Domingo","Sabado","Lunes","Martes","Miercoles","Jueves","Viernes"};
        System.out.print(dias[diaSemana]);
	}
	public void larga() {
		String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		System.out.println("");
		diaSemana();
		System.out.print(" "+ day+" de "+meses[month]+" de "+year);
		System.out.println("");
	}
	public void fechaTras(int diasT) {
		if (diasT>360) {
			int yearP=diasT/365;
			int tiempoR=diasT%365;
			int mesesP=tiempoR/30;
			tiempoR=tiempoR%30;
			this.day+=tiempoR;
			if(this.day>30) {
				mesesP+=1;
				this.day=this.day-30;
			}
			this.month+=mesesP;
			if (this.month>12) {
				yearP+=1;
				this.month=this.month-12;
			}
			this.year=this.year+yearP;
		}
		else {
			int mesesP=diasT/30;
			int tiempoR=diasT%30;
			this.day=this.day+tiempoR;
			if (this.day>30) {
				mesesP+=1;
				this.day=this.day-30;
			}
			this.month=this.month+mesesP;
			if (this.month>12) {
				this.year+=1;
				this.month-=12;
			}
		}
	}
	public void diasEntre(Fecha fechaAux) {
		int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int diasTranscurrido = 0;
		for (int i = fechaAux.getYear(); i < this.year; i++) {
	        if (bisiestoaux(i)) {
	            diasTranscurrido += 366;} 
	        else {
	            diasTranscurrido += 365;}
	    }
		for (int i = fechaAux.getMonth(); i < this.month; i++) {
            if (i == 2 && bisiestoaux(this.year)) {
                diasTranscurrido += 29;} 
            else {
                diasTranscurrido += diasPorMes[i];}
        }
		diasTranscurrido += this.day;
		System.out.println("Han transcurrido "+diasTranscurrido+" dias");
	}
	public void siguiente() {
		this.day+=1;
		if (this.day>30) {
			this.month+=1;
			if (this.month>12) {
				this.year+=1;
			}
		}
	}
	public void anterior() {
		this.day-=1;
		if ((this.day+1)<=1) {
			this.month-=1;
			this.day=30;
			if ((this.month+1)<=1) {
				this.year-=1;
				this.month=12;
			}
		}
	}
	public void fechaFutura(int diasT) {
		if (diasT>360) {
			int yearP=diasT/365;
			int tiempoR=diasT%365;
			int mesesP=tiempoR/30;
			tiempoR=tiempoR%30;
			this.day+=tiempoR;
			if(this.day>30) {
				mesesP+=1;
				this.day=this.day-30;
			}
			this.month+=mesesP;
			if (this.month>12) {
				yearP+=1;
				this.month=this.month-12;
			}
			this.year=this.year+yearP;
		}
		else {
			int mesesP=diasT/30;
			int tiempoR=diasT%30;
			this.day=this.day+tiempoR;
			if (this.day>30) {
				mesesP+=1;
				this.day=this.day-30;
			}
			this.month=this.month+mesesP;
			if (this.month>12) {
				this.year+=1;
				this.month-=12;
			}
		}
	}
	public Fecha copia() {
		Fecha fechacopia = new Fecha(this.day,this.month,this.year);
		return fechacopia;
	}
	static public boolean igualQue(Fecha fecha1,Fecha fecha2) {
		if (fecha1.day==fecha2.day && fecha1.month==fecha2.month && fecha1.year==fecha2.year) {
			return true;
		}
		return false;
	}
	static public boolean menorQue(Fecha fecha1,Fecha fecha2) {
		if(igualQue(fecha1,fecha2)==true) {
			return false;
		}
		if (fecha1.year>fecha2.year){
			return false;
		}
		if (fecha1.month>fecha2.month){
			return false;
		}
		if (fecha1.day>fecha2.day){
			return false;
		}
		return true;
	}
	static public boolean mayorQue(Fecha fecha1,Fecha fecha2) {
		if(igualQue(fecha1,fecha2)==true) {
			return true;
		}
		if (fecha1.year>fecha2.year){
			return true;
		}
		if (fecha1.month>fecha2.month){
			return true;
		}
		if (fecha1.day>fecha2.day){
			return true;
		}
		return false;
	}
}
