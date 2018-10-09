package first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;
    int starting_bal = 10000;
    Fruit apple;
    @BeforeEach
    void setUp() {
        customer = new Customer("Homer Simpson", starting_bal);
        apple = new Fruit("Golden Delicious", 6, 39);
        SeasonalFruit blueberry = new SeasonalFruit("Blueberry", 2, 140);
        customer.addToBasket(new Jam("Sour Apple Jam", 6, 139));
        customer.addToBasket(new Egg("Chicken Egg", 60, 199));
        customer.addToBasket(apple);
        customer.addToBasket(blueberry);
    }

    @Test
    void getName() {
        assertEquals(customer.getName(), "Homer Simpson");
    }

    @Test
    void getBalance() {
        assertEquals(customer.getBalance(), starting_bal);
    }

    @Test
    void getBasket() {
        Basket temp = customer.getBasket();
        assertEquals(temp.getProducts().length, 4);
    }

    @Test
    void addFunds() {
        customer.addFunds(2000);
        assertEquals(customer.getBalance(), starting_bal + 2000);
    }

    @Test
    void addToBasket() {
        customer.addToBasket(new Fruit("Orange", 1, 69));
        Basket temp = customer.getBasket();
        assertEquals(temp.getProducts().length, 5);
    }

    @Test
    void removeFromBasket() {
        customer.removeFromBasket(this.apple);
        Basket temp = customer.getBasket();
        assertEquals(temp.getProducts().length, 3);
    }

    @Test
    void checkOut() {
        System.out.println(customer.checkOut());
    }
}