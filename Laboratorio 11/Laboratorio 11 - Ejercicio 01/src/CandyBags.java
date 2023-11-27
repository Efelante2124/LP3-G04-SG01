
public class CandyBags extends Bag<Goodies>{
	public CandyBags(int n) {
        super(n);
    }
	@Override
    public void add(Goodies obj) {
        if (!contains(obj)) {
            super.add(obj);
        }
    }
	public Goodies cheapest() {
        if (getCount() == 0) {
            return null;
        }

        Goodies cheapestGoodie = getObjects()[0];
        for (Goodies goodie : getObjects()) {
            if (goodie.getPrecio() < cheapestGoodie.getPrecio()) {
                cheapestGoodie = goodie;
            }
        }
        return cheapestGoodie;
    }
	public CandyBags mostExpensive(int n) {
        if (getCount() == 0 || n <= 0) {
            return new CandyBags(0);
        }

        List<Goodie> sortedGoodies = new ArrayList<>(List.of(getObjects()));
        Collections.sort(sortedGoodies, (g1, g2) -> Double.compare(g2.getPrice(), g1.getPrice()));

        CandyBags mostExpensiveBags = new CandyBags(n);
        for (int i = 0; i < Math.min(n, sortedGoodies.size()); i++) {
            mostExpensiveBags.add(sortedGoodies.get(i));
        }

        return mostExpensiveBags;
    }
}
