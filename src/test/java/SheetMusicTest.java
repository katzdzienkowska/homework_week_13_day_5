import Enums.AccessoryType;
import Products.Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Piano Sheet Music", 12.50, 25.00, AccessoryType.PIANO, "Chopin: Nucturnes", 134);
    }

    @Test
    public void hasName() {
        assertEquals("Piano Sheet Music", sheetMusic.getName());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(12.50, sheetMusic.getCostPrice(), 0.0);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(25.00, sheetMusic.getRetailPrice(), 0.0);
    }

    @Test
    public void hasAccessoryType() {
        assertEquals(AccessoryType.PIANO, sheetMusic.getAccessoryType());
    }

    @Test
    public void hasTitle() {
        assertEquals("Chopin: Nucturnes", sheetMusic.getTitle());
    }

    @Test
    public void hasNumberOfPages() {
        assertEquals(134, sheetMusic.getNumberOfPages());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(12.50, sheetMusic.calculateMarkup(), 0.0);
    }
}
