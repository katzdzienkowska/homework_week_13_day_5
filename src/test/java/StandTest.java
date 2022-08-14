import Enums.AccessoryType;
import Products.Accessories.Stand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandTest {

    Stand stand;

    @Before
    public void before() {
        stand = new Stand("Guitar Floor Stand", 9.95, 20.50, AccessoryType.GUITAR, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Guitar Floor Stand", stand.getName());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(9.95, stand.getCostPrice(), 0.0);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(20.50, stand.getRetailPrice(), 0.0);
    }

    @Test
    public void hasAccessoryType() {
        assertEquals(AccessoryType.GUITAR, stand.getAccessoryType());
    }

    @Test
    public void hasWeightCapacity() {
        assertEquals(10, stand.getWeightCapacity());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10.55, stand.calculateMarkup(), 0.0);
    }

}
