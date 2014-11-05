package zusatzuebung;

public class PKW extends KFZ {
	static int verfuegbar = 0; // nur fuer Teil b)

	PKW(String Kennz, int KM) {
		super(Kennz, KM);
		AbstandInsp = 30000;
		Preis = 30;
		verfuegbar = verfuegbar + 1; // Teil b)
	}

	void zurueckgeben(int tage, int gefKM) {
		super.zurueckgeben(tage, gefKM);
		waschen();
		// fuer Teil b)
		verfuegbar = verfuegbar + 1;
	}

	void waschen() {
		System.out.println(Kennzeichen + " wird gewaschen");
	}

	// fuer Teil b)
	void vermieten() {
		if (frei)
			verfuegbar = verfuegbar - 1;
		super.vermieten();
	}
}