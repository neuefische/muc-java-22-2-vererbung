package de.neufische.recording;

import de.neufische.instrument.Soundable;

public class RecordStudio {

    public void record(Soundable thingThatMakesSound) {
        System.out.println("Recording in progress! Zeichne " + thingThatMakesSound + " auf!");
    }
}
