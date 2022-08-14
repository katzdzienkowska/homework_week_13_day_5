import Behaviours.ISell;
import Enums.*;
import Products.Accessories.SheetMusic;
import Products.Accessories.Stand;
import Products.Accessories.Strings;
import Products.Instruments.Drum;
import Products.Instruments.Guitar;
import Products.Instruments.Harp;
import Products.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell guitar;
    ISell harp;
    ISell drums;
    ISell piano;
    ISell stringPack;
    ISell stand;
    ISell sheetMusic;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange", 4000);
        guitar = new Guitar("Ibanez RG320", 228.00, 459.00,"Matt Black", GuitarType.ELECTRIC, 6);
        harp = new Harp("Ms Hammond", 10556.00, 22999.00, "Red Mahoney", HarpType.PEDAL_HARP_47);
        drums = new Drum("Roland VAD-706", 3333.00, 6688.00, "Ivory", DrumType.DRUM_KIT, 5);
        piano = new Piano("Yamaha CLP795GP", 4299.00, 8499.00,"Polished Ebony", PianoType.GRAND);
        stringPack = new Strings("D'Addario", 3.99, 7.99, AccessoryType.GUITAR, 6);
        stand = new Stand("Guitar Floor Stand", 9.95, 20.50, AccessoryType.GUITAR, 10);
        sheetMusic = new SheetMusic("Piano Sheet Music", 12.50, 25.00, AccessoryType.PIANO, "Chopin: Nucturnes", 134);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(4000, shop.getTill(), 0.0);
    }

    @Test
    public void hasNoStock() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddProductToStock() {
        assertEquals(0, shop.getStockCount());
        shop.addProductToStock(guitar);
        shop.addProductToStock(piano);
        shop.addProductToStock(stand);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canRemoveProductFromStock() {
        assertEquals(0, shop.getStockCount());
        shop.addProductToStock(guitar);
        shop.addProductToStock(piano);
        shop.addProductToStock(harp);
        shop.addProductToStock(stand);
        shop.addProductToStock(stringPack);
        assertEquals(5, shop.getStockCount());
        shop.removeProductFromStock(harp);
        shop.removeProductFromStock(piano);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canCalculateProfit() {
        shop.addProductToStock(guitar);
        shop.addProductToStock(piano);
        shop.addProductToStock(harp);
        assertEquals(16874, shop.calculateProfit(), 0.0);
    }
}
