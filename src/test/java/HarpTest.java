import Enums.HarpType;
import Products.Instruments.Harp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {

    Harp harp;

    @Before
    public void before() {
        harp = new Harp("Ms Hammond", 10556.00, 22999.00, "Red Mahoney", HarpType.PEDAL_HARP_47);
    }

    @Test
    public void hasName() {
        assertEquals("Ms Hammond", harp.getName());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(10556.00, harp.getCostPrice(), 0.0);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(22999.00, harp.getRetailPrice(), 0.0);
    }

    @Test
    public void hasColour() {
        assertEquals("Red Mahoney", harp.getColour());
    }

    @Test
    public void hasPianoType() {
        assertEquals(HarpType.PEDAL_HARP_47, harp.getHarpType());
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(12443.00, harp.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("plum plum plum", harp.play());
    }
}
