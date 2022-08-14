import Enums.GuitarType;
import Products.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar electricGuitar;

    @Before
    public void before() {
        electricGuitar = new Guitar("Ibanez RG320", 228.00, 459.00,"Matt Black", GuitarType.ELECTRIC, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Ibanez RG320", electricGuitar.getName());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(228.00, electricGuitar.getCostPrice(), 0.0);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(459.00, electricGuitar.getRetailPrice(), 0.0);
    }

    @Test
    public void hasColour() { assertEquals("Matt Black", electricGuitar.getColour()); }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ELECTRIC, electricGuitar.getGuitarType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, electricGuitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(231.00, electricGuitar.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("twang twang", electricGuitar.play());
    }

}
