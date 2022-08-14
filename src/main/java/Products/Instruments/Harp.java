package Products.Instruments;

import Enums.HarpType;

public class Harp extends Instrument{

    private HarpType harpType;

    public Harp(String name, double costPrice, double retailPrice, String colour, HarpType harpType) {
        super(name, costPrice, retailPrice, colour);
        this.harpType = harpType;
    }

    public HarpType getHarpType() {
        return harpType;
    }

    public String play() {
        return "plum plum plum";
    }
}
