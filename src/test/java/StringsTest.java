import Enums.AccessoryType;
import Products.Accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before() {
        strings = new Strings("D'Addario", 3.99, 7.99, AccessoryType.GUITAR, 6);
    }

    @Test
    public void hasName() {
        assertEquals("D'Addario", strings.getName());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(3.99, strings.getCostPrice(), 0.0);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(7.99, strings.getRetailPrice(), 0.0);
    }

    @Test
    public void hasAccessoryType() {
        assertEquals(AccessoryType.GUITAR, strings.getAccessoryType());
    }

    @Test
    public void hasStringPack() {
        assertEquals(6, strings.getStringPack());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4, strings.calculateMarkup(), 0.0);
    }
}
