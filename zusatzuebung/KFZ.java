package zusatzuebung;

public class KFZ {
	String Kennzeichen;
	int KMStand;
	int KMSeitInsp;
	int AbstandInsp;
	boolean frei;
	int Preis;

	KFZ(String Kennz, int KM) {
		Kennzeichen = Kennz;
		KMStand = KM;
		KMSeitInsp = KM;
		frei = true;
	}

	void vermieten() {
		if (frei) {
			frei = false;
			System.out.println(Kennzeichen + " wird vermietet");
		} else {
			System.out.println(Kennzeichen + " ist bereits vermietet");
		}
	}

	void zurueckgeben(int tage, int gefKM) {
		frei = true;
		KMStand = KMStand + gefKM;
		KMSeitInsp = KMSeitInsp + gefKM;
		System.out.println("Rechnungsbetrag: " + Preisberechnung(tage));
		if (KMSeitInsp > AbstandInsp)
			Inspektion();
	}

	void Inspektion() {
		System.out.println("Inspektion durchfuehren");
		KMSeitInsp = 0;
	}

	int Preisberechnung(int t) {
		return t * Preis;
	}
}
