package bonus;

public class DemoApp {

    public static void main(String[] args) {

        Mitarbeiter susi = new Mitarbeiter("Susi", "Sorglos", 28_000.0 / 12.0);

        System.out.println(susi.monatsAbrechnung());

    }
}
