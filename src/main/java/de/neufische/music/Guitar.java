package de.neufische.music;

import java.util.Objects;

// Mit extends sind alle Methoden von Instrument in Guitar
// Guitar = Kindklasse von Instrument
public class Guitar extends Instrument {

    private int numberOfStrings = 6;

    // Wenn wir einen leeren Konstruktor in der Kindklasse haben (also hier)
    // Dann muss auch die Elternklasse (Instrument) einen leeren Konstruktor haben
    public Guitar() { }

    public Guitar(String type, String brand) {
        super(type, brand);
    }
    // Wir "überladen" die Konstruktoren
    public Guitar(String type, String brand, int numberOfStrings) {
        super(type, brand);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Todayyyy");
    }

    public void play(String songToSing) {
        System.out.println(songToSing);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Guitar guitar = (Guitar) o;
        return numberOfStrings == guitar.numberOfStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfStrings);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                "} " + super.toString();
    }
}
