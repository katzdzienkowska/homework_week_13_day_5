package Products.Instruments;

import Enums.PianoType;

public class Piano extends Instrument{

    private PianoType pianoType;

    public Piano(String name, double costPrice, double retailPrice, String colour, PianoType pianoType) {
        super(name, costPrice, retailPrice, colour);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public String play() {
        return "na na na na";
    }
}
