package bonus;

public class Mitarbeiter {

    private String vorname;
    private String nachname;
    private int mitarbeiterNummer;
    private double gehalt;
    private int alter;
    private static int s_nummer = 0;

    public Mitarbeiter(String vorname, String nachname, double gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
        mitarbeiterNummer = ++s_nummer;
    }

    public double jahresAbrechnung()
    {
        return monatsAbrechnung() * 12;
    }

    public double jahresAbrechnung (int monate)
    {
        return monatsAbrechnung() * monate;
    }

    public double monatsAbrechnung()
    {
        double jahresGehalt = gehalt * 12;
        double jahresGehaltOhneSV = jahresGehalt * 0.8;

        double steuer = 0;
        if (jahresGehaltOhneSV > 10_000) {
            steuer = (10_000 * 0.1);
            if (jahresGehaltOhneSV > 20_000) {
                steuer += (10_000 * 0.2);
                if (jahresGehaltOhneSV > 30_000) {
                    steuer += (10_000 * 0.32);
                    if (jahresGehaltOhneSV > 50_000) {
                        steuer += ((jahresGehaltOhneSV - 50_000) * 0.6);
                    }
                    else{
                        steuer += (jahresGehaltOhneSV - 30_000) * 0.45;
                    }
                }
                else{
                    steuer += (jahresGehaltOhneSV - 20_000) * 0.32;
                }
            }
            else{
                steuer += (jahresGehaltOhneSV - 10_000) * 0.2;
            }

        }
        else
            steuer = jahresGehaltOhneSV * 0.1;

        return (jahresGehaltOhneSV - steuer) / 12;

    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getMitarbeiterNummer() {
        return mitarbeiterNummer;
    }

    public double getGehalt() {
        return gehalt;
    }

    public int getAlter() {
        return alter;
    }
}
