package orderservice;

public class Bestellung {
    private String nummer;
    private Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }

    public int getKosten(){
        int summeBestellung = 0;

        for (int i = 0; i < this.zeilen.length; i++) {
            Bestellzeile bz = this.zeilen[i];
            summeBestellung = summeBestellung + bz.getKosten();
        }
        return summeBestellung;
    }

    public double getAverageCosts(){
        // Liefert die durchschnittlichen Kosten je Bestellzeile
        return getKosten() / (this.zeilen.length * 1.0);
    }

    public void printBestellung(){
        System.out.println("Nummer: " + this.nummer);
        for (int i = 0; i < this.zeilen.length; i++){
            Bestellzeile bz = this.zeilen[i]; // Bestellzeile für Bestellzeile aus dem Array
            System.out.println(bz.getName() + " - "
                    + bz.getMenge() + " Stück zu je "
                    + bz.getPreis() + " EUR = " + bz.getKosten() + " EUR ");
        }

        System.out.println("Gesamtpreis: " + getKosten() + " EUR");
        System.out.println("Avg: " + getAverageCosts() + " EUR");
    }
}
