package Products.Accessories;

import Enums.AccessoryType;
import Products.Product;

public class Accessory extends Product {

    private AccessoryType accessoryType;

    public Accessory(String name, double costPrice, double retailPrice, AccessoryType accessoryType) {
        super(name, costPrice, retailPrice);
        this.accessoryType = accessoryType;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }
}
