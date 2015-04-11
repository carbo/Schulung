package zusatzuebung;

public class LKW extends KFZ {
	static int verfuegbar = 0; // nur fuer Teil b)
	int Nutzlast;

	LKW(String Kennz, int KM, int last) {
		super(Kennz, KM);
		Nutzlast = last;
		AbstandInsp = 20000;
		if (Nutzlast > 1800)
			Preis = 80;
		else
			Preis = 50;
		verfuegbar = verfuegbar + 1; // Teil b)
	}

	// fuer Teil b)
	@Override
	void vermieten() {
		if (frei)
			verfuegbar = verfuegbar - 1;
		super.vermieten();
	}

	@Override
	void zurueckgeben(int tage, int gefKM) {
		super.zurueckgeben(tage, gefKM);
		verfuegbar = verfuegbar + 1;
	}
}
