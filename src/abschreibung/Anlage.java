package abschreibung;

public class Anlage {

	private String bezeichnung;
	private double initalWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	
	public Anlage(String Bezeichnung, double initalWert,
			int nutzungsdauer)
	{
		this.bezeichnung = Bezeichnung;
		this.initalWert = initalWert;
		this.nutzungsdauer = nutzungsdauer;
		this.restWert = initalWert;
		this.alter = 0;
	}

	public String toString() {
		return "Anlage [Bezeichnung=" + bezeichnung + ", initalWert=" + initalWert + ", nutzungsdauer=" + nutzungsdauer
				+ ", restWert=" + restWert + ", alter=" + alter + "]";
	}
	
	public void abschreiben()
	{
		alter++;
		if (alter <= nutzungsdauer)
		{
			restWert = Math.floor(initalWert / nutzungsdauer 
					* (nutzungsdauer - alter));
		}
	}
	
	public void simulate(int maxJahre, int minWert)
	{
		int counter = 1;
		while (counter <= maxJahre && restWert 
				> minWert)
		{
			System.out.println("Vorher > Jahr " + counter + " " + toString());
			abschreiben();		
			System.out.println("Nachher > Jahr " + counter + " " + toString());
			counter++;
		}
	}
	
	public void simulate2(int maxJahre, int minWert)
	{
		for (int i = 0; i <= maxJahre; i++)
		{
			System.out.println("Vorher > Jahr " + i + " " + toString());
			abschreiben();		
			System.out.println("Nachher > Jahr " + i + " " + toString());
		
			if (restWert < minWert 
					|| restWert == 0)
			{
				break;
			}
		}
	}
	
	public Anlage renew(int zusatzWert, int zusatzJahre)
	{
		double neu_initalWert = restWert + zusatzWert;
		int neu_nutzungsdauer = (this.nutzungsdauer - this.alter)
				+ zusatzJahre;
		
		Anlage neueAnlage = new Anlage(this.bezeichnung,
				neu_initalWert, neu_nutzungsdauer);
		
		return neueAnlage;
	}
	
}
