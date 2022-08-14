import Enums.DrumType;
import Products.Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drumSet;

    @Before
    public void before() {
        drumSet = new Drum("Roland VAD-706", 3333.00, 6688.00, "Ivory", DrumType.DRUM_KIT, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Roland VAD-706", drumSet.getName());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(3333.00, drumSet.getCostPrice(), 0.0);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(6688.00, drumSet.getRetailPrice(), 0.0);
    }

    @Test
    public void hasColour() {
        assertEquals("Ivory", drumSet.getColour());
    }

    @Test
    public void hasPianoType() {
        assertEquals(DrumType.DRUM_KIT, drumSet.getDrumType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3355.00, drumSet.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("badum tss", drumSet.play());
    }
}
