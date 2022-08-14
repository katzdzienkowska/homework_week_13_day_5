package Products.Instruments;

import Enums.GuitarType;

public class Guitar extends Instrument{

    private GuitarType guitarType;
    private int numberOfStrings;

    public Guitar(String name, double costPrice, double retailPrice, String colour, GuitarType guitarType, int numberOfStrings) {
        super(name, costPrice, retailPrice, colour);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "twang twang";
    }
}
