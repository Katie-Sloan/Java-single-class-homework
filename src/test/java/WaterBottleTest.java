import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void setUp() { waterBottle = new WaterBottle(100); }

    @Test
    public void drink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void empty(){
        assertEquals(0, waterBottle.empty());
    }
}
