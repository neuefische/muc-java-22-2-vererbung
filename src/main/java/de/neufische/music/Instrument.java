package de.neufische.music;

import java.util.Objects;

// abstract = Wir können keine konkreten Objekte davon erstellen
public abstract class Instrument {

    // private = Damit die Variablen nur innerhalb der Klasse bearbeitbar sind
    // d.h. NICHT von außen zugreifbar
    private String type;
    private String brand;

    // Warum wir den brauchen - kommt später ;)
    public Instrument() { }

    // Mit dem Konstruktor werden die privaten Attribute mit Parametern initialisiert
    public Instrument(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    // HEY! Es GIBT diese Methode und alle Kinder müssen sie selbst implementieren
    public abstract void play();

    // Getter & Setter - erlauben den öffentlichen Zugriff auf private Attribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(type, that.type) && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand);
    }

    // Gibt die Eigenschaften des Objekts in einer anschaulichen Art & Weise aus
    @Override
    public String toString() {
        return "Instrument{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }


}
