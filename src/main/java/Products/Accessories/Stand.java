package Products.Accessories;

import Enums.AccessoryType;

public class Stand extends Accessory{

    private int weightCapacity;

    public Stand(String name, double costPrice, double retailPrice, AccessoryType accessoryType, int weightCapacity) {
        super(name, costPrice, retailPrice, accessoryType);
        this.weightCapacity = weightCapacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }
}
