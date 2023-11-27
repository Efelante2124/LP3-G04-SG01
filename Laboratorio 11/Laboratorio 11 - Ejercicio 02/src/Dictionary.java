import java.util.ArrayList;

class Dictionary {
    private ArrayList<OrderedPair> pairs;

    public Dictionary() {
        this.pairs = new ArrayList<>();
    }

    public void add(Object key, Object value) {
    	OrderedPair pair = new OrderedPair(key, value);
        pairs.add(pair);
    }

    public boolean delete(Object key) {
        for (OrderedPair pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    public Object getValue(Object key) throws ObjectNoExist {
        for (OrderedPair pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExist("No existe algun objeto con esa clave");
    }

	@Override
	public String toString() {
		return "Dictionary [pairs=" + pairs + "]";
	}

    
}

