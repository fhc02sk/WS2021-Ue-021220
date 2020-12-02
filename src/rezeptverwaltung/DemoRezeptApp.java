package rezeptverwaltung;

import java.time.ZonedDateTime;
import java.util.Arrays;

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

        Zutat[] zutaten = {butter, zucker, mehl, omasGeheimZutat};

        System.out.println();
        Rezept weihnachtsKeks = new Rezept("Weihnachts Keks light", 4, zutaten);
        weihnachtsKeks.printRezept();
        
        Rezept wk10 = weihnachtsKeks.umrechnen(10);
        wk10.printRezept();
        weihnachtsKeks.printRezept();





        /* Initialisierung Array */
        int[] arr1 = new int[] { 1, 2, 3, 4, 5};    // Variante 1
        int[] arr2 = {1, 2, 3, 4, 5};               // Variante 2
        int[] arr3 = new int[5];                    // Variante 3
        arr3[0] = 1; 
        arr3[1] = 2;
        arr3[2] = 3; arr3[3] = 4; arr3[4] = 5;

    }
}
