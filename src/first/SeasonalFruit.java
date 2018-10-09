package first;

public class SeasonalFruit extends Fruit {
    public SeasonalFruit(String name, double weight, int price) {
        super(name, weight, price);
    }

    public int getCost() {
// Seasonal Fruit has a 15% discount
//TODO: Check the math
        double cost = super.getCost() - super.getCost() * .15;
        return (int) cost;
    }
}
