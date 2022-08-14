package Products.Accessories;

import Enums.AccessoryType;

public class SheetMusic extends Accessory{

    private String title;
    private int numberOfPages;

    public SheetMusic(String name, double costPrice, double retailPrice, AccessoryType accessoryType, String title, int numberOfPages) {
        super(name, costPrice, retailPrice, accessoryType);
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
