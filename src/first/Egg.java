package first;

public class Egg extends MarketProduct {
    private int egg_count;
    private int price_per_dz;

    public Egg(String name, int eggs_needed, int price) {
        super(name, 0);
        this.egg_count = eggs_needed;
        this.price_per_dz = price;
    }

    public int getCost() {
 // Need to make float in order to get proper cost for egg counts less than a dozen.
        float cost;
        cost = (float) this.egg_count * (float) this.price_per_dz / 12;
        return (int) cost;
    }

    public int getPrice() {
        return this.price_per_dz;
    }

    public int getCount() {
        return this.egg_count;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Egg)) {
            return false;
        }

        if (this.getPrice() != ((Egg) obj).getPrice()) {
            return false;
        }
        if (this.getName() != ((Egg) obj).getName()) {
            return false;
        }
        if (this.getCount() != ((Egg) obj).getCount()) {
            return false;
        }

        return true;
    }
}
