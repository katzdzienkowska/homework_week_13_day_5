package Products.Instruments;

import Behaviours.IPlay;
import Products.Product;

public class Instrument extends Product implements IPlay {

    private String colour;

    public Instrument(String name, double costPrice, double retailPrice, String colour) {
        super(name, costPrice, retailPrice);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public String play() {
        return "Sound";
    }

}
