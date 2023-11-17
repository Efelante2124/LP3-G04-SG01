public class ArrayPersona{
	public Persona arreglo[];
	final int max = 128;
	int tamano = 0;

	public ArrayPersona(){
		this.arreglo = new Persona[this.max];
	}

	public void printArray(String nombre){
		for(int i = 0; i < this.tamano; i++){
			if(this.arreglo[i].getNombre().equals(nombre)){
				System.out.println(this.arreglo[i]);
			}
		}
	}

	public void addArray(Persona persona){
		if(this.tamano == max){
			System.exit(1);
		}
		this.arreglo[this.tamano++] = persona;
	}
}