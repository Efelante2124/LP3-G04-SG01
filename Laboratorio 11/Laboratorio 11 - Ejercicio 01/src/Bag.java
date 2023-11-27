
public class Bag<T> {
	private T[] list;
	private int count;
	public Bag(int count) {
		this.list = (T[]) new Object[count];
		this.count = 0;
	}
	public void add(T obj) throws IsFull{
		if (count < list.length) {
			list[count] = obj;
			count++;
		} else {
			throw new IsFull("La bolsa está llena. No se puede agregar más objetos.");
		}
	}
	public T[] getObjects() throws IsEmpty {
		if (count > 0) {
            return list;
        } else {
            throw new IsEmpty("La bolsa está vacía. No hay objetos para devolver.");
        }
	}
	public T remove(T obj) throws ObjectNoExist{
		int index = getIndex(obj);
        if (index != -1) {
            T ObjetoR = list[index];
            for (int i = index; i < count - 1; i++) {
                list[i] = list[i + 1];
            }
            list[count - 1] = null; 
            count--;
            return ObjetoR;
        } else {
            throw new ObjectNoExist("El objeto no existe en la bolsa.");
        }
	}
	public int getIndex(T obj){
		for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
	}
	public String toString(){
		StringBuilder result = new StringBuilder("Contenido de la bolsa:\n");
        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);;
        }
        return result.toString();
	}

}
