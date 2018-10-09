package first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    Basket basket;
    Fruit apple;

    @BeforeEach
    void setUp() {
        basket = new Basket();
        apple = new Fruit("Golden Delicious", 6, 39);
        basket.add(new Jam("Sour Apple Jam", 6, 139));
        basket.add(new Egg("Chicken Egg", 60, 199));
        basket.add(apple);
    }

    @Test
    void getProducts() {
        MarketProduct [] products = basket.getProducts();
        assertEquals(products[0].getCost(), 834);
        assertEquals(products[0].getName(), "Sour Apple Jam");
    }

    @Test
    void remove() {
        basket.remove(apple);
        assertEquals(basket.getNumOfProducts(), 2);

    }

    @Test
    void getNumOfProducts() {
        assertEquals(basket.getNumOfProducts(), 3);
    }

    @Test
    void getSubTotal() {
        assertEquals(basket.getSubTotal(), 2063);
    }

    @Test
    void getTotalTax() {
        assertEquals(basket.getTotalTax(), 125);
    }

    @Test
    void getTotalCost() {
        assertEquals(basket.getTotalCost(), 2188);
    }

}