package first;

public class Jam extends MarketProduct {
    int jar_cnt;
    int price_per_jar;

    public Jam(String name, int jars, int price) {
        super(name, 15);
        this.jar_cnt = jars;
        this.price_per_jar = price;
    }

    public int getCost() {
        int cost;
        cost = this.jar_cnt * this.price_per_jar;
        return cost;
    }

    public int getPrice() {
        return this.price_per_jar;
    }

    public int getCount() {
        return this.jar_cnt;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Jam)) {
            return false;
        }

        if (this.getPrice() != ((Jam) obj).getPrice()) {
            return false;
        }
        if (this.getName() != ((Jam) obj).getName()) {
            return false;
        }
        if (this.getCount() != ((Jam) obj).getCount()) {
            return false;
        }

        return true;
    }
}
