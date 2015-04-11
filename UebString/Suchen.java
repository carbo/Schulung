package UebString;

public class Suchen {
	
	public static void main(String args[]) {
		Suchen suchen = new Suchen();
		System.out.println(suchen.suche("Das geht alles", "alles"));
	}
	public boolean suche(String s1, String s2) {
		boolean ergebnis = false;
		int count = 0;
		// Vergleichsposition zeigt
		while (count <= (s1.length() - s2.length())) {
			int innercount = 0;
			while (innercount < s2.length()) {
				if (s1.charAt(count + innercount) == s2.charAt(innercount)) {
					innercount++;
					if (innercount == s2.length())
						if (innercount == s2.length())

							ergebnis = true;
				} else
					innercount = s2.length();
			}
			count++;
		}
		return ergebnis;
	}

}
