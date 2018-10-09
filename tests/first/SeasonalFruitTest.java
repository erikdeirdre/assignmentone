package first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeasonalFruitTest {

    @Test
    void getCost() {
        SeasonalFruit blueberry = new SeasonalFruit("Blueberry", 10, 299);
        assertEquals(blueberry.getCost(), 2541);
    }
}