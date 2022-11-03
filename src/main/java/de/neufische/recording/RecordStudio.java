package de.neufische.recording;

import de.neufische.instrument.Instrument;
import de.neufische.instrument.Soundmaker;

public class RecordStudio {

    public void record(Soundmaker thingThatMakesSound) {
        System.out.println("Recording in progress! Zeichne " + thingThatMakesSound + " auf!");
    }
}
