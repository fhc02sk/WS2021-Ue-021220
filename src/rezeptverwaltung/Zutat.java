package rezeptverwaltung;

/*
    - Klassenname beginnt mit Großbuchen
    - Klassenname muss dem Dateinamen entsprechen
    - erste Zeile ist der package Name
 */
public class Zutat {
    // Attribut:
    // access_modifier (static) datatype name;
    // private => nur innerhalb der Klasse sichtbar / verwendbar
    // public => auch außerhalb sichtbar/verwendbar

    private String name;
    private int menge;

    // Konstruktor
    // access_modifier (keinen Rückgabetyp) heißt wie die Klasse, kann Parameter entgegen nehmen
    // eine besondere Aufgabe => bei new... erstellt der Konstruktor das Objekt
    public Zutat(String name, int menge){
        this.name = name;
        this.menge = menge;
    }

    public Zutat(){ // Dieser Konstruktor wurde überladen. Überladen bedeutet, gleicher Name, unterschiedliche Parameter
        this.name = "noch nicht definiert";
        this.menge = -1;
    }

    public void initialize(String name, int menge){
        this.name = name;
        this.menge = menge;
    }

    // Methode:
    // Ändert den inneren Zustand der Klasse
    // access_modifier (static) return_type methodName(parameters 0...n)
    public String getName() {
        return this.name;
    }

    public int getMenge() {
        return this.menge;
    }

    // Alt-Einfügen

    public void setName(String name) {
        this.name = name;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }


    public String toString() {
        return "Zutat{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                '}';
    }
}
