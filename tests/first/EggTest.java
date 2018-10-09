package first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EggTest {
    private Egg quail, hen, hen2;

    @BeforeEach
    void setUp() {
        quail = new Egg("Quail Egg", 24, 299);
        hen = new Egg("Chicken Egg", 60, 199);
        hen2 = new Egg("Chicken Egg", 6, 199);
    }

    @Test
    void getCost() {
        assertEquals(quail.getCost(),598);
        assertEquals(hen.getCost(),995);
        assertEquals(hen2.getCost(),99);

    }

    @Test
    void getPrice() {
        assertEquals(quail.getPrice(),299);
        assertEquals(hen.getPrice(),199);
    }

    @Test
    void getCount() {
        assertEquals(quail.getCount(),24);
        assertEquals(hen.getCount(),60);
        assertEquals(hen2.getCount(),6);
    }

    @Test
    void getName() {
        assertEquals(quail.getName(),"Quail Egg");
        assertEquals(hen.getName(),"Chicken Egg");
    }

    @Test
    void getTaxRate() {
        assertEquals(quail.getTaxRate(),0);
    }

    @Test
    void equals() {
        assertEquals(hen.equals(hen), true);
        assertEquals(hen.equals(hen2), false);
    }
}