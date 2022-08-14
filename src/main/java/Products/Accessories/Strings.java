package Products.Accessories;

import Enums.AccessoryType;

public class Strings extends Accessory{

    private int stringPack;

    public Strings(String name, double costPrice, double retailPrice, AccessoryType accessoryType, int stringPack) {
        super(name, costPrice, retailPrice, accessoryType);
        this.stringPack = stringPack;
    }

    public int getStringPack() {
        return stringPack;
    }
}
