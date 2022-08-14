import Enums.PianoType;
import Products.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Yamaha CLP795GP", 4299.00, 8499.00,"Polished Ebony", PianoType.GRAND);
    }

    @Test
    public void hasName() {
        assertEquals("Yamaha CLP795GP", piano.getName());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(4299.00, piano.getCostPrice(), 0.0);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(8499.00, piano.getRetailPrice(), 0.0);
    }

    @Test
    public void hasColour() {
        assertEquals("Polished Ebony", piano.getColour());
    }

    @Test
    public void hasPianoType() {
        assertEquals(PianoType.GRAND, piano.getPianoType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4200.00, piano.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("na na na na", piano.play());
    }
}
