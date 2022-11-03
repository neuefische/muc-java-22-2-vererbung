package de.neufische;

import de.neufische.music.Guitar;
import de.neufische.music.Instrument;
import de.neufische.music.Piano;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instrument = Der Typ unseres Objektes
        // instrument = Name unserer Instanz (der Variable)
        // mit "new" rufen wir den Konstruktor der Klasse Instrument auf
        // und übergeben Parameter für das Objekt
        Instrument instrument
                = new Guitar("Gitarre", "Ibanez");
        instrument.play();

        // Achte = Guitar = groß geschrieben, weil Klasse gemeint
        Guitar guitar = new Guitar();

        Piano piano = new Piano();
        piano.getBrand();
        piano.play();

//        guitar.play();
//        guitar.play("Smoke On The Water");

//        System.out.println("Ibanez - " + guitar);
    }
}