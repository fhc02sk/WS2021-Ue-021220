package rezeptverwaltung;

import java.util.Arrays;

public class Rezept {
    private String name;
    private int personen;
    private Zutat[] zutaten; // List von Zutaten, Eier, Mehl, Butter, Wasser ....

    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void printRezept(){
        System.out.println("Name: " + this.name );
        System.out.println("Personen: " + this.personen);
        System.out.println("Zutaten: ");
        for (int i = 0; i < this.zutaten.length; i++) {
            System.out.println(this.zutaten[i].toString());
        }
    }

    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }
}
