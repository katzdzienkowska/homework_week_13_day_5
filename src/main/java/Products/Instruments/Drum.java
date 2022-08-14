package Products.Instruments;

import Enums.DrumType;

public class Drum extends Instrument{

    private DrumType drumType;
    private int numberOfDrums;

    public Drum(String name, double costPrice, double retailPrice, String colour, DrumType drumType, int numberOfDrums) {
        super(name, costPrice, retailPrice, colour);
        this.drumType = drumType;
        this.numberOfDrums = numberOfDrums;
    }

    public DrumType getDrumType() {
        return drumType;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public String play() {
        return "badum tss";
    }
}
