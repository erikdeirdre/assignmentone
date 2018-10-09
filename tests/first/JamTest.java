package first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JamTest {
    Jam strawberry, apple;

    @BeforeEach
    void setUp() {
        strawberry = new Jam("Strawberry Jam", 2, 169);
        apple = new Jam("Sour Apple Jam", 6, 139);
    }

    @Test
    void getPrice() {
        assertEquals(strawberry.getPrice(), 169);
        assertEquals(apple.getPrice(), 139);
    }

    @Test
    void getCount() {
        assertEquals(strawberry.getCount(), 2);
        assertEquals(apple.getCount(), 6);
    }

    @Test
    void getName() {
        assertEquals(strawberry.getName(), "Strawberry Jam");
        assertEquals(apple.getName(), "Sour Apple Jam");
    }

    @Test
    void getTaxRate() {
        assertEquals(strawberry.getTaxRate(), 15);
    }

    @Test
    void getCost() {
        assertEquals(strawberry.getCost(), 338);
        assertEquals(apple.getCost(), 834);
    }

    @Test
    void equals() {
        assertEquals(strawberry.equals(strawberry), true);
        assertEquals(apple.equals(strawberry), false);
    }
}