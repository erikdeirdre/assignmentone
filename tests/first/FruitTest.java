package first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {
    Fruit orange, apple;
    @BeforeEach
    void setUp() {
        orange = new Fruit("Florida Orange", 2, 69);
        apple = new Fruit("Golden Delicious", 6, 39);
    }

    @Test
    void getCost() {
        assertEquals(orange.getCost(), 138);
        assertEquals(apple.getCost(), 234);
    }

    @Test
    void getPrice() {
        assertEquals(orange.getPrice(), 69);
        assertEquals(apple.getPrice(), 39);
    }

    @Test
    void getCount() {
        assertEquals(orange.getCount(), 2);
        assertEquals(apple.getCount(), 6);
    }

    @Test
    void getName() {
        assertEquals(orange.getName(), "Florida Orange");
        assertEquals(apple.getName(), "Golden Delicious");
    }

    @Test
    void getTaxRate() {
        assertEquals(orange.getTaxRate(), 0);
    }

    @Test
    void equals() {
        assertEquals(orange.equals(orange), true);
        assertEquals(orange.equals(apple), false);
    }
}