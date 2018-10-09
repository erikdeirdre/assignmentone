package first;

public abstract class MarketProduct {
    private String name;
    private int taxRate;

    public MarketProduct(String name, int taxRate) {
        this.name = name;
        this.taxRate = taxRate;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTaxRate() {
        return this.taxRate;
    }

    public abstract int getCost();

    public abstract boolean equals(Object obj);

}
