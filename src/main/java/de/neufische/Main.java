package de.neufische;

import de.neufische.music.Instrument;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instrument = Der Typ unseres Objektes
        // guitar = Name unserer Instanz (der Variable)
        // mit "new" rufen wir den Konstruktor der Klasse Instrument auf
        // und übergeben Parameter für das Objekt
        Instrument guitar
                = new Instrument("Gitarre", "Ibanez");

        guitar.play();
    }
}