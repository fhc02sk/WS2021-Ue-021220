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

    public Rezept umrechnen (int personen) {
        // Umrechnenfaktor berechnen und speichern personen / this.personen
                        // 8 / 2 = 4
                        // 4 / 8 = 0,5
        double faktor = personen / (getPersonen() * 1.0);
//        double faktor1 = personen / ((double)getPersonen());

        Zutat[] neueZutaten = new Zutat[this.zutaten.length];
        for (int i = 0; i < this.zutaten.length; i++){
            neueZutaten[i] = new Zutat(
                    this.zutaten[i].getName(),
                    (int) (this.zutaten[i].getMenge() * faktor)
            );
        }

        // neues Rezept Objekt anlegen
        Rezept neu = new Rezept(this.name, personen, neueZutaten);

        // Zutat für Zutat übernehmen und mit Umrechenfaktor neu berechnen
        /*for (int i = 0; i < neu.getZutaten().length; i++){
            Zutat z = neu.getZutaten()[i]; // Zutat um Zutat wird in z geschrieben
            int menge = z.getMenge();
            menge = (int) (menge * faktor);
            z.setMenge(menge);
        }*/

        return neu;
    }

    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }
}
