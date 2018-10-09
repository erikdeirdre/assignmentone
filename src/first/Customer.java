package first;

public class Customer {
    private String name;
    private int balance;
    private Basket basket;

    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.basket = new Basket();
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public Basket getBasket() {
        return this.basket;
    }

    public int addFunds(int more_money) {
        if (more_money < 0) {
            throw new IllegalArgumentException("Funds need to be a positive number");
        }

        this.balance+= more_money;

        return this.balance;
    }

    public void addToBasket(MarketProduct product) {
        this.basket.add(product);
    }

    public boolean removeFromBasket(MarketProduct product) {
        return this.basket.remove(product);
    }

    public String checkOut() {
        if (this.basket.getTotalCost() > this.balance) {
            throw new IllegalStateException("Cost of Goods exceeds Customer Balance");
        }

        this.balance = this.balance - this.basket.getTotalCost();

        String receipt = this.basket.toString();

        this.basket.clear();

        return receipt;
    }
}
