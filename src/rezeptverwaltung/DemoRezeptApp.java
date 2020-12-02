package rezeptverwaltung;

import java.time.ZonedDateTime;

public class DemoRezeptApp {

    public static void main(String[] args) {

        Zutat butter = new Zutat("Butter", 250);
        Zutat zucker = new Zutat("Zucker", 250);

        Zutat omasGeheimZutat = new Zutat();

        /// ...

        //butter.initialize("Butter", 250);

        System.out.println(butter.toString());
        System.out.println(omasGeheimZutat.toString());
        omasGeheimZutat.initialize("Feenstaub", 100);
        System.out.println(omasGeheimZutat.toString());

        Zutat mehl = new Zutat("Mehl 480 universal", 250);

        int[] arr = {1, 2, 3, 4};
        Zutat[] zutaten = {butter, zucker, mehl, omasGeheimZutat};

        System.out.println();
        Rezept weihnachtsKeks = new Rezept("Weihnachts Keks light", 4, zutaten);
        weihnachtsKeks.printRezept();
    }
}
