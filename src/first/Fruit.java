package first;

public class Fruit extends MarketProduct {
    private double weight_kg;
    private int price_per_kg;

    public Fruit(String name, double weight, int price) {
        super(name, 0);
        this.weight_kg = weight;
        this.price_per_kg = price;
    }

    public int getCost() {
        double cost = this.price_per_kg * this.weight_kg;
        return (int)cost;
    }

    public int getPrice() {
        return this.price_per_kg;
    }

    public double getCount() {
        return this.weight_kg;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Fruit)) {
            return false;
        }

        if (this.getPrice() != ((Fruit) obj).getPrice()) {
            return false;
        }
        if (this.getName() != ((Fruit) obj).getName()) {
            return false;
        }
        if (this.getCount() != ((Fruit) obj).getCount()) {
            return false;
        }

        return true;
    }
}
