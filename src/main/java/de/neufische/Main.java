package de.neufische;

import de.neufische.instrument.*;
import de.neufische.recording.RecordStudio;

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










        // Student student1 = new SportStudent();
        // Student student2 = new ArtStudent();


        Instrument instrument2 = new Guitar();
        Instrument instrument3 = new Piano();

        // Wir merken uns:
        //        Auf der linken Seite stehen die Eltern
        //        Auf der rechten Seite steht das konkrete Kind

        List<String> irgendeineListe = new ArrayList<>();
//        List<String> irgendeineListe2 = new <>();
        Object o = new String();

























        Instrument schecter
                = new Guitar("Gitarre", "Schecter");
        Soundable butterkeksDose = new HomeDrum();

        RecordStudio recordStudio = new RecordStudio();
        recordStudio.record(schecter);
        recordStudio.record(piano);
        recordStudio.record(guitar);
        recordStudio.record(instrument3);
        recordStudio.record(butterkeksDose);




    }
}